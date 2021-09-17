package world;


import com.typesafe.config.Config;
import component_Message.ComponentMessages;
import automation.Configuration.MyDriver;
import com.typesafe.config.ConfigFactory;
import costants.GeneralConstants;
import org.openqa.selenium.WebDriver;



public class calzedoniaWorld {

        public static WebDriver driver;
//        public model.calzedoniaModel calzedoniaModel;



        public calzedoniaWorld() throws Exception {


        }

        /**
         * @return
         * @throws Exception
         */
        public void getInstance() throws Exception {
//            if (calzedoniaModel == null) {
//                calzedoniaModel = new calzedoniaModel();
//            }

            Config c = (Config) ConfigFactory.load();

            try {
                GeneralConstants.BRAND = c.getString(GeneralConstants.ENVIROMENT_KEY + "." + GeneralConstants.BRAND_KEY);
            } catch (Exception e) {
                throw new Exception(ComponentMessages.BRAND_NULL + "\n", e);
            }

            try {
                GeneralConstants.URL = c.getString(GeneralConstants.ENVIROMENT_KEY + "." + GeneralConstants.URL_KEY);
            } catch (Exception e) {
                throw new Exception(ComponentMessages.URL_RECEIVED_NULL + "\n", e);
            }

            try {
                GeneralConstants.ALIAS = c.getString(GeneralConstants.BROWSER_KEY + "." + GeneralConstants.ALIAS_KEY);
            } catch (Exception e) {
                throw new Exception(ComponentMessages.URL_RECEIVED_NULL + "\n", e);
            }

            //if false incognito mode = off
            driver = new MyDriver().setMyDriver(false);
        }





}







