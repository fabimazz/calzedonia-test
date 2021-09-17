//package automation.steps.hooks;
//
//
//import cucumber.api.Scenario;
//import cucumber.api.java.After;
//import cucumber.api.java.Before;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
//import world.calzedoniaWorld;
//
//public class Hooks extends calzedoniaWorld{
//
//
//
//    public Hooks() throws Exception {
//        super();
//    }
//
//    @Before
//    public void setUp() { }
//
//    @After
//    public void TearDownTest(Scenario s) throws Exception {
//        //reset static variables to avoid error on next examples lines
////        UtilityManager.tearDownConstants();
//
//// Here will compare if test is failing then only it will enter into if condition
//        if (calzedoniaWorld.driver != null) {
//
//            if (s.isFailed()) {
//                byte[] screenshot = ((TakesScreenshot) calzedoniaWorld.driver).getScreenshotAs(OutputType.BYTES);
//                s.embed(screenshot, "image/png");
//            }
//
//            try {
////                UtilityManager.deleteCookies(calzedoniaWorld.driver);
//            } catch (Exception e) {
//                System.out.println("An error occurred during delete cookies " + e.getMessage());
//            }finally {
//                try {
//                    Thread.sleep(3000);
//                    calzedoniaWorld.driver.quit();
//                } catch (Exception e) {
//                    throw new Exception("An error occurred during selenium WebDriver quit");
//                }
//            }
//        }
//    }
//}