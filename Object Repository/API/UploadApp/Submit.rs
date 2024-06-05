<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Submit</name>
   <tag></tag>
   <elementGuidId>b773c94a-7f4f-4e4a-b6dd-0d2ebb1a0ba3</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <smartLocatorEnabled>false</smartLocatorEnabled>
   <useRalativeImagePath>false</useRalativeImagePath>
   <authorizationRequest>
      <authorizationInfo>
         <entry>
            <key>bearerToken</key>
            <value>${bearer}</value>
         </entry>
      </authorizationInfo>
      <authorizationType>Bearer</authorizationType>
   </authorizationRequest>
   <autoUpdateContent>false</autoUpdateContent>
   <connectionTimeout>-1</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n\&quot;storagePath\&quot;: \&quot;${storagePath}\&quot;,\n\&quot;fileName\&quot;: \&quot;${appName}\&quot;,\n\&quot;organizationId\&quot;: ${orgId}\n}&quot;,
  &quot;contentType&quot;: &quot;application/json&quot;,
  &quot;charset&quot;: &quot;UTF-8&quot;
}</httpBodyContent>
   <httpBodyType>text</httpBodyType>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Content-Type</name>
      <type>Main</type>
      <value>application/json</value>
      <webElementGuid>9103fd3e-e76a-4b0b-beaf-24772dc3d741</webElementGuid>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Authorization</name>
      <type>Main</type>
      <value>Bearer ${bearer}</value>
      <webElementGuid>bb2f35ec-0b32-4081-b8d2-5c529ec1f090</webElementGuid>
   </httpHeaderProperties>
   <katalonVersion>9.4.0</katalonVersion>
   <maxResponseSize>-1</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <path></path>
   <restRequestMethod>POST</restRequestMethod>
   <restUrl>https://testcloud.katalon.com/ees/apps</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceEndpoint></soapServiceEndpoint>
   <soapServiceFunction></soapServiceFunction>
   <socketTimeout>-1</socketTimeout>
   <useServiceInfoFromWsdl>true</useServiceInfoFromWsdl>
   <variables>
      <defaultValue>GlobalVariable.uploadBearer</defaultValue>
      <description></description>
      <id>abbbe2a5-0ccd-4148-a147-3b8517bda0be</id>
      <masked>false</masked>
      <name>bearer</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.storagePath</defaultValue>
      <description></description>
      <id>8f3291c4-92b8-4737-bb44-45748e9b91c4</id>
      <masked>false</masked>
      <name>storagePath</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.appName</defaultValue>
      <description></description>
      <id>f18dc873-a814-444e-a45f-68c1e9937c91</id>
      <masked>false</masked>
      <name>appName</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.orgId</defaultValue>
      <description></description>
      <id>52ee7c40-18ad-4171-b7a0-2f1608087b13</id>
      <masked>false</masked>
      <name>orgId</name>
   </variables>
   <verificationScript>import static org.assertj.core.api.Assertions.*

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webservice.verification.WSResponseManager

import groovy.json.JsonSlurper
import internal.GlobalVariable as GlobalVariable

RequestObject request = WSResponseManager.getInstance().getCurrentRequest()

ResponseObject response = WSResponseManager.getInstance().getCurrentResponse()</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
