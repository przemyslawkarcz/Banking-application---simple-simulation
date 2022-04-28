public class Main {

    public static void main(String[] args) {

        // 1. creating new customers of bank and adding them to bank's list of customers,
        // we find the printouts on the 'List of all bank customers'
        Customer customer_ = new Customer();
        customer_.add_new_customer("1", "F. First");
        customer_.add_new_customer("2", "S. Second");
        customer_.add_new_customer("3", "T. Third");
        customer_.add_new_customer("4", "Fo. Fourth");
        customer_.add_new_customer("5", "Fi. Fifth");

        // 2. after creating many customers we try to search them in 'database',
        // we find the printouts on the list 'Customers Database'
        Customer_Bank customer_bank_ = new Customer_Bank();
        customer_bank_.find_customer("2");
        customer_bank_.find_customer("4");

        // 3. then, we add the accounts to new customers, and we find printout on the 'List of customers and accounts'
        customer_bank_.find_customer_and_add_account("1", "1111");
        customer_bank_.find_customer_and_add_account("2", "2222");
        customer_bank_.find_customer_and_add_account("3", "3333");
        customer_bank_.find_customer_and_add_account("4", "4444");
        customer_bank_.find_customer_and_add_account("5", "5555");

        // 4. we check what the customer database looks like after adding the accounts, see printout 'Customers Database'
        customer_bank_.find_customer("3");
        customer_bank_.find_customer("1");
        customer_bank_.find_customer("5");



    }

}
