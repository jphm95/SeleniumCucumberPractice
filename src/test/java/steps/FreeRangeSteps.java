package steps;

import java.util.Arrays;
import java.util.List;

import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import io.cucumber.java.en.*;

import pages.HomePage;
import pages.PaginaCursos;
import pages.PaginaRegistro;
import pages.PaginaSeleniumCucumber;

public class FreeRangeSteps {

    SoftAssert soft = new SoftAssert();

    HomePage landingPage = new HomePage();
    PaginaCursos cursosPage = new PaginaCursos();
    PaginaSeleniumCucumber seleniumPage = new PaginaSeleniumCucumber();
    PaginaRegistro registro = new PaginaRegistro();

    @Given("I navigate to www.freerangetesters.com")
    public void iNavigateToFRT() {
        landingPage.navigateToFreeRangeTesters();
    }

    @When("I go to {word} using the navigation bar")
    public void navigationBarUse(String section) {
        landingPage.clickOnSectionNavigationBar(section);
    }

    @And("^(?:I|The user|The client) selects? Selenium y Cucumber con Java$")
    public void navigateToCucumber() {
        cursosPage.clickSeleniumCucumberLink();
        seleniumPage.clickCypressJsLink();

    }

    @When("^(?:I|The user|The client) selects? elegir Plan$")
    public void selectElegirPlan() {
        landingPage.clickOnElegirPlanButton();
    }

    @Then("^(?:I|The user|The client) can validate the options in the checkout page$")
    public void validateCheckoutPlans() {
        List<String> lista = registro.returnPlanDropdownValues();
        List<String> listaEsperada = Arrays.asList("Academia: $18.99 / mes • 13 productos",
                "Academia: $156 / año • 13 productos", "Free: Gratis • 3 productos");

        Assert.assertEquals(listaEsperada, lista);
    }

}
