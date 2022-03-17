import java.util.HashMap;
import java.util.Map;

public class Bank_Customers {

    public String customer_id;
    public String customer_first_name;
    public String customer_last_name;
    public Integer customer_account_No;
    public Integer customer_account_funds;
    public Map<Integer, Integer> account_No_Funds_Map;

    public Bank_Customers(){}

    /*public Bank_Customers(String customer_id, String customer_first_name, String customer_last_name,
                          Integer customer_account_No, Integer customer_account_funds) {
        this.customer_id = customer_id;
        this.customer_first_name = customer_first_name;
        this.customer_last_name = customer_last_name;
        this.customer_account_No = customer_account_No;
        this.customer_account_funds = customer_account_funds;
    }*/

    public void add_new_customer(String customer_id, String customer_first_name, String customer_last_name){

        this.customer_id = customer_id;
        this.customer_first_name = customer_first_name;
        this.customer_last_name = customer_last_name;

    }


    @Override
    public String toString() {
        return "Bank_Customers{" +
                "customer_id='" + customer_id + '\'' +
                ", customer_first_name='" + customer_first_name + '\'' +
                ", customer_last_name='" + customer_last_name + '\'' +
                ", customer_account_No=" + customer_account_No +
                ", customer_account_funds=" + customer_account_funds +
                ", account_No_Funds_Map=" + account_No_Funds_Map +
                '}';
    }
}
