import java.util.ArrayList;
import java.util.Iterator;

public class Bank {

    static ArrayList<Object> list_of_all_bank_customers = new ArrayList<>();

    public void add_new_customer_to_list_of_bank(){

        String[] data = New_Customer.customer_data;

        System.out.println("\nList of all customers: ");

        list_of_all_bank_customers.add(data);

        Iterator<Object> iterator = list_of_all_bank_customers.iterator();
        while (iterator.hasNext()){
            String[] next = (String[]) iterator.next();

            for (String s:next) {
                System.out.print(s + ", ");
            }

            System.out.println();
        }

    }

}
