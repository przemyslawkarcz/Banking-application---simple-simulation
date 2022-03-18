import java.util.HashMap;
import java.util.Map;

public class Bank_Customers {

    public Integer customer_id;
    public String customer_first_name;
    public String customer_last_name;

    public Bank_Customers(){}

    public Bank_Customers(Integer customer_id, String customer_first_name, String customer_last_name) {
        this.customer_id = customer_id;
        this.customer_first_name = customer_first_name;
        this.customer_last_name = customer_last_name;
    }

    public void add_new_customer(Integer id, String first_name, String last_name,
                                 Integer account_number, Integer account_funds){

        Bank_Customers new_customer = new Bank_Customers(id, first_name, last_name);

        Print print = new Print();
        print.print_customer_detail();
        print.print_account_detail();


    }

    public Integer getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(Integer customer_id) {
        this.customer_id = customer_id;
    }

    public String getCustomer_first_name() {
        return customer_first_name;
    }

    public void setCustomer_first_name(String customer_first_name) {
        this.customer_first_name = customer_first_name;
    }

    public String getCustomer_last_name() {
        return customer_last_name;
    }

    public void setCustomer_last_name(String customer_last_name) {
        this.customer_last_name = customer_last_name;
    }




}
