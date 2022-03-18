import java.sql.SQLOutput;

public class Print {

    public void print_customer_detail(){

        Bank_Customers bank_customers = new Bank_Customers();

        //xxxxxxxxxxxxxxxxxxx

        Integer customer_id = bank_customers.getCustomer_id();
        String customer_first_name = bank_customers.getCustomer_first_name();
        String customer_last_name = bank_customers.getCustomer_last_name();

        System.out.println("ID: " + customer_id);
        System.out.println("First name: " + customer_first_name);
        System.out.println("Last name: " + customer_last_name);

    }

    public void print_account_detail(){

        Accounts accounts = new Accounts();

        Integer account_number = accounts.getAccount_number();
        Integer account_funds = accounts.getAccount_funds();

        System.out.println("Account No.: " + account_number);
        System.out.println("Account funds: " + account_funds);

    }




}
