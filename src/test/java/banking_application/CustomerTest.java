package banking_application;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Iterator;

public class CustomerTest {

    @Test
    public void add_new_customer_test_01(){

        //given
        String id = "12345678";
        String full_name = "abcdefgh";

        //when
        Customer customer = new Customer();
        customer.add_new_customer(id, full_name);

        //then
        ArrayList<Object> bank_customer_list = Bank.getBank_customer_list();

        String [] next = new String[0];

        Iterator<Object> iterator = bank_customer_list.iterator();
        while (iterator.hasNext()){
            next = (String[]) iterator.next();

        }

        Assertions.assertEquals("12345678", next[0]);

    }

    @Test
    public void add_new_customer_test_02(){

        //given
        String id = "12345678";
        String full_name = "abcdefgh";

        //when
        Customer customer = new Customer();
        customer.add_new_customer(id, full_name);

        //then
        ArrayList<Object> bank_customer_list = Bank.getBank_customer_list();

        String [] next = new String[0];

        Iterator<Object> iterator = bank_customer_list.iterator();
        while (iterator.hasNext()){
            next = (String[]) iterator.next();

        }

        Assertions.assertNotEquals("123456789", next[0]);

    }

    @Test
    public void add_new_customer_test_03(){

        //given
        String id = "12345678";
        String full_name = "abcdefgh";

        //when
        Customer customer = new Customer();
        customer.add_new_customer(id, full_name);

        //then
        ArrayList<Object> bank_customer_list = Bank.getBank_customer_list();

        String [] next = new String[0];

        Iterator<Object> iterator = bank_customer_list.iterator();
        while (iterator.hasNext()){
            next = (String[]) iterator.next();

        }

        Assertions.assertEquals("abcdefgh", next[1]);

    }

    @Test
    public void add_new_customer_test_04(){

        //given
        String id = "12345678";
        String full_name = "abcdefgh";

        //when
        Customer customer = new Customer();
        customer.add_new_customer(id, full_name);

        //then
        ArrayList<Object> bank_customer_list = Bank.getBank_customer_list();

        String [] next = new String[0];

        Iterator<Object> iterator = bank_customer_list.iterator();
        while (iterator.hasNext()){
            next = (String[]) iterator.next();

        }

        Assertions.assertNotEquals("abcdefghi", next[1]);

    }

}
