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
        customer_bank.find_customer_and_perform_operation_deposit_withdrawal_from_account("1", "1000000");
        customer_bank.find_customer_and_perform_operation_deposit_withdrawal_from_account("2", "2000000");
        customer_bank.find_customer_and_perform_operation_deposit_withdrawal_from_account("3", "3000000");
        customer_bank.find_customer_and_perform_operation_deposit_withdrawal_from_account("4", "4000000");
        customer_bank.find_customer_and_perform_operation_deposit_withdrawal_from_account("5", "5000000");

        // 6. we randomly check the bank's customers again, see printout 'Customers Database'
        customer_bank.find_customer("3");
        customer_bank.find_customer("1");
        customer_bank.find_customer("5");

        // 7. customers deposit additional funds in their accounts, see printout 'List of customers and funds in the accounts'
        customer_bank.find_customer_and_perform_operation_deposit_withdrawal_from_account("3", "3");
        customer_bank.find_customer_and_perform_operation_deposit_withdrawal_from_account("1", "1");
        customer_bank.find_customer_and_perform_operation_deposit_withdrawal_from_account("5", "5");

        // 8. re-checking the funds on the customers' account after the transfer of additional funds, see printout 'Customers Database'
        customer_bank.find_customer("3");
        customer_bank.find_customer("1");
        customer_bank.find_customer("5");

        // 9. suppose a customer wants to withdraw some cash
        // 9 a. we check the client's funds before cash withdrawal, (printout 'Customer Database')
        customer_bank.find_customer("2");
        // 9 b. there are sufficient funds on the account, so we perform the operation (printout 'List of customers and funds in the accounts')
        customer_bank.find_customer_and_perform_operation_deposit_withdrawal_from_account("2", "-2");
        // 9 c. re-checking the funds on the customers' account after cash withdrawal, (printout 'Customers Database')
        customer_bank.find_customer("2");

        // 10. transfers between customers,
        // before the transfer, the client with the id 4 has 4,000,000 and the client with the id 2 has 1,999,998
        // the client with id 4 makes a transfer for the client with id 2 for the amount of 4
        // after the transfer, client with id 4 has 3999996 in the account and client with id 2 has 2000002 in the account
        // (printout 'List of customers and funds after transfers between customers')
        customer_bank.find_customers_and_make_transfers_between_customers("4", "-4",
                "2");
        // 10 a. we check clients after the transfer operation, (printout 'Customer Database')
        customer_bank.find_customer("2");
        customer_bank.find_customer("4");

        // 11. let's assume that the client has changed some data, e.g. phone number and we are trying to update his data,
        // see printout 'New, edited OTHER customer data'
        customer_bank.edit_other_customer_details_Other_Data("5", "555-555-555");
        // 11 a. here we check if the operation was successful, (printout 'Customer Database')
        customer_bank.find_customer("5");

        // 12. let's assume that the client has changed some personal data, e.g. surname and we are trying to update his data,
        // see printout 'New, edited PERSONAL customer data'
        customer_bank.edit_personal_customer_details_Name("5", "Fi. Fifth-Quintan");

    }

}
