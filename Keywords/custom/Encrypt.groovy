package custom

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.RestRequestObjectBuilder
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.testobject.TestObjectProperty
import com.kms.katalon.core.testobject.impl.HttpTextBodyContent
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import javax.crypto.Mac
import javax.crypto.spec.SecretKeySpec
import javax.xml.bind.DatatypeConverter

import internal.GlobalVariable

public class Encrypt {

	def firstKey = 'j9B2Lkq7a48np5cP'
	def secondKey = 'MTW3LuemEKg2nr7a'
	def salt = 'tSCG6TesH8bPxMn5'

	def calculateHMACSHA512(String text) {
		def hmacsha512 = firstKey.getBytes('UTF-8')
		def hash = Mac.getInstance("HmacSHA512")
		hash.init(new SecretKeySpec(hmacsha512, "HmacSHA512"))
		def hashBytes = hash.doFinal(text.getBytes('UTF-8'))
		return DatatypeConverter.printBase64Binary(hashBytes)
	}

	def calculateHMACSHA512WithSecondKey(String text) {
		def hmacsha5121 = secondKey.getBytes('UTF-8')
		def hash = calculateHMACSHA512(text)
		def hashBytes = DatatypeConverter.parseBase64Binary(hash)
		def finalHash = Mac.getInstance("HmacSHA512")
		finalHash.init(new SecretKeySpec(hmacsha5121, "HmacSHA512"))
		def finalHashBytes = finalHash.doFinal(hashBytes)
		return DatatypeConverter.printBase64Binary(finalHashBytes)
	}

	def Map<String, String> sortObjKeysAlphabetically(Map<String, String> map)  {
		map.sort { a, b -> a.key <=> b.key }
	}


	@Keyword
	def ResponseObject sendEncryptedRequest(TestObject to) {

		RequestObject ro = (RequestObject) to

		URL url = new URL(ro.getRestUrl())
		String query = url.getQuery()

		String toEncodeQueryParams = ""
		def queryParamsMap = [:]

		if (query != null && !query.equals("")) {
			query.split('&').each { param ->
				def (key, value) = param.split('=')
				queryParamsMap[URLDecoder.decode(key, 'UTF-8')] = URLDecoder.decode(value, 'UTF-8')
			}
		}

		Map<String, String> sortedQueryParams = sortObjKeysAlphabetically(queryParamsMap)
		for (String queryParam : sortedQueryParams.keySet()) toEncodeQueryParams += queryParam+"="+sortedQueryParams.get(queryParam)

		String body = ((HttpTextBodyContent) ro.getBodyContent()).getText()

		String toEncode = toEncodeQueryParams + (body==null)?salt:(body+salt)

		String signature = calculateHMACSHA512WithSecondKey(toEncode)

		List<TestObjectProperty> httpHeaders = ro.getHttpHeaderProperties()
		TestObjectProperty top = new TestObjectProperty("signature", ConditionType.EQUALS, signature)
		httpHeaders.add(top)

		return WS.sendRequest(ro)
	}
}
