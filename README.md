##################### Selenium Instructions #####################

### Selenium Prerequisites
1. Firefox V 33.0 or less is required for the scripts. I am running tests on 32.0
	https://support.mozilla.org/en-US/kb/install-older-version-of-firefox
2. Once Firefox is installed install Selenium IDE; latest version 2.9.0. is required.
	http://www.seleniumhq.org/download/
3. Release notes: https://github.com/SeleniumHQ/selenium/wiki/SeIDE-Release-Notes 
4. Application inputs files can be downloaded from;
	https://iu.box.com/s/9ztdby709kso8siachz16svn2y511nn7  
5. IntelliJ IDEA 14 to run the scripts as they are executed as java scripts.

### Running Selenium Scripts on PGA
Set-up
Download the SEAGridTest.zip file above and unzip.
Navigate to SEAGridTest/src/test/resources
In exp.properties file provide the required infromation.
PGA user
PGA password
Project name
Project description
Experiment name prefix
Email1 and Email2 for notifications
Local folder path for the location where you have the application input files (static part of the folder location is in the script itself. check to make sure it matches your folder hierarchy)	
Base URL and sub URL of the PHP gateway
In path SEAGridTest/src/test/java/org/apache/airavata/pga/tests/utils go to file ExpFileReadUtils.java and make sure the input file paths and file names are correct.
Experiment Launch
Experiment test scripts are in SEAGridTest/src/test/java/org/apache/airavata/pga/tests
First create a project using script: CreateModifySearchProject.java
Once the project is created this will be used to create experiments. 
Run experiment creation scripts one by one.
AbaqusComet.java
AbinitBR2.java
AbinitComet.java
AmberSanderBR2.java
AmberSanderComet.java
GamessBR2.java			
NEK5000BR2.java
GamessComet.java		
NwChemComet.java
GamessGordon.java		
NwChemStampede.java		
GamessStampede.java
……….		

Running UltraScan Tests
Set-up
Download the zip file above and unzip.
Navigate to UltrascanTest/src/test/resources
In exp.properties file provide the required infromation.
Project Name
Project Description
Experiment Name Prefix
Local folder path for the location where you have the application input files (static part of the folder location is in the script itself. check to make sure it matches your folder hierarchy)	
Base URL and sub URL of the PHP gateway
In path UltrascanTest/src/test/java/com/example/tests/utils go to file ExpFileReadUtils.java and make sure the input file path and name are correct
Navigate to /Users/Eroma/development/SeleniumTests/UltrascanTest/src/test/java/com/example/tests and provide your username and password to Ultrascan PGA.
Experiment Launch
Experiment test scripts are in UltrascanTest/src/test/java/com/example/tests/exp/example/tests
First create a project using script: CreateModifySearchProject.java
Once the project is created this will be used to create experiments. 
Run experiment creation scripts one by one.
UltrascanAlamo.java		
UltrascanGordon.java				
UltrascanStampede.java
UltrascanComet.java		
UltrascanJureca.java		
UltrascanLoneStar5.java

###########################################################################


