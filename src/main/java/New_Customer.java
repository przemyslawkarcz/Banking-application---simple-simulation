import com.sun.security.auth.UnixNumericGroupPrincipal;

public class New_Customer {

    String [] customer_data;

    public String[] getCustomer_data() {
        return customer_data;
    }

    public void setCustomer_data(String[] customer_data) {
        this.customer_data = customer_data;
    }

    public void add_new_customer (String id, String full_name){

        String [] tab = new String[]{id, full_name, null, null, null};

        setCustomer_data(tab);

        for (String s:customer_data) {
            System.out.print(s + " | ");
        }

    }





}
