package automation.steps.LOGIN_LOGOUT;

import component_Message.ComponentMessages;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import divcostants.constantsP;
import org.openqa.selenium.By;
import world.calzedoniaWorld;
import costants.GeneralConstants;
import cucumber.api.java.en.Given;


public class Login_Logout {


    public Login_Logout Login_Logout;
    public calzedoniaWorld calzedoniaWorld;


    @Given("^I go on website on country ([^\\\"]*)$")
    public void iGoOnWebsiteOnCountry(String COUNTRY) throws Throwable {
        calzedoniaWorld = new calzedoniaWorld();
        calzedoniaWorld.getInstance();
        calzedoniaWorld.driver.navigate().to(String.format(GeneralConstants.ALIAS, GeneralConstants.URL, GeneralConstants.COUNTRY_CODES.get(COUNTRY)));
    }

    @When("^I logIn using my Credentials$")
    public void insert_email() throws Exception {
        calzedoniaWorld.driver.findElement(By.xpath(constantsP.FIELD_USERNAME)).sendKeys(constantsP.EMAIL_LOG);
        calzedoniaWorld.driver.findElement(By.xpath(constantsP.FIELD_PASSWORD)).sendKeys(constantsP.PASSWORD_LOG);
        calzedoniaWorld.driver.findElement(By.xpath(constantsP.ACCEDI_BUTTON)).click();
        }



   @Then("^I can access my account area$")
   public void acount_area() throws Exception {
       Thread.sleep(2000);
       String currentUrl = calzedoniaWorld.driver.getCurrentUrl();
        boolean tmp = false;
        if (constantsP.URL_MY_AREA.equals(currentUrl)){
            tmp = true;
       }
        else {
            throw new Exception(ComponentMessages.PAGE_MY_AREA_ERROR);
        }
    }

    @Then("^I logOut$")
    public void user_logout() throws Exception{
        Thread.sleep(2000);
        calzedoniaWorld.driver.findElement(By.xpath(constantsP.OMINO_BUTTON)).click();
        Thread.sleep(2000);
        calzedoniaWorld.driver.findElement(By.xpath(constantsP.LOGOUT_BUTTON)).click();
        Thread.sleep(2000);
        String currentUrl1 = calzedoniaWorld.driver.getCurrentUrl();
        boolean tmp = false;
        if (constantsP.HOME_PAGE_LOGOUT.contains(currentUrl1)){
            tmp = true;
        }
        else {
            throw new Exception(ComponentMessages.PAGE_MY_AREA_ERROR);
        }
    }

    @And("^elimina popup cookie$")
    public void deletePopup() throws Exception{
        Thread.sleep(2000);
        calzedoniaWorld.driver.findElement(By.xpath(constantsP.POPUP_BRUTTO_BUTTON)).click();

    }



    }


















