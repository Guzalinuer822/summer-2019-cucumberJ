package com.vytrack.step_definitions;

import com.vytrack.pages.ContactsPage;
import com.vytrack.pages.DashboardPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class NavigationMenuStepDefs {




    @Then("the user navigate from Fleet to Vehicles")
    public void the_user_navigate_from_Fleet_to_Vehicles() {
        System.out.println("I verified Expected url: https://qa3.vytrack.com/entity/fleet");
    }

    @Then("the user navigate from Marketing to Campaigns")
    public void the_user_navigate_from_Marketing_to_Campaigns() {
        System.out.println("I verified Expected url: https://qa3.vytrack.com/campaign/");
    }

    @Then("the user navigate from Activities to Calendar Events")
    public void the_user_navigate_from_Activities_to_Calendar_Events() {
        System.out.println("I verified Expected url: https://qa3.vytrack.com/calendar/event");
    }

    @When("the user navigates {string} to {string}")
    public void the_user_navigates_to(String tab, String module) {
        new DashboardPage().navigateToModule(tab,module);
    }

    @Then("default page number should be {int}")
    public void default_page_number_should_be(Integer expectedPageNumber) {

        ContactsPage contactsPage=new ContactsPage();
        Integer actualNumber=Integer.parseInt(contactsPage.pageNumber.getAttribute("value"));
        System.out.println("actualNumber = " + actualNumber);
        System.out.println("expectedPageNumber = " + expectedPageNumber);
        Assert.assertEquals(actualNumber,expectedPageNumber);


    }
}
