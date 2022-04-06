import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Bank {

    //static String[][] list_of_all_bank_customers;

    static ArrayList<Object> list_of_all_bank_customers = new ArrayList<>();

    public void add_new_customer_to_list_of_bank(){

        String[] data = New_Customer.customer_data;

        //list_of_all_bank_customers = new String[][]{data};

        System.out.println("List of all customers: ");
        /*for (String [] strings:list_of_all_bank_customers) {
            for (String s:strings) {
                System.out.print(s + ", ");
            }
        }*/

        list_of_all_bank_customers.add(data);
        //System.out.println(list_of_all_bank_customers);

        Iterator<Object> iterator = list_of_all_bank_customers.iterator();
        while (iterator.hasNext()){
            String[] next = (String[]) iterator.next();

            //String[] strings = next;

            for (String s:next) {
                System.out.print(s + ", ");
            }

            String index_0 = next[0];
            System.out.println("index 0: " + index_0);

        }

    }

}
