import java.util.Map;

public class Main {

    public static void main(String[] args) {

        New_Customer new_customer = new New_Customer();
        Bank bank = new Bank();
        Customer_Account customer_account = new Customer_Account();
        New_Account new_account = new New_Account();

        // 1. creating new customers of bank and adding new customer to bank's list of customers
        new_customer.add_new_customer("1", "F. The First");
        bank.add_new_customer_to_list_of_bank();

        new_customer.add_new_customer("2", "S. The Second");
        bank.add_new_customer_to_list_of_bank();

        new_customer.add_new_customer("3", "T. The Third");
        bank.add_new_customer_to_list_of_bank();

        new_customer.add_new_customer("4", "F. The Fourth");
        bank.add_new_customer_to_list_of_bank();

        new_customer.add_new_customer("5", "F. The Fifth");
        bank.add_new_customer_to_list_of_bank();

        // 2. after creating many customers we try to search them in 'database'
        customer_account.find_customer("3");

        //3. creating new account with assigning to specific customer
        customer_account.find_customer_and_create_account_for_customer("1", "1001");
        customer_account.find_customer_and_create_account_for_customer("2", "2002");
        customer_account.find_customer_and_create_account_for_customer("3", "3003");
        customer_account.find_customer_and_create_account_for_customer("4", "4004");
        customer_account.find_customer_and_create_account_for_customer("5", "5005");

        
        /*// 2. creating new account for new customer
        New_Account new_account = new New_Account();
        new_account.create_account_number("1001", "1");

        // 3. adding new customer to bank's list of customers
        Bank bank = new Bank();
        bank.add_new_customer_to_list_of_bank();

        // 1'. creating 2nd customer of bank
        new_customer.add_new_customer("2", "S.Second");

        // 2'. creating second account for new customer
        new_account.create_account_number("2002", "2");

        // 3'. adding 2nd customer to bank's list of customers
        bank.add_new_customer_to_list_of_bank();
        */
        //xxxxxxxxxxxxxx

    }

}
