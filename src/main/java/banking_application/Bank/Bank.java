package banking_application.Bank;

import java.util.ArrayList;

public class Bank {

    public static ArrayList<Object> bank_customer_list = new ArrayList<>();

    public static ArrayList<Object> getBank_customer_list() {
        return bank_customer_list;
    }

    public static void setBank_customer_list(ArrayList<Object> bank_customer_list) {
        Bank.bank_customer_list = bank_customer_list;
    }

    public Bank() {
    }

}
