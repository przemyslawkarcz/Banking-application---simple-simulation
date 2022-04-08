
public class New_Customer {

    static String [] customer_data;

    public String[] getCustomer_data() {
        return customer_data;
    }

    public void setCustomer_data(String[] customer_data) {
        New_Customer.customer_data = customer_data;
    }

    public void add_new_customer (String id, String full_name){

        String fill_in_account_details = "fill in account details";
        String funds_in_the_account = "fill in funds details";
        String other_data = "other_data";

        String [] tab = new String[]{id, full_name, fill_in_account_details, funds_in_the_account, other_data};

        setCustomer_data(tab);

        System.out.println();
        for (String s:customer_data) {
            System.out.print(s + " | ");
        }
        System.out.println();

    }





}
