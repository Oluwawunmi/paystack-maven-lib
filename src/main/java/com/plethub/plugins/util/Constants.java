package com.plethub.plugins.util;


/**
 * @author Oluwawunmi Sowunmi on 29/06/2019.
 */

public class Constants {

    /**
     * The following are URL definitions for the Paystack API. All URLs are
     * RESTful endpoints and as such modification of any of these URL resources
     * will lead to problems with querying the Paystack API. Only modify if you
     * know what you are doing.
     */
    private final static String BASE_API_ENDPOINT = "https://api.paystack.co";

    //URL definitions for transactions
    public static final String PAYSTACK_TRANSACTIONS_INITIALIZE_ONE = BASE_API_ENDPOINT + "/transaction/initialize";
    public static final String PAYSTACK_TRANSACTIONS_VERIFY_ONE = BASE_API_ENDPOINT + "/transaction/verify/";
    public static final String PAYSTACK_TRANSACTIONS_VIEW_LIST= BASE_API_ENDPOINT + "/transaction";
    public static final String PAYSTACK_TRANSACTIONS_VIEW_ONE = BASE_API_ENDPOINT + "/transaction/";
    public static final String PAYSTACK_TRANSACTIONS_CHARGE_AUTHORIZATION = BASE_API_ENDPOINT + "/transaction/charge_authorization";
    public static final String PAYSTACK_TRANSACTIONS_VIEW_TIMELINE = BASE_API_ENDPOINT + "/transaction/timeline/";
    public static final String PAYSTACK_TRANSACTIONS_TOTALS = BASE_API_ENDPOINT + "/transaction/totals";
    public static final String PAYSTACK_TRANSACTIONS_EXPORT_TRANSACTIONS = BASE_API_ENDPOINT + "/transaction/export";
    public static final String PAYSTACK_TRANSACTIONS_REQUEST_REAUTHORIZATION = BASE_API_ENDPOINT + "/transaction/request_reauthorization";
    public static final String PAYSTACK_TRANSACTIONS_CHECK_AUTHORIZATION = BASE_API_ENDPOINT + "/transaction/check_authorization";

    //URL definitions for customers
    public static final String PAYSTACK_CUSTOMERS_CREATE_ONE = BASE_API_ENDPOINT + "/customer";
    public static final String PAYSTACK_CUSTOMERS_VIEW_LIST = BASE_API_ENDPOINT + "/customer";
    public static final String PAYSTACK_CUSTOMERS_VIEW_ONE = BASE_API_ENDPOINT + "/customer/";
    public static final String PAYSTACK_CUSTOMERS_UPDATE_ONE = BASE_API_ENDPOINT + "/customer/";
    public static final String PAYSTACK_CUSTOMERS_SET_RISK = BASE_API_ENDPOINT + "/customer/set_risk_action";
    public static final String PAYSTACK_CUSTOMERS_DEACTIVATE_AUTHORIZATION = BASE_API_ENDPOINT + "/customer/deactivate_authorization";

    //URL definitions for sub accounts
    public static final String PAYSTACK_SUB_ACCOUNTS_CREATE_ONE = BASE_API_ENDPOINT + "/subaccount";
    public static final String PAYSTACK_SUB_ACCOUNTS_VIEW_LIST = BASE_API_ENDPOINT + "/subaccount";
    public static final String PAYSTACK_SUB_ACCOUNTS_VIEW_ONE = BASE_API_ENDPOINT + "/subaccount/";
    public static final String PAYSTACK_SUB_ACCOUNTS_UPDATE_ONE = BASE_API_ENDPOINT + "/subaccount/";

    //URL definitions for plans
    public static final String PAYSTACK_PLANS_CREATE_ONE = BASE_API_ENDPOINT + "/plan";
    public static final String PAYSTACK_PLANS_VIEW_LIST = BASE_API_ENDPOINT + "/plan";
    public static final String PAYSTACK_PLANS_VIEW_ONE = BASE_API_ENDPOINT + "/plan/";
    public static final String PAYSTACK_PLANS_UPDATE_ONE = BASE_API_ENDPOINT + "/plan/";

    //URL definitions for subscriptions
    public static final String PAYSTACK_SUBSCRIPTIONS_CREATE_ONE = BASE_API_ENDPOINT + "/subscription";
    public static final String PAYSTACK_SUBSCRIPTIONS_VIEW_LIST = BASE_API_ENDPOINT + "/subscription";
    public static final String PAYSTACK_SUBSCRIPTIONS_DISABLE_ONE = BASE_API_ENDPOINT + "/subscription/disable";
    public static final String PAYSTACK_SUBSCRIPTIONS_ENABLE_ONE = BASE_API_ENDPOINT + "/subscription/enable";
    public static final String PAYSTACK_SUBSCRIPTIONS_VIEW_ONE = BASE_API_ENDPOINT + "/subscription/";

    //URL definitions for payment pages
    public static final String PAYSTACK_PAGES_CREATE_ONE = BASE_API_ENDPOINT + "/page";
    public static final String PAYSTACK_PAGES_VIEW_LIST = BASE_API_ENDPOINT + "/page";
    public static final String PAYSTACK_PAGES_VIEW_ONE = BASE_API_ENDPOINT + "/page/";
    public static final String PAYSTACK_PAGES_UPDATE_ONE = BASE_API_ENDPOINT + "/page/";
    public static final String PAYSTACK_PAGES_CHECK_AVAILABILITY = BASE_API_ENDPOINT + "/page/check_slug_availability/";

    //URL definitions for invoices
    public static final String PAYSTACK_INVOICES_CREATE_ONE = BASE_API_ENDPOINT + "/paymentrequest";
    public static final String PAYSTACK_INVOICES_VIEW_LIST = BASE_API_ENDPOINT + "/paymentrequest";
    public static final String PAYSTACK_INVOICES_VIEW_ONE = BASE_API_ENDPOINT + "/paymentrequest/";
    public static final String PAYSTACK_INVOICES_VERIFY_ONE = BASE_API_ENDPOINT + "/paymentrequest/verify/";
    public static final String PAYSTACK_INVOICES_METRICS = BASE_API_ENDPOINT + "/paymentrequest/totals";


    //URL definitions for settlements
    public static final String PAYSTACK_SETTLEMENTS = BASE_API_ENDPOINT + "/settlement";

    //URL definitions for banks and verifications
    public static final String PAYSTACK_BANKS = BASE_API_ENDPOINT + "/bank";
    public static final String PAYSTACK_BANKS_BVN_VALIDATE = BASE_API_ENDPOINT + "/bank/resolve_bvn/";
    public static final String PAYSTACK_BANKS_BVN_MATCH = BASE_API_ENDPOINT + "/bvn/match";
    public static final String PAYSTACK_BANKS_ACCOUNT_VALIDATE = BASE_API_ENDPOINT + "/bank/resolve";
    public static final String PAYSTACK_BANKS_CARD_BIN_VALIDATE = BASE_API_ENDPOINT + "/decision/bin/";



}