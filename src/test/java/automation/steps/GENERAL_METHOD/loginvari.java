package automation.steps.GENERAL_METHOD;

import automation.steps.LOGIN_LOGOUT.Login_Logout;
import component_Message.ComponentMessages;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import divcostants.constantsP;
import gherkin.lexer.Th;
import org.openqa.selenium.By;
import world.calzedoniaWorld;

public class loginvari {


    public loginvari loginvari;
    public world.calzedoniaWorld calzedoniaWorld;

    @When("^click calzedonia$")
    public void clickLogo() throws Exception{
        Thread.sleep(2000);
        calzedoniaWorld.driver.findElement(By.xpath(constantsP.CALZEDONIA_LOGO)).click();
        Thread.sleep(2000);
        String currentUrl = calzedoniaWorld.driver.getCurrentUrl();
        boolean tmp = false;
        if (currentUrl.contains(constantsP.CALZEDONIA_HOME_URL)){
            tmp = true;
        }
        else {
            throw new Exception(ComponentMessages.PAGE_MY_AREA_ERROR);
        }
    }



    @And("^click omino guest$")
    public void clickOmino() throws Exception{
        Thread.sleep(2000);
        calzedoniaWorld.driver.findElement(By.xpath(constantsP.OMINO_GUEST_BUTTON)).click();
       // Thread.sleep(2000);
        //calzedoniaWorld.driver.findElement(By.xpath(constantsP.ACCEDI_REGISTRATI_BUTTON)).click();
    }

    @And("^login$")
    public void login() throws Exception{
        Thread.sleep(2000);
        calzedoniaWorld.driver.findElement(By.xpath(constantsP.INSERT_EMAIL_2_BUTTON)).sendKeys(constantsP.EMAIL_LOG);
        Thread.sleep(2000);
        calzedoniaWorld.driver.findElement(By.xpath(constantsP.PASSWORD_2_BUTTON)).sendKeys(constantsP.PASSWORD_LOG);
        Thread.sleep(2000);
        calzedoniaWorld.driver.findElement(By.xpath(constantsP.ACCEDI_2_BUTTON)).click();
    }


    @Then("^verifica pagina$")
    public void verificaPage() throws Exception{
        Thread.sleep(2000);
        String currentUrl = calzedoniaWorld.driver.getCurrentUrl();
        boolean tmp = false;
        if (currentUrl.contains(constantsP.CALZEDONIA_URL)){
            tmp = true;
        }
        else {
            throw new Exception(ComponentMessages.PAGE_MY_AREA_ERROR);
        }
    }

















}
