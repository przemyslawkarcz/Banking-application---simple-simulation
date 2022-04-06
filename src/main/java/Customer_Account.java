import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Customer_Account {

    public void assign_customer_to_account (String id_bank){

        New_Customer new_customer = new New_Customer();
        New_Account new_account = new New_Account();





    }

    public void find_customer(String customer_id){

        ArrayList<Object> list_of_all_bank_customers = Bank.list_of_all_bank_customers;

        Iterator<Object> iterator = list_of_all_bank_customers.iterator();
        while (iterator.hasNext()){
            String[] next = (String[]) iterator.next();

            //System.out.println("Find: ");

            String index_0 = next[0];
            String index_1 = next[1];
            String index_2 = next[2];
            String index_3 = next[3];
            String index_4 = next[4];
            //System.out.println("index 0: " + index_0);

            if (index_0.equalsIgnoreCase(customer_id)){

                System.out.println("ID: " + index_0);
                System.out.println("Full name: " + index_1);
                System.out.println("Account No.: " + index_2);
                System.out.println("Funds: " + index_3);
                System.out.println("Other: " + index_4);
                //System.out.println("There is no such client in the database.");

            }//xxxxxxxxxxxxxxxxxxxxx tu skończyłem

        }


    }

}
