package banking_application.Customer;

public class Customer_Facade {

    public void insertNewCustomer(String id, String full_name){

        Customer customer = new Customer();
        customer.add_new_customer(id, full_name);

    }

}
