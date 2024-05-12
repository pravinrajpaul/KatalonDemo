<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Create and save a scheduled configuration</name>
   <tag></tag>
   <elementGuidId>4476dedc-d601-477f-9e7b-3d9d70848e3b</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <smartLocatorEnabled>false</smartLocatorEnabled>
   <useRalativeImagePath>false</useRalativeImagePath>
   <autoUpdateContent>true</autoUpdateContent>
   <connectionTimeout>-1</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\r\n    \&quot;name\&quot;: \&quot;Win test API 25102023\&quot;,\r\n    \&quot;teamId\&quot;: \&quot;267\&quot;,\r\n    \&quot;projectId\&quot;: \&quot;267\&quot;,\r\n    \&quot;testProjectId\&quot;: 269,\r\n    \&quot;testCloudAgents\&quot;: [\r\n        {\r\n            \&quot;osVersion\&quot;: \&quot;17\&quot;,\r\n            \&quot;deviceName\&quot;: \&quot;Apple iPhone 15 Pro Max\&quot;,\r\n            \&quot;deviceType\&quot;: false,\r\n            \&quot;deviceId\&quot;: \&quot;apple_iphone_15_pro_max\&quot;,\r\n            \&quot;appId\&quot;: \&quot;5bd80e7f-ca3b-4fe3-a3b2-d60a1e8d400a\&quot;,\r\n            \&quot;appName\&quot;: \&quot;My Flow Self Care\&quot;,\r\n            \&quot;cloudType\&quot;: \&quot;TEST_CLOUD_AGENT\&quot;,\r\n            \&quot;enabledTestCloudTunnel\&quot;: false,\r\n            \&quot;runType\&quot;: \&quot;MOBILE_NATIVE_APP\&quot;,\r\n            \&quot;deviceUniqueName\&quot;: \&quot;iPhone 15 Pro Max\&quot;,\r\n            \&quot;os\&quot;: \&quot;ios\&quot;,\r\n            \&quot;browser\&quot;: \&quot;safari\&quot;,\r\n            \&quot;browserVersion\&quot;: \&quot;latest\&quot;,\r\n            \&quot;browserType\&quot;: \&quot;ALL\&quot;,\r\n            \&quot;metadata\&quot;: {}\r\n        }\r\n    ],\r\n    \&quot;cloudType\&quot;: \&quot;TEST_CLOUD_AGENT\&quot;,\r\n    \&quot;browserType\&quot;: \&quot;ALL\&quot;,\r\n    \&quot;executionProfileId\&quot;: 236,\r\n    \&quot;configType\&quot;: \&quot;TEST_SUITE\&quot;,\r\n    \&quot;testSuiteId\&quot;: 708,\r\n    \&quot;ksVersion\&quot;: \&quot;8.6.8\&quot;,\r\n    \&quot;timeOut\&quot;: 180,\r\n    \&quot;executionMode\&quot;: \&quot;SEQUENTIAL\&quot;,\r\n    \&quot;enabledKobitonIntegration\&quot;: false,\r\n    \&quot;enabledTestCloudTunnel\&quot;: false,\r\n    \&quot;baselineCollectionGroupOrder\&quot;: null,\r\n    \&quot;xrayImportReportType\&quot;: \&quot;PUSH_MANUALLY\&quot;,\r\n    \&quot;testRunConfig\&quot;: {\r\n        \&quot;executionType\&quot;: \&quot;G4\&quot;,\r\n        \&quot;executionMetadata\&quot;: {\r\n            \&quot;agentType\&quot;: \&quot;TEST_CLOUD\&quot;,\r\n            \&quot;engine\&quot;: {\r\n                \&quot;type\&quot;: \&quot;G4\&quot;,\r\n                \&quot;version\&quot;: \&quot;8.6.8\&quot;\r\n            },\r\n            \&quot;config\&quot;: {\r\n                \&quot;testSuiteId\&quot;: 708,\r\n                \&quot;executionEnvs\&quot;: [\r\n                    {\r\n                        \&quot;platform\&quot;: \&quot;ios\&quot;,\r\n                        \&quot;platformVersion\&quot;: \&quot;17\&quot;,\r\n                        \&quot;framework\&quot;: \&quot;SELENIUM\&quot;\r\n                    }\r\n                ]\r\n            }\r\n        },\r\n        \&quot;settings\&quot;: {\r\n            \&quot;executionMode\&quot;: \&quot;SEQUENTIAL\&quot;,\r\n            \&quot;enabledKobitonIntegration\&quot;: false,\r\n            \&quot;enabledTestCloudTunnel\&quot;: false\r\n        },\r\n        \&quot;scheduler\&quot;: {\r\n            \&quot;startTime\&quot;: \&quot;2023-10-25T07:02:22.021Z\&quot;,\r\n            \&quot;repeatEnable\&quot;: false,\r\n            \&quot;active\&quot;: false\r\n        }\r\n    }\r\n}&quot;,
  &quot;contentType&quot;: &quot;text/plain&quot;,
  &quot;charset&quot;: &quot;UTF-8&quot;
}</httpBodyContent>
   <httpBodyType>text</httpBodyType>
   <httpHeaderProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Authorization</name>
      <type>Main</type>
      <value>Basic cHJhdmluLnJhdmVlbmRyYW5Aa2F0YWxvbi5jb206QXByaWxAMjAyMw==</value>
      <webElementGuid>8bafaa50-01c2-4e29-8b51-75024f3e61c0</webElementGuid>
   </httpHeaderProperties>
   <katalonVersion>9.4.1</katalonVersion>
   <maxResponseSize>-1</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <path></path>
   <restRequestMethod>POST</restRequestMethod>
   <restUrl>https://testops.katalon.io/api/v1/smart-scheduler/save-configuration?verifyRunConfiguration=false</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceEndpoint></soapServiceEndpoint>
   <soapServiceFunction></soapServiceFunction>
   <socketTimeout>-1</socketTimeout>
   <useServiceInfoFromWsdl>true</useServiceInfoFromWsdl>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
