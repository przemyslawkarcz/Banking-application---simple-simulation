import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Iterator;

public class Customer_BankTest {

    @Test
    public void find_customer_test_01(){

        Customer customer = new Customer();
        customer.add_new_customer("11", "E. Eleventh");

        //Customer_Bank customer_bank = new Customer_Bank();
        //customer_bank.find_customer("11");

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

        //Customer_Bank customer_bank = new Customer_Bank();
        //customer_bank.find_customer("11");

        ArrayList<Object> bank_customer_list = Bank.getBank_customer_list();

        String[] next = new String[0];

        Iterator<Object> iterator = bank_customer_list.iterator();
        while (iterator.hasNext()){
            next = (String[]) iterator.next();

        }

        Assertions.assertNotEquals("13", next[0]);

    }

    @Test
    public void find_customer_and_add_account_test_01(){

        Customer customer = new Customer();
        customer.add_new_customer("3333", "T. Three thousand three hundred and thirty-third");

        Customer_Bank customer_bank = new Customer_Bank();
        customer_bank.find_customer_and_add_account("3333", "3333");

        ArrayList<Object> bank_customer_list = Bank.getBank_customer_list();

        String[] next = new  String[0];

        Iterator<Object> iterator = bank_customer_list.iterator();
        while (iterator.hasNext()){
            next = (String[]) iterator.next();

        }

        Assertions.assertEquals("3333", next[2]);

    }

    @Test
    public void find_customer_and_add_account_test_02(){

        Customer customer = new Customer();
        customer.add_new_customer("3334", "T. Three thousand three hundred and thirty-fourth");

        Customer_Bank customer_bank = new Customer_Bank();
        customer_bank.find_customer_and_add_account("3334", "3334");

        ArrayList<Object> bank_customer_list = Bank.getBank_customer_list();

        String[] next = new  String[0];

        Iterator<Object> iterator = bank_customer_list.iterator();
        while (iterator.hasNext()){
            next = (String[]) iterator.next();

        }

        Assertions.assertNotEquals("3335", next[2]);

    }

    @Test
    public void find_customer_and_perform_operation_deposit_withdrawal_from_account_test_01(){

        Customer customer = new Customer();
        customer.add_new_customer("10001", "T. Ten thousand first");

        Customer_Bank customer_bank = new Customer_Bank();
        customer_bank.find_customer_and_add_account("10001", "10001");
        customer_bank.find_customer_and_perform_operation_deposit_withdrawal_from_account("10001", "10000001");

        ArrayList<Object> bank_customer_list = Bank.getBank_customer_list();

        String[] next = new String[0];

        Iterator<Object> iterator = bank_customer_list.iterator();
        while (iterator.hasNext()){
            next = (String[]) iterator.next();

        }

        Assertions.assertEquals("10000001", next[3]);

    }

    @Test
    public void find_customer_and_perform_operation_deposit_withdrawal_from_account_test_02(){

        Customer customer = new Customer();
        customer.add_new_customer("999", "N. Nine hundred and ninety-ninth");

        Customer_Bank customer_bank = new Customer_Bank();
        customer_bank.find_customer_and_add_account("999", "9999");
        customer_bank.find_customer_and_perform_operation_deposit_withdrawal_from_account("999", "999999");

        ArrayList<Object> bank_customer_list = Bank.getBank_customer_list();

        String[] next = new String[0];

        Iterator<Object> iterator = bank_customer_list.iterator();
        while (iterator.hasNext()){
            next = (String[]) iterator.next();

        }

        Assertions.assertNotEquals("1000000", next[3]);

    }

    @Test
    public void find_customers_and_make_transfers_between_customers_test_01(){

        Customer customer = new Customer();
        customer.add_new_customer("1234", "F. 123-fourth");
        customer.add_new_customer("1235", "F. 123-fifth");

        Customer_Bank customer_bank = new Customer_Bank();
        customer_bank.find_customer_and_add_account("1234", "1234");
        customer_bank.find_customer_and_add_account("1235", "1235");

        customer_bank.find_customer_and_perform_operation_deposit_withdrawal_from_account("1234", "400");
        customer_bank.find_customer_and_perform_operation_deposit_withdrawal_from_account("1235", "500");

        customer_bank.find_customers_and_make_transfers_between_customers("1234", "-400",
                "1235");

        ArrayList<Object> bank_customer_list = Bank.getBank_customer_list();

        String[] next = new String[0];

        Iterator<Object> iterator = bank_customer_list.iterator();
        while (iterator.hasNext()){
            next = (String[])iterator.next();

        }

        Assertions.assertEquals("900", next[3]);

    }

    // 1. dokończyć testy
    // 2. można by dodać do wybranych metod logi, które tworzyły by się automatycznie,
    // logi te mogły by być podobne jak te z zadania CS, można by również
    // zrobić tak aby te logi działały podobnie jak z zadania CS
    // 3. uzupełnić plik README

}
