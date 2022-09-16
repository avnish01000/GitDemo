Feature: Checkout Page Verification

@PlaceOrder
Scenario Outline: Search the Product and verify the checkout page
Given User is on GreenCart landing page
When user searched with shortname <Product Name> and extracted actual name of product
And added the product to cart after increasing the quantity to "6" and proceed to checkout page from Cart
Then Validate the prodcut name, Apply and Place order buttons

Examples:
| Product Name |
| Tom |