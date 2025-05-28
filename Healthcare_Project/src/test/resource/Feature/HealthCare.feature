Feature: I am automating the CURA Healthcare Service 

Background: Common_Points

Given user launch the chrome browser
When user enter the url as "https://katalon-demo-cura.herokuapp.com/profile.php#login"

Scenario:
 
Then user login details with username as "John Doe" and Password as "ThisIsNotAPassword" and click LoginButton
And user click the menu and click the home button
When user click the Make Appointment 
And user choose the Facility and tick to apply 
Then user click the Healthcare Program and choose one
And user choose one date and comment as "Please take care of my pet"
When user book appointment and go to homepage
And user quit the browser