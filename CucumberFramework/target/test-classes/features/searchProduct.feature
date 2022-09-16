Feature: Search and Place the order for products

@OffersPage
Scenario Outline: Search experience for product search in both home and offers page
Given User is on GreenCart landing page
When user searched with shortname <Name> and extracted actual name of product
Then user searched for <Name> shortname in offers page 
And Validate Product name in offers page matches with landing page

Examples:
| Name |
| Tom  |
| Beet |


