Meta:

Narrative:
As a user
I want to perform search of movies, actors, tv shows
So that I can fint what i want

Scenario: single movie search
Given Home page is opened
When I enter search phrase 'Black Hawk Down'
And press submit search
And i see 'Black Hawk Down' in search results and click on it
Then I am on page with title 'Black Hawk Down'
