import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Iterator;

public class Customer_BankTest {

    @Test
    public void find_customer_test_01(){

        Customer customer = new Customer();
        customer.add_new_customer("11", "E. Eleventh");

        Customer_Bank customer_bank = new Customer_Bank();
        customer_bank.find_customer("11");

        ArrayList<Object> bank_customer_list = Bank.getBank_customer_list();

        String[] next = new String[0];

        Iterator<Object> iterator = bank_customer_list.iterator();
        while (iterator.hasNext()){
            next = (String[]) iterator.next();

        }

        Assertions.assertEquals("11", next[0]);

    }

    @Test
    public void find_customer_test_02(){

        Customer customer = new Customer();
        customer.add_new_customer("12", "T. Twelfth");

        Customer_Bank customer_bank = new Customer_Bank();
        customer_bank.find_customer("11");

        ArrayList<Object> bank_customer_list = Bank.getBank_customer_list();

        String[] next = new String[0];

        Iterator<Object> iterator = bank_customer_list.iterator();
        while (iterator.hasNext()){
            next = (String[]) iterator.next();

        }

        Assertions.assertNotEquals("13", next[0]);

    }


}
