package pages;

public class PaginaCursos extends BasePage {

    private String seleniumCucumberLink =  "//a[normalize-space()='Selenium y Cucumber con Java' and @href]";

    public PaginaCursos(){
        super(driver);
    }
    
    public void clickSeleniumCucumberLink(){
        clickElement(seleniumCucumberLink);
    }
}
