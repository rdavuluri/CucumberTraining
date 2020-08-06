Feature: Search Google

  Scenario Outline: Need to enter multiple text
    Given User should be on the Google HomePage
    Then Enter mentioned "<textValues>"
    
    Examples:
    		|textValues|
    		|amit |
    		|Manipal|

