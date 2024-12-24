package pages;


public class HomePage extends BasePage{

    private String sectionLink = "//a[normalize-space()='%s' and @href]";
    private String elegirUnPlanButton = "//a[normalize-space()='Elegir Plan' and @href]";

    public HomePage(){
        super(driver);
    }

    //Método para navegar a www.freerangetesters.com

    public void navigateToFreeRangeTesters(){
        navigateTo("https://www.freerangetesters.com");
    }

    public void clickOnSectionNavigationBar(String section){
        //Remplazar el marcador de posición en sectionLink con el nombre
        String xpathSection = String.format(sectionLink, section);
        clickElement(xpathSection);  
    }

    public void clickOnElegirPlanButton(){
        clickElement(elegirUnPlanButton);
    }
    
    
}
