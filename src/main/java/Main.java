import java.util.Map;

public class Main {

    public static void main(String[] args) {

        /*Bank_Customers bank_customers = new Bank_Customers();

        bank_customers.add_new_customer(1, "First", "The First", 1000001, 0);
        bank_customers.add_new_customer(2, "Second", "The Second", 1000002, 0);
        */
        //xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx

        New_Customer new_customer = new New_Customer();
        new_customer.add_new_customer("1", "F.First");

        New_Account new_account = new New_Account();
        new_account.create_account_number("1001");

        Bank bank = new Bank();
        bank.add_new_customer_to_list_of_bank();

    }

}
