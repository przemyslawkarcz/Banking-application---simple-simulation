package banking_application;

import banking_application.Customer.Customer_Facade;
import banking_application.Customer_Bank.Customer_Bank_Facade;

public class AppRunner {

    public static void main(String[] args) {

        Customer_Facade customer_facade = new Customer_Facade();
        Customer_Bank_Facade customer_bank_facade = new Customer_Bank_Facade();

        // 1. Creating new two customers of bank and adding them to bank's list of customers, see 'List of all bank customers'
        customer_facade.insertNewCustomer("1", "F. First");
        customer_facade.insertNewCustomer("2", "S. Second");

        // 2. After creating customers we try to search them in 'database', see 'Customers Database'
        customer_bank_facade.searchCustomer("1");
        customer_bank_facade.searchCustomer("2");

        // 3. Then, we add the accounts to new customers, see 'List of customers and accounts'
        customer_bank_facade.searchCustomerAndSetsUpAccount("1", "1111");
        customer_bank_facade.searchCustomerAndSetsUpAccount("2", "2222");

        // 4. Customers deposit funds into their accounts, see 'List of customers and funds in the accounts'
        customer_bank_facade.searchCustomerAndPerformsOperationsOnAccount("1", "1000000");
        customer_bank_facade.searchCustomerAndPerformsOperationsOnAccount("2", "2000000");

        // 5. Customers deposit additional funds in their accounts, see 'List of customers and funds in the accounts'
        customer_bank_facade.searchCustomerAndPerformsOperationsOnAccount("1", "1");
        customer_bank_facade.searchCustomerAndPerformsOperationsOnAccount("2", "2");

        // 6. Suppose a customer with id=2 wants to withdraw some cash e.g.: 2, see 'List of customers and funds in the accounts')
        customer_bank_facade.searchCustomerAndPerformsOperationsOnAccount("2", "-2");

        // 7. Transfers between customers, customer 2 makes transfer for customer 1 for 500,000 see 'List of customers and funds
        // after transfers between customers'
        customer_bank_facade.searchCustomersAndMakeTransferBetweenThem("2", "-500000",
                "1");

        // 8. Let's assume that the customer has changed some data, e.g. phone number and we are trying to update his data,
        // see 'New, edited OTHER customer data'
        customer_bank_facade.searchCustomerAndEditOtherData("1", "111-111-111");

        // 12. Let's assume that the customer has changed some personal data, e.g. surname and we are trying to update his data,
        // see 'New, edited PERSONAL customer data'
        customer_bank_facade.searchCustomerAndEditName("1", "Fir. First");

    }

}
