## Instructions for Selenium Test Scripts
#################################################################


#### Selenium Prerequisites
1. Firefox V 33.0 or less is required for the scripts. I am running tests on 32.0
	https://support.mozilla.org/en-US/kb/install-older-version-of-firefox
2. Once Firefox is installed install Selenium IDE; latest version 2.9.0. is required.
	http://www.seleniumhq.org/download/
3. Release notes: https://github.com/SeleniumHQ/selenium/wiki/SeIDE-Release-Notes 
4. Application inputs files can be downloaded from;
	https://iu.box.com/s/9ztdby709kso8siachz16svn2y511nn7  
5. IntelliJ IDEA 14 to run the scripts as they are executed as java scripts.

#### Running Selenium Scripts on PGA
##### Set-up
1. Do a git clone https://github.com/SciGaP/pga-selenium-test-project.git and download the test project.
Navigate to pga-selenium-test-project/src/test/resources/
2. In exp.properties file provide the required information.
	- PGA username
	- PGA password
	- Project name
	- Project description
	- Experiment name prefix
	- Email1 and Email2 for notifications
	- Local folder path for the location where you have the application input files (static part of the folder location is in the script itself. check to make sure it matches your folder hierarchy)	
	- Base URL and sub URL of the PHP gateway
3. In path SEAGridTest/src/test/java/org/apache/airavata/pga/tests/utils go to file ExpFileReadUtils.java and make sure the input file paths and file names are correct.

##### Experiment Launch
1. Experiment test scripts are in SEAGridTest/src/test/java/org/apache/airavata/pga/tests
2. First create a project using script: CreateModifySearchProject.java. Project is created with the name provided in exp.properties file.
3. Once the project is created this will be used to create experiments. 
4. Run experiment creation scripts one by one OR use script RunAllTests to run all experiment at once. Experiment launching scripts are named with application-name+resource.
5. Other test scripts available
	- ExpLoadTest (can be used similar to RunAllTests. Can be used to submit multiple experiments from one application deployment)
	- SearchProjectExp (This script will display all the experiments in a Project.Working in Progress)
	- CreateUserLogin (To creat a new user account in PGA)
	- UserLogout (Initial test script to test login out from PGA)


###########################################################################
###########################################################################


