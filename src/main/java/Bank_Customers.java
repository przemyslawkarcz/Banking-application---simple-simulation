public class Bank_Customers {

    public String customer_id;
    public String customer_first_name;
    public String customer_last_name;

    public Bank_Customers(){}

    public Bank_Customers(String customer_id, String customer_first_name, String customer_last_name) {
        this.customer_id = customer_id;
        this.customer_first_name = customer_first_name;
        this.customer_last_name = customer_last_name;
    }

    public String getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(String customer_id) {
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

    @Override
    public String toString() {
        return "Bank_Customers{" +
                "customer_id='" + customer_id + '\'' +
                ", customer_first_name='" + customer_first_name + '\'' +
                ", customer_last_name='" + customer_last_name + '\'' +
                '}';
    }
    
}
