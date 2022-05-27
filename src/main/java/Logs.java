import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class Logs {

    public static String[] customer_log;

    public static void generates_log_when_adding_new_customer(String customerId){

        /*ArrayList<Object> bank_customer_list = Bank.getBank_customer_list();

        Iterator<Object> iterator = bank_customer_list.iterator();
        while (iterator.hasNext()){

            String[] next = (String[]) iterator.next();

            if (next[0].equals(customerId)){

                System.out.println(next[0]);
                System.out.println(next[1]);
                System.out.println(next[2]);
                System.out.println(next[3]);
                System.out.println(next[4]);

            }

        }*/

        Customer customer = new Customer();

        int generated_Log_Value = new Random().nextInt(1000000000);

        String generated_Log_Value_parsed = String.valueOf(generated_Log_Value);

        String log_record = "000".concat(customerId).concat("-").concat(generated_Log_Value_parsed).concat("-").concat("000").concat(customerId);

        System.out.println("log record: " + log_record);

        //tu skończyłem xxxxxxxxxxxxxxxxxxxxx 27.05

        //customer.customer_log[0] = log_record;

        //Bank.bank_customer_log_list.add(customer.customer_log);

    }






    public String[] getCustomer_log() {
        return customer_log;
    }

    public void setCustomer_log(String[] customer_log) {
        this.customer_log = customer_log;
    }
}
