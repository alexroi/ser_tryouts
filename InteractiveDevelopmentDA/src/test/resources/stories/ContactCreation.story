Meta:

Narrative:
As a user
I want to be able
to add and to delete contacts

Scenario: Adding new contact
Given Main page is opened
When user clicks create new contact button
And user fills fields with title <title> email <email> phone number <phone>
And submits create form
Then Contact with title <title> displayed on main page

Examples:
title|emial|phone
SomeContact1|test1@test.ru|1234561
SomeContact2|test2@test.ru|1234562
SomeContact3|test3@test.ru|1234563
SomeContact4|test4@test.ru|1234564
SomeContact5|test5@test.ru|1234565
SomeContact6|test6@test.ru|1234566

Scenario: Deleting contact
Given Main page is opened
When user clicks delete contact with title <title>
Then contact with title <title> dissapears


