public class Main {

    public static void main(String[] args) {

        // 1. creating new customers of bank and adding them to bank's list of customers,
        // we find the printouts on the 'List of all bank customers'
        Customer customer = new Customer();
        customer.add_new_customer("1", "F. First");
        customer.add_new_customer("2", "S. Second");
        customer.add_new_customer("3", "T. Third");
        customer.add_new_customer("4", "Fo. Fourth");
        customer.add_new_customer("5", "Fi. Fifth");

        // 2. after creating many customers we try to search them in 'database',
        // we find the printouts on the list 'Customers Database'
        Customer_Bank customer_bank = new Customer_Bank();
        customer_bank.find_customer("2");
        customer_bank.find_customer("4");

        // 3. then, we add the accounts to new customers, and we find printout on the 'List of customers and accounts'
        customer_bank.find_customer_and_add_account("1", "1111");
        customer_bank.find_customer_and_add_account("2", "2222");
        customer_bank.find_customer_and_add_account("3", "3333");
        customer_bank.find_customer_and_add_account("4", "4444");
        customer_bank.find_customer_and_add_account("5", "5555");

        // 4. we check what the customer database looks like after adding the accounts, see printout 'Customers Database'
        customer_bank.find_customer("3");
        customer_bank.find_customer("1");
        customer_bank.find_customer("5");

        // 5. customers deposit funds into their accounts, see printout 'List of customers and funds in the accounts'
        customer_bank.find_customer_and_perform_operation_deposit_on_account("1", "1000000");
        customer_bank.find_customer_and_perform_operation_deposit_on_account("2", "2000000");
        customer_bank.find_customer_and_perform_operation_deposit_on_account("3", "3000000");
        customer_bank.find_customer_and_perform_operation_deposit_on_account("4", "4000000");
        customer_bank.find_customer_and_perform_operation_deposit_on_account("5", "5000000");

        // 6. we randomly check the bank's customers again, see printout 'Customers Database'
        customer_bank.find_customer("3");
        customer_bank.find_customer("1");
        customer_bank.find_customer("5");

        customer_bank.find_customer_v02("3", "3");
        customer_bank.find_customer_v02("1", "1");
        customer_bank.find_customer_v02("5", "5");

        customer_bank.find_customer("3");
        customer_bank.find_customer("1");
        customer_bank.find_customer("5");



        //
        //customer_bank.make_transfer_operation_between_customers("5", "", "");
    }

}
