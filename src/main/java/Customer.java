import java.util.Iterator;

public class Customer {

    public String id;
    public String full_name;
    public String account_number = "....";
    public String account_funds = "0";
    public String other_data = "....";
    public String[] customer_tab;

    public void add_new_customer(String id, String full_name) {
        this.id = id;
        this.full_name = full_name;

        customer_tab = new String[5];
        customer_tab[0] = id;
        customer_tab[1] = full_name;
        customer_tab[2] = account_number;
        customer_tab[3] = account_funds;
        customer_tab[4] = other_data;

        Bank.bank_customer_list.add(customer_tab);

        System.out.println("\n* * * List of all bank customers * * *");

        Iterator<Object> iterator = Bank.bank_customer_list.iterator();
        while (iterator.hasNext()){
            String[] next = (String[]) iterator.next();

            System.out.println(
                    "Customer: " +
                            "id='" + next[0] + '\'' +
                            ", full_name='" + next[1] + '\'' +
                            ", account_number='" + next[2] + '\'' +
                            ", account_funds='" + next[3] + '\'' +
                            ", other_data='" + next[4] + '\''
            );

        }

    }

    public Customer(String id, String full_name, String account_number, String account_funds, String other_data) {
        this.id = id;
        this.full_name = full_name;
        this.account_number = account_number;
        this.account_funds = account_funds;
        this.other_data = other_data;
    }

    public Customer(){};

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public String getAccount_number() {
        return account_number;
    }

    public void setAccount_number(String account_number) {
        this.account_number = account_number;
    }

    public String getAccount_funds() {
        return account_funds;
    }

    public void setAccount_funds(String account_funds) {
        this.account_funds = account_funds;
    }

    public String getOther_data() {
        return other_data;
    }

    public void setOther_data(String other_data) {
        this.other_data = other_data;
    }

    public String[] getCustomer_tab() {
        return customer_tab;
    }

    public void setCustomer_tab(String[] customer_tab) {
        this.customer_tab = customer_tab;
    }

    @Override
    public String toString() {
        return "Customer_2{" +
                "id='" + id + '\'' +
                ", full_name='" + full_name + '\'' +
                ", account_number='" + account_number + '\'' +
                ", account_funds='" + account_funds + '\'' +
                ", other_data='" + other_data + '\'' +
                '}';
    }

}
