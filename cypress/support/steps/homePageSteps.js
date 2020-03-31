import HomePage from '../pageobjects/HomePage'
const homePage = new HomePage

Given("I launch Waste Permits", () => {
  homePage.accessSite()
});

Then("I am on the {} page", (title) => {
  homePage.validateTitle(title)
});

Given("I select to start a new application", () => {
  homePage.startNewApplication()
  homePage.continue()
});
