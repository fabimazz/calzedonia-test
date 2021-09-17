package automation.Configuration;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class MyDriver {

    private WebDriver driver;


    /**
     * create a new webdriver instance, is isIncognito is true it will open a new page in incognito mode
     * open webpage in full screen
     *
     * @return
     */
    public synchronized WebDriver setMyDriver(boolean isIncognito) {
        if (driver == null) {
            System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");

            ChromeOptions options = new ChromeOptions();

            //remember that for direct PDP link use an incognito webpage could be generate an error due a new session will created
            if (isIncognito) {
                options.addArguments("incognito");
                DesiredCapabilities capabilities = DesiredCapabilities.chrome();
                capabilities.setCapability(ChromeOptions.CAPABILITY, options);
            }

            driver = new ChromeDriver(options);
            driver.manage().window().maximize();

        }
        return driver;
    }





}