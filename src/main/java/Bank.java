public class Bank {

    String [] list_of_all_bank_customers;

    public void add_new_customer_to_list_of_bank(){

        New_Customer new_customer = new New_Customer();
        String[] customer_data = new_customer.getCustomer_data();

        for (String s:customer_data) {
            System.out.print(s + ", ");
        }

    }

}
