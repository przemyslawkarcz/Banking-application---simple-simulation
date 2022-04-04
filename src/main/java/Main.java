import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Bank_Customers bank_customers = new Bank_Customers();

        bank_customers.add_new_customer(1, "First", "The First", 1000001, 0);
        bank_customers.add_new_customer(2, "Second", "The Second", 1000002, 0);

        New_Customer new_customer = new New_Customer();
        new_customer.add_customer("1", "11111111111", "First", "Firsty");

        New_Account new_account = new New_Account();
        new_account.setAccount_number("1000000000000001");
        new_account.getAccount_number();

    }

}
