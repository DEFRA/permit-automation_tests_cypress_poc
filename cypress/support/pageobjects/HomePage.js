/// <reference types="Cypress" />

import HomePageElements from '../elements/HomePageElements'
const homePageElements = new HomePageElements
const url = Cypress.config("baseUrl")

class HomePage {
    accessSite() {
        cy.visit(url)
    }

    validateTitle(title) {
        cy.get(homePageElements.title()).should('contain', title)
    }

    startNewApplication() {
        cy.get(homePageElements.startApplication()).click()
    }

    openSavedApplication() {
        cy.get(homePageElements.openSavedApplication()).click()
    }

    continue() {
        cy.get(homePageElements.continueButton()).click()
    }
    
}

export default HomePage;
