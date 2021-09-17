package component_Message;

import costants.GeneralConstants;

public class ComponentMessages {
    public static String DEFAULT;

    public static String BRAND_NULL;
    public static String URL_RECEIVED_NULL;
    public static String NAVIGATE_EXCEPTION;

    public static String LINK_LOGIN_NOT_CLICKABLE;
    public static String LINK_LOGIN_EXISTS;

    public static String MY_ACCOUNT_BUTTON_NOT_CLICKABLE;
    public static String MY_ACCOUNT_SIGN_IN_BUTTON_NOT_CLICKABLE;
    public static String MY_ACCOUNT_LOGIN_BUTTON_NOT_CLICKABLE;
    public static String REGISTRATION_BUTTON_NOT_CLICKABLE;
    public static String THANK_YOU_PAGE_BUTTON_NOT_CLICKABLE;
    public static String WELCOME_BUTTON_NOT_CLICKABLE;

    //LOGIN
    public static String LOGOUT_BUTTON_NOT_CLICKABLE;
    public static String LOGIN_BUTTON_NOT_CLICKABLE;
    public static String LOGIN_PANEl_NOT_EXISTS;
    public static String LOGIN_CREDENTIALS_ERROR;
    public static String NAME_USER_NOT_EXIST;

    //HOME PAGE
    public static String GO_TO_HOME_PAGE_NOT_CLICKABLE;
    public static String PAGE_MY_AREA_ERROR;

    public static String RADIO_BUTTON_MAN_NOT_CLICKABLE;

    public static String INPUT_FIRST_NAME_NOT_EXIST_OR_FILLED;
    public static String INPUT_LAST_NAME_NOT_EXIST_OR_FILLED;

    public static String EDIT_FIELD_EMAIL_INSERT;
    public static String EDIT_FIELD_PASSWORD_CHECKOUT;

    public static String DROP_DOWN_DATA_REGISTRATION_NOT_EXIST;

    public static String INPUT_REGISTRATION_EMAIL_NOT_EXIST_OR_FILLED;
    public static String INPUT_CONFIRM_REGISTRATION_EMAIL_NOT_EXIST_OR_FILLED;

    public static String INPUT_REGISTRATION_PASSWORD_NOT_EXIST_OR_FILLED;
    public static String INPUT_CONFIRM_REGISTRATION_PASSWORD_NOT_EXIST_OR_FILLED;

    public static String INPUT_LOGIN_EMAIL_NOT_EXIST_OR_FILLED;
    public static String INPUT_LOGIN_PASSWORD_NOT_EXIST_OR_FILLED;

    public static String FIELD_TEXT_NAME_MY_PROFILE_NOT_FOUND;
    public static String FIELD_TEXT_EMAIL_MY_PROFILE_NOT_FOUND;

    public static String ELEMENT_MY_PROFILE_ACCESS_NOT_CLICKABLE;

    //UPDATE USER DETAILS
    public static String UPDATE_USER_DETAILS_ERROR;
    public static String UPDATE_USER_DETAILS_OK;
    public static String UPDATE_USER_DETAILS_POPUP_NOT_FOUND;
    public static String UPDATE_USER_DETAILS_CLOSE_POPUP_BUTTON_NOT_CLICKABLE;
    public static String UPDATE_USER_DETAILS_SAVE_BUTTON_NOT_CLICKABLE;

