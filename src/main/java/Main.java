import java.util.Map;

public class Main {

    public static void main(String[] args) {

        // 1. creating new customer of bank
        New_Customer new_customer = new New_Customer();
        new_customer.add_new_customer("1", "F.First");

        // 2. creating new account for new customer
        New_Account new_account = new New_Account();
        new_account.create_account_number("1001");

        // 3. adding new customer to bank's list of customers
        Bank bank = new Bank();
        bank.add_new_customer_to_list_of_bank();

        // 1'. creating 2nd customer of bank
        new_customer.add_new_customer("2", "S.Second");

        // 2'. creating second account for new customer
        new_account.create_account_number("2002");

        // 3'. adding 2nd customer to bank's list of customers
        bank.add_new_customer_to_list_of_bank();

        //xxxxxxxxxxxxxx
        Customer_Account customer_account = new Customer_Account();
        customer_account.find_customer("2");

    }

}
