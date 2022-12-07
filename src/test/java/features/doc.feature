Feature: Test case

Scenario: 001_Login

Given Open browser and load URL
And Enter username as DemoCSR
And Enter password as crmsfa
When Click login
Then Click CRMSFA
And Close Browser


Scenario: 002_CreatLead

Given Open browser and load URL
And Enter username as DemoCSR
And Enter password as crmsfa
When Click login
Then Click CRMSFA

And Click CreatLead button 
And Enter Companyname as ABC
And Enter Firstname as Hema
And Enter Lastname as Mali
And Click My Home link
And Close Browser

Scenario: 003_CreatAccount

Given Open browser and load URL
And Enter username as DemoCSR
And Enter password as crmsfa
When Click login
Then Click CRMSFA

And Click Create Account link
And Enter account name as XYZ
And Choose Aerospace as Industry
And Close Browser
