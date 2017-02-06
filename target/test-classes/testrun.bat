@echo on
SET PROJECT_PATH=C:\Users\ADHYAN MISHRA\workspace\workspace1\Selenium_Java_Project

CD /D %PROJECT_PATH%

call mvn clean test

pause