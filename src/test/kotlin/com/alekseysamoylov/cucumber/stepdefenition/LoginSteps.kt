package com.alekseysamoylov.cucumber.stepdefenition
import io.cucumber.java8.En

class LoginSteps : En {
    init {
        Given("User is on landing page") {
            println("Hello 1")

        }
        When("User login into application with username and password") {
            println("Hello 1")

        }
        Then("Home page is populated") {
            println("Hello 1")

        }
        And("Cards are displayed") {
            println("Hello 1")
        }
    }
}
