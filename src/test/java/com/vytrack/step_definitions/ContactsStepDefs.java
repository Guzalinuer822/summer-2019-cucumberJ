package com.vytrack.step_definitions;

import com.vytrack.pages.DashboardPage;
import com.vytrack.pages.LoginPage;
import com.vytrack.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.List;
import java.util.Map;

public class ContactsStepDefs {

    @Then("the user should see following menu options")
    public void the_user_should_see_following_menu_options(List<String> menuOptions) {

        System.out.println("menu options size = " + menuOptions.size());
        System.out.println("menu options : " + menuOptions);

        DashboardPage dashboardPage=new DashboardPage();

       List<String> actualMenuOptions=BrowserUtils.getElementsText(dashboardPage.menuOptions);
        System.out.println("actualMenuOptions = " + actualMenuOptions);

        Assert.assertEquals(menuOptions,actualMenuOptions);

    }

    @Then("the user logs in using following credentials")
    public void the_user_logs_in_using_following_credentials(Map<String,String> userData) {
     /*  example from getting data from map
        System.out.println("userData = " + userData);
        System.out.println(userData.get("firstname));
      */

     new LoginPage().login(userData.get("username"),userData.get("password"));
     DashboardPage dashboardPage=new DashboardPage();
     String actualUsername=dashboardPage.getUserName();
     String expctedUsername=userData.get("firstname")+" "+ userData.get("lastname");

        System.out.println("expctedUsername = " + expctedUsername);
        System.out.println("actualUsername = " + actualUsername);
     Assert.assertEquals(expctedUsername,actualUsername);

    }

}
