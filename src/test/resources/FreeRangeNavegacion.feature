@Navigation
Feature: Navigation bar
    To see the subpages
    Without logging in
    I can click the navigation bar to link

    Background: I am on the Free Range Testers Web without logging in.
        Given I navigate to www.freerangetesters.com

    Scenario Outline: I can acces the subpages through the navigation bar
        When I go to <section> using the navigation bar
        Examples:
            | section  |
            | Cursos   |
            | Recursos |
            | Blog     |
            | Udemy    |
            | Academia |

    @Courses
    Scenario: Courses are presented correctly to potential customers
        When I go to Cursos using the navigation bar
        And I select Selenium y Cucumber con Java

    @Plans @Courses
    Scenario: Users can select a plan when signing up
        When The client selects elegir Plan
        Then The client can validate the options in the checkout page












