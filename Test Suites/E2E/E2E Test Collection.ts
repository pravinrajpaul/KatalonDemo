<?xml version="1.0" encoding="UTF-8"?>
<TestSuiteCollectionEntity>
   <description></description>
   <name>E2E Test Collection</name>
   <tag></tag>
   <delayBetweenInstances>0</delayBetweenInstances>
   <executionMode>SEQUENTIAL</executionMode>
   <maxConcurrentInstances>2</maxConcurrentInstances>
   <testSuiteRunConfigurations>
      <TestSuiteRunConfiguration>
         <configuration>
            <groupName>Web Desktop</groupName>
            <profileName>default</profileName>
            <requireConfigurationData>true</requireConfigurationData>
            <runConfigurationData>
               <entry>
                  <key>testCloudMobileDevice</key>
                  <value>{
  &quot;id&quot;: &quot;google_pixel_6&quot;,
  &quot;isTablet&quot;: false,
  &quot;manufacturer&quot;: [
    &quot;Google&quot;
  ],
  &quot;name&quot;: &quot;Pixel 6&quot;,
  &quot;osVersion&quot;: &quot;12&quot;,
  &quot;mobileDeviceId&quot;: &quot;Pixel_6_android_12&quot;,
  &quot;capability&quot;: {},
  &quot;os&quot;: &quot;Android&quot;,
  &quot;platformName&quot;: &quot;ANDROID&quot;,
  &quot;timeout&quot;: 15,
  &quot;usingTunnel&quot;: false
}</value>
               </entry>
               <entry>
                  <key>testCloudSessionType</key>
                  <value>MOBILE_NATIVE</value>
               </entry>
               <entry>
                  <key>testCloudOverrideMobileApplication</key>
                  <value>{&quot;id&quot;:&quot;2cb56193-de84-4659-8f70-3c679c90fe29&quot;,&quot;organizationId&quot;:&quot;902399&quot;,&quot;name&quot;:&quot;Telegram.apk&quot;,&quot;platform&quot;:&quot;ANDROID&quot;,&quot;status&quot;:&quot;READY&quot;,&quot;size&quot;:71089118,&quot;storagePath&quot;:&quot;b7186a0b-c4a3-46e6-ae64-9a48060b3190&quot;,&quot;uploadedDate&quot;:&quot;2024-02-15T19:07:34.276183&quot;,&quot;createdDate&quot;:&quot;2024-02-15T19:07:34.276183&quot;,&quot;updatedDate&quot;:&quot;2024-09-11T12:19:30.320735&quot;,&quot;fileName&quot;:&quot;Telegram.apk&quot;,&quot;metadata&quot;:{&quot;identifier&quot;:&quot;org.telegram.messenger.web&quot;,&quot;name&quot;:&quot;Telegram&quot;,&quot;version&quot;:&quot;9.6.5&quot;}}</value>
               </entry>
            </runConfigurationData>
            <runConfigurationId>TestCloud</runConfigurationId>
         </configuration>
         <runEnabled>false</runEnabled>
         <testSuiteEntity>Test Suites/Mobile/AndroidNative - Telegram</testSuiteEntity>
      </TestSuiteRunConfiguration>
      <TestSuiteRunConfiguration>
         <configuration>
            <groupName>Web Desktop</groupName>
            <profileName>default</profileName>
            <requireConfigurationData>false</requireConfigurationData>
            <runConfigurationId>Chrome</runConfigurationId>
         </configuration>
         <runEnabled>true</runEnabled>
         <testSuiteEntity>Test Suites/Jira/Jira</testSuiteEntity>
      </TestSuiteRunConfiguration>
      <TestSuiteRunConfiguration>
         <configuration>
            <groupName>Web Desktop</groupName>
            <profileName>default</profileName>
            <requireConfigurationData>false</requireConfigurationData>
            <runConfigurationId>Edge Chromium</runConfigurationId>
         </configuration>
         <runEnabled>true</runEnabled>
         <testSuiteEntity>Test Suites/Jira/Jira</testSuiteEntity>
      </TestSuiteRunConfiguration>
   </testSuiteRunConfigurations>
</TestSuiteCollectionEntity>
