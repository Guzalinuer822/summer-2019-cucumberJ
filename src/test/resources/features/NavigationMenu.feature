# TASK
# Create a new feature file NavigationMenu.feature and write scenarios for the given requirement
# and test cases. Try to reuse steps from previous feature files.
# Requirement:
# Logged in sales managers should be able to navigate to pages using the top menu. Once in the
# expected page, user should see correct page url.
# Test cases:
# 1.Menu option: Fleet—> Vehicles
# Expected url: https://qa3.vytrack.com/entity/fleet
# Test cases:
# 2.Menu option: Marketing—> Campaigns
# Expected url: https://qa3.vytrack.com/campaign/
# Test cases:
# 3.Menu option: Activities—> Calendar Events
# Expected url: https://qa3.vytrack.com/calendar/event
# After finishing the scecnarios, add necessary tags, run though CukesRunner and generate step defs.
# Cop paste the step definitions from console into new step definitions class called
# NavigationMenuStepDefs. Implement the step definitions by adding print statements.

@navigate
  Feature: Navigation menu
    Scenario: Fleet—> Vehicles
      Given the user is on the login page
      When the user enter the sales manager information
      Then the user should be able to login
      Then the user navigate from Fleet to Vehicles

    Scenario: Marketing—> Campaigns
      Given the user is on the login page
      When the user enter the sales manager information
      Then the user should be able to login
      Then the user navigate from Marketing to Campaigns

    Scenario: Activities—> Calendar Events
      Given the user is on the login page
      When the user enter the sales manager information
      Then the user should be able to login
      Then the user navigate from Activities to Calendar Events

