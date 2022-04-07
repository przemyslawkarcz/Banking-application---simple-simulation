import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Customer_Account {

    public void assign_customer_to_account (String customer_id){

        New_Customer new_customer = new New_Customer();
        New_Account new_account = new New_Account();

    }

    public void find_customer(String customer_id){

        ArrayList<Object> list_of_all_bank_customers = Bank.list_of_all_bank_customers;

        String [] next;

        String id;
        String full_name;
        String account_no = null;
        String funds;
        String other;

        Iterator<Object> iterator = list_of_all_bank_customers.iterator();
        while (iterator.hasNext()){
            next = (String[]) iterator.next();

            id = next[0];
            full_name = next[1];
            account_no = next[2];
            funds = next[3];
            other = next[4];

            if (id.equalsIgnoreCase(customer_id)){

                System.out.println("ID: " + id);
                System.out.println("Full name: " + full_name);
                System.out.println("Account No.: " + account_no);
                System.out.println("Funds: " + funds);
                System.out.println("Other: " + other);

            }

        }

    }

    public String find_customer_and_assign_account(String customer_id){

        ArrayList<Object> list_of_all_bank_customers = Bank.list_of_all_bank_customers;

        String [] next;

        String id;
        String full_name;
        String account_no = null;
        String funds;
        String other;

        Iterator<Object> iterator = list_of_all_bank_customers.iterator();
        while (iterator.hasNext()){
            next = (String[]) iterator.next();

            id = next[0];
            full_name = next[1];
            account_no = next[2];
            funds = next[3];
            other = next[4];

            if (id.equalsIgnoreCase(customer_id)){

                System.out.println("ID: " + id);
                System.out.println("Full name: " + full_name);
                System.out.println("Account No.: " + account_no);
                System.out.println("Funds: " + funds);
                System.out.println("Other: " + other);

            }

        }

        return account_no;

    }

}