    /**
     * sets the messages log
     */
    public static void setComponentMessage() {
        //GENERAL
        DEFAULT = " It could be a page error, attached below the screenshot";
        BRAND_NULL = "The brand is null";
        URL_RECEIVED_NULL = "The URL is null" + GeneralConstants.MESSAGE_BRAND_COUNTRY;
        NAVIGATE_EXCEPTION = "An error occurred during website navigation" + GeneralConstants.MESSAGE_BRAND;

        EDIT_FIELD_EMAIL_INSERT = "The EMAIL field has not been correctly filled" + GeneralConstants.MESSAGE_BRAND_COUNTRY;
        EDIT_FIELD_PASSWORD_CHECKOUT = "You cannot set the value for the PASSWORD field" + GeneralConstants.MESSAGE_BRAND_COUNTRY;

        //LOGIN
        LINK_LOGIN_NOT_CLICKABLE = "The login link is not clickable" + GeneralConstants.MESSAGE_BRAND_COUNTRY;
        LINK_LOGIN_EXISTS = "There is no login link" + GeneralConstants.MESSAGE_BRAND_COUNTRY + DEFAULT;
        INPUT_LOGIN_EMAIL_NOT_EXIST_OR_FILLED = "Login email Input is not filled or not exists" + GeneralConstants.MESSAGE_BRAND_COUNTRY;
        INPUT_LOGIN_PASSWORD_NOT_EXIST_OR_FILLED = "Login email Input is not filled or not exists" + GeneralConstants.MESSAGE_BRAND_COUNTRY;
        LOGIN_CREDENTIALS_ERROR = "Wrong Email or Password" + GeneralConstants.MESSAGE_BRAND_COUNTRY;
        NAME_USER_NOT_EXIST = "The name of the logged in user is not present" + GeneralConstants.MESSAGE_BRAND_COUNTRY;
        MY_ACCOUNT_BUTTON_NOT_CLICKABLE = "MyAccount button is not clickable" + GeneralConstants.MESSAGE_BRAND_COUNTRY;

        WELCOME_BUTTON_NOT_CLICKABLE = "Welcome button is not clickable" + GeneralConstants.MESSAGE_BRAND_COUNTRY;
        LOGOUT_BUTTON_NOT_CLICKABLE = "Logout button is not clickable" + GeneralConstants.MESSAGE_BRAND_COUNTRY;
        LOGIN_BUTTON_NOT_CLICKABLE = "Login button is not clickable" + GeneralConstants.MESSAGE_BRAND_COUNTRY;

        MY_ACCOUNT_SIGN_IN_BUTTON_NOT_CLICKABLE = "SignIn button is not clickable" + GeneralConstants.MESSAGE_BRAND_COUNTRY;
        MY_ACCOUNT_LOGIN_BUTTON_NOT_CLICKABLE = "Login button is not clickable" + GeneralConstants.MESSAGE_BRAND_COUNTRY;

        REGISTRATION_BUTTON_NOT_CLICKABLE = "Registration button is not clickable" + GeneralConstants.MESSAGE_BRAND_COUNTRY;
        THANK_YOU_PAGE_BUTTON_NOT_CLICKABLE = "Thank you page button, return to shopping, is not clickable" + GeneralConstants.MESSAGE_BRAND_COUNTRY;

        RADIO_BUTTON_MAN_NOT_CLICKABLE = "Man Radio button is not clickable" + GeneralConstants.MESSAGE_BRAND_COUNTRY;

        INPUT_FIRST_NAME_NOT_EXIST_OR_FILLED = "First name Input is not filled or not exists" + GeneralConstants.MESSAGE_BRAND_COUNTRY;
        INPUT_LAST_NAME_NOT_EXIST_OR_FILLED = "Last name Input is not filled or not exists" + GeneralConstants.MESSAGE_BRAND_COUNTRY;

        //REGISTRATION
        DROP_DOWN_DATA_REGISTRATION_NOT_EXIST = "Drop Down data registration not exists" + GeneralConstants.MESSAGE_BRAND_COUNTRY;
        INPUT_REGISTRATION_EMAIL_NOT_EXIST_OR_FILLED = "Form Registration email Input is not filled or not exists" + GeneralConstants.MESSAGE_BRAND_COUNTRY;
        INPUT_CONFIRM_REGISTRATION_EMAIL_NOT_EXIST_OR_FILLED = "Form confirm Registration email Input is not filled or not exists" + GeneralConstants.MESSAGE_BRAND_COUNTRY;
        INPUT_REGISTRATION_PASSWORD_NOT_EXIST_OR_FILLED = "Form Registration password Input is not filled or not exists" + GeneralConstants.MESSAGE_BRAND_COUNTRY;
        INPUT_CONFIRM_REGISTRATION_PASSWORD_NOT_EXIST_OR_FILLED = "Form confirm Registration password Input is not filled or not exists" + GeneralConstants.MESSAGE_BRAND_COUNTRY;

        FIELD_TEXT_NAME_MY_PROFILE_NOT_FOUND = "The MyProfile Name text field not found" + GeneralConstants.MESSAGE_BRAND_COUNTRY;
        FIELD_TEXT_EMAIL_MY_PROFILE_NOT_FOUND = "The MyProfile Email text field not found" + GeneralConstants.MESSAGE_BRAND_COUNTRY;

        ELEMENT_MY_PROFILE_ACCESS_NOT_CLICKABLE = "My Profile button is not clickable" + GeneralConstants.MESSAGE_BRAND_COUNTRY;

        LOGIN_PANEl_NOT_EXISTS = "Login panel is not present" + GeneralConstants.MESSAGE_BRAND_COUNTRY;

        //HOME PAGE
        GO_TO_HOME_PAGE_NOT_CLICKABLE = "Armani go to home page button is not clickable" + GeneralConstants.MESSAGE_BRAND_COUNTRY;
        PAGE_MY_AREA_ERROR = "Home page non raggiunta" + GeneralConstants.MESSAGE_BRAND_COUNTRY;

        //UPDATE USER DETAILS
        UPDATE_USER_DETAILS_ERROR = "The first name/last name is/are not changed after update" + GeneralConstants.MESSAGE_BRAND_COUNTRY;
        UPDATE_USER_DETAILS_OK = "Update user details completed successfully" + GeneralConstants.MESSAGE_BRAND_COUNTRY;

        UPDATE_USER_DETAILS_CLOSE_POPUP_BUTTON_NOT_CLICKABLE = "Update user details popup close panel button is not present or clickable" + GeneralConstants.MESSAGE_BRAND_COUNTRY;
        UPDATE_USER_DETAILS_SAVE_BUTTON_NOT_CLICKABLE = "Save Update user details button is not present or clickable" + GeneralConstants.MESSAGE_BRAND_COUNTRY;
        UPDATE_USER_DETAILS_POPUP_NOT_FOUND = "Update user details popup not found" + GeneralConstants.MESSAGE_BRAND_COUNTRY;
    }
}