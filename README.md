# RCBTeam11_V1
This is the first project version of RBC team selection process.

Run configuration:
1. Export this project file in .zip format
2. Extract this folder on local machine
3. Import extracted folder using Eclipse IDE:
  Eclipse->File->Import->General-> Import Project from FOlder or Archive-> Directory->   Select Folder-> Finish.
4. Refresh the project
5. Run individual test case by selecting testcase from src/test/java right click on->  TestCase -> run as -> TestNG Test
6. Run all test cases using testng.xml by right clicking on testng.xml file and run as-> TestNG Suite

Project details:
1. src/test/java - contains all the test cases, BaseClass, User defined class to store details of each player.

     a. TC_checkForeignPlayers_001 - to validate no of foreignPlayer not more than 4.
  
     b. TC_CheckWicketKeeper_002 - to validate that there is atleast one Wicket-Keeper
  
2. JRE System Library
3. Maven Repositories
4. JSONFiles - it provides data in the form of json file.
5. POM.xml - for configuration details
6. testng.xml - to run all test at time
