package costants;

import java.util.HashMap;
import java.util.Map;

public class GeneralConstants {

    //URL
    public static String URL = "";
    public static String URL_KEY = "url";

    //TIMEOUT
    public static final long VERY_LOW_WAITING_TIME = 5;
    public static long LOW_WAITING_TIME = 20;
    public static long LONG_WAITING_TIME = 50;
    public static long EXTRA_LONG_WAITING_TIME = 80;
    public static long MEDIUM_WAITING_TIME = 30;

    //COUNTRIES MAP
    public static final Map<String, String> COUNTRY_CODES = new HashMap<String, String>() {{
        put("it", "it/login");
        put("us", "us/login");
        put("gb", "en-gb");
    }};

    //ENVIRONMENT
    public static String ENVIROMENT = "PROD";
    public static String ENVIROMENT_KEY = "tMEnv";


    //MESSAGE
    public static String TEXT_MESSAGE_COUNTRY = ", country ";
    public static String MESSAGE_BRAND_COUNTRY;
    public static String MESSAGE_BRAND = "";
    public static String TEXT_MESSAGE_BRAND = " for brand ";


    //GENERAL
    public static String COUNTRY = "";
    public static String BRAND = "Calzedonia";
    public static String BRAND_KEY = "brand";

    public static String ALIAS_KEY = "alias";
    public static String ALIAS = "";

    public static String BROWSER_KEY = "browser";
    public static String COOKIES = "cookies";

    //PROPERTIES

    //address
    public final static String PROPERTIES_ADDRESS_FILE = "address.properties";
    public final static String PROPERTIES_ADDRESS_STREET = ".street";
    public final static String PROPERTIES_ADDRESS_STREET_UPDATE = ".street.update";
    public final static String PROPERTIES_ADDRESS_CITY = ".city";
    public final static String PROPERTIES_ADDRESS_REGION = ".region";
    public final static String PROPERTIES_ADDRESS_ZIPCODE = ".zipcode";
    public final static String PROPERTIES_ADDRESS_PHONE = ".phone";


    //credit card
    public final static String PROPERTIES_CREDIT_CARD_FILE = "creditcards.properties";
    public final static String PROPERTIES_CREDIT_CARD_NUMBER = ".number";
    public final static String PROPERTIES_CREDIT_CARD_EXP_MONTH = ".month";
    public final static String PROPERTIES_CREDIT_CARD_EXP_YEAR = ".year";
    public final static String PROPERTIES_CREDIT_CARD_EXP_CVV = ".cvv";


}