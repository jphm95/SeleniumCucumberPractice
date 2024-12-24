package pages;

public class PaginaSeleniumCucumber extends BasePage {

    private String cypressJsLink = "//a[normalize-space()='E2E Testing con Cypress y JavaScript' and @href]";

    public PaginaSeleniumCucumber() {
        super(driver);
    }

    public void clickCypressJsLink(){
        clickElement(cypressJsLink);
    }


}
