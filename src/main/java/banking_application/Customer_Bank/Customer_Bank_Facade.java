package banking_application.Customer_Bank;

public class Customer_Bank_Facade {

    public void searchCustomer(String id){

        SearchCustomer searchCustomer = new SearchCustomer();
        searchCustomer.find_customer(id);

    }

    public void searchCustomerAndSetsUpAccount(String id, String account_no){

        SetUpAccounts setUpAccounts = new SetUpAccounts();
        setUpAccounts.find_customer_and_add_account(id, account_no);

    }

    public void searchCustomerAndPerformsOperationsOnAccount(String id, String funds){

        AccountOperations accountOperations = new AccountOperations();
        accountOperations.find_customer_and_perform_operation_deposit_withdrawal_from_account(id, funds);

    }

    public void searchCustomersAndMakeTransferBetweenThem(String id_of_client_ordering_transfer, String transfer_amount,
                                   String id_of_client_receiving_transfer){

        TransfersBetweenCustomers transfersBetweenCustomers = new TransfersBetweenCustomers();
        transfersBetweenCustomers.find_customers_and_make_transfers_between_customers(id_of_client_ordering_transfer, transfer_amount,
        id_of_client_receiving_transfer);

    }

    public void searchCustomerAndEditOtherData(String id, String other_data){

        CustomerEdition customerEdition = new CustomerEdition();
        customerEdition.edit_other_customer_details_Other_Data(id, other_data);

    }

    public void searchCustomerAndEditName(String id, String name){

        CustomerEdition customerEdition = new CustomerEdition();
        customerEdition.edit_personal_customer_details_Name(id, name);

    }

}
