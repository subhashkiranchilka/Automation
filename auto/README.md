# Automation
Test Automation project
Project Frame Work Pattern : POM, TengNG

Pre- requisites : 
JAVA- set home path
MAVEN - set home path.
=======================================================================================================
/****************Steps to run on Windows Chrome browser: *******************/

1. open eclipse,
2. download the project.
3. Run the pom.xml file.
4. right click on E2E_TestSuite.xml and run as TestNG Suite to execute scripts on Chrome.
========================================================================================================

/************* Follow the below configurations to run on IE 11, Windows 10  *************/

1. On IE 7 or higher on Windows Vista, Windows 7, or Windows 10, you must set the Protected Mode settings for each zone to be the same value. The value can be on or off, as long as it is the same for every zone. To set the Protected Mode settings, choose "Internet Options..." from the Tools menu, and click on the Security tab. For each zone, there will be a check box at the bottom of the tab labeled "Enable Protected Mode".

2. Additionally, "Enhanced Protected Mode" must be disabled for IE 10 and higher. This option is found in the Advanced tab of the Internet Options dialog.

3. The browser zoom level must be set to 100% so that the native mouse events can be set to the correct coordinates.

4. For Windows 10, you also need to set "Change the size of text, apps, and other items" to 100% in display settings.

5. For IE 11 only, you will need to set a registry entry on the target computer so that the driver can maintain a connection to the instance of Internet Explorer it creates. For 32-bit Windows installations, the key you must examine in the registry editor is HKEY_LOCAL_MACHINE\SOFTWARE\Microsoft\Internet Explorer\Main\FeatureControl\FEATURE_BFCACHE. For 64-bit Windows installations, the key is HKEY_LOCAL_MACHINE\SOFTWARE\Wow6432Node\Microsoft\Internet Explorer\Main\FeatureControl\FEATURE_BFCACHE. Please note that the FEATURE_BFCACHE subkey may or may not be present, and should be created if it is not present. Important: Inside this key, create a DWORD value named iexplore.exe with the value of 0.

/****************Steps to run on Windows Chrome browser: *******************/
1. open eclipse,
2. download the project.
3. Run the pom.xml file.
4. Open E2E_TestSuite.xml and change the browser-name valued to "IE" and save.
5. right click on E2E_TestSuite.xml and run as TestNG Suite to execute scripts on Chrome.

==========================================.html / ==============================================================

Reports will be available in below folder.
test-output -->emailable-report.html / index.html.
