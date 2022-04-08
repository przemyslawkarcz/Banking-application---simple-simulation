import java.util.ArrayList;
import java.util.Iterator;

public class Customer_Account {

    public void find_customer (String customer_id){

        ArrayList<Object> list_of_all_bank_customers = Bank.list_of_all_bank_customers;

        String [] next;

        String id;
        String full_name;
        String account_no;
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

                System.out.println("\n* * * Customers DataBase: * * *");
                System.out.println("ID: " + id);
                System.out.println("Full name: " + full_name);
                System.out.println("Account No.: " + account_no);
                System.out.println("Funds: " + funds);
                System.out.println("Other: " + other);
                System.out.println();
            }

        }

    }

    public void find_customer_and_create_account_for_customer (String customer_id, String account_number){

        New_Account new_account = new New_Account();
        String number = new_account.create_account_number(account_number);

        ArrayList<Object> list_of_all_bank_customers = Bank.list_of_all_bank_customers;

        String [] next;

        String id;
        String full_name;
        String account_no;
        String funds;
        String other;

        Iterator<Object> iterator = list_of_all_bank_customers.iterator();
        while (iterator.hasNext()){
            next = (String[]) iterator.next();

            id = next[0];
            full_name = next[1];
            next[2] = number;
            funds = next[3];
            other = next[4];

            if (id.equalsIgnoreCase(customer_id)){

                System.out.println("\n* * * Assigned account to customer: * * *");
                System.out.println("ID: " + id);
                System.out.println("Full name: " + full_name);
                System.out.println("Account No.: " + number);
                System.out.println("Funds: " + funds);
                System.out.println("Other: " + other);
                System.out.println();
            }

        }

    }

}
