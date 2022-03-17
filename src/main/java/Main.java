import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Bank_Customers bank_customers = new Bank_Customers();
        bank_customers.add_new_customer("000001", "First", "Firsty");

        String s = bank_customers.toString();
        System.out.println(s);
    }

}
