@smoke

Feature: user should be able to open all follow us links
#Test scenario 1
  Scenario: user can open Facebook link
    When user clicks on facebook icon
    Then facebook should open page url in new tab

#Test scenario 2
  Scenario:  user can open Twitter link
    When user clicks on twitter icon
    Then twitter should open page url in new tab

#Test scenario 3
  Scenario: user can open newsletter link
    When user clicks on newsletter icon
    Then newsletter should open page url in new tab

#Test scenario 4
  Scenario: user can open Youtube link
    When user clicks on youtube icon
    Then youtube should open page url in new tab