import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Iterator;

public class Customer_BankTest {

    @Test
    public void find_customer_test_01(){

        //given, when
        Customer customer = new Customer();
        customer.add_new_customer("11", "E. Eleventh");

        //then
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

        //given, when
        Customer customer = new Customer();
        customer.add_new_customer("12", "T. Twelfth");

        //then
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

        //given
        Customer customer = new Customer();
        customer.add_new_customer("3333", "T. Three thousand three hundred and thirty-third");

        //when
        Customer_Bank customer_bank = new Customer_Bank();
        customer_bank.find_customer_and_add_account("3333", "3333");

        //then
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

        //given
        Customer customer = new Customer();
        customer.add_new_customer("3334", "T. Three thousand three hundred and thirty-fourth");

        //when
        Customer_Bank customer_bank = new Customer_Bank();
        customer_bank.find_customer_and_add_account("3334", "3334");

        //then
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

        //given
        Customer customer = new Customer();
        customer.add_new_customer("10001", "T. Ten thousand first");

        Customer_Bank customer_bank = new Customer_Bank();
        customer_bank.find_customer_and_add_account("10001", "10001");

        //when
        customer_bank.find_customer_and_perform_operation_deposit_withdrawal_from_account("10001", "10000001");

        //then
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

        //given
        Customer customer = new Customer();
        customer.add_new_customer("999", "N. Nine hundred and ninety-ninth");

        Customer_Bank customer_bank = new Customer_Bank();
        customer_bank.find_customer_and_add_account("999", "9999");

        //when
        customer_bank.find_customer_and_perform_operation_deposit_withdrawal_from_account("999", "999999");

        //then
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

        //given
        Customer customer = new Customer();
        customer.add_new_customer("1234", "F. 123-fourth");
        customer.add_new_customer("1235", "F. 123-fifth");

        Customer_Bank customer_bank = new Customer_Bank();
        customer_bank.find_customer_and_add_account("1234", "1234");
        customer_bank.find_customer_and_add_account("1235", "1235");

        customer_bank.find_customer_and_perform_operation_deposit_withdrawal_from_account("1234", "400");
        customer_bank.find_customer_and_perform_operation_deposit_withdrawal_from_account("1235", "500");

        //when
        customer_bank.find_customers_and_make_transfers_between_customers("1234", "-400",
                "1235");

        //then
        ArrayList<Object> bank_customer_list = Bank.getBank_customer_list();

        String[] next = new String[0];

        Iterator<Object> iterator = bank_customer_list.iterator();
        while (iterator.hasNext()){
            next = (String[])iterator.next();

        }

        Assertions.assertEquals("900", next[3]);

    }

    @Test
    public void find_customers_and_make_transfers_between_customers_test_02(){

        //given
        Customer customer = new Customer();
        customer.add_new_customer("12345678", "F. 1234567-eighth");
        customer.add_new_customer("12345679", "F. 1234567-ninth");

        Customer_Bank customer_bank = new Customer_Bank();
        customer_bank.find_customer_and_add_account("12345678", "12345678");
        customer_bank.find_customer_and_add_account("12345679", "12345679");

        customer_bank.find_customer_and_perform_operation_deposit_withdrawal_from_account("12345678", "1000");
        customer_bank.find_customer_and_perform_operation_deposit_withdrawal_from_account("12345679", "2000");

        //when
        customer_bank.find_customers_and_make_transfers_between_customers("12345679", "-2000",
                "12345678");

        //then
        ArrayList<Object> bank_customer_list = Bank.getBank_customer_list();

        String[] next = new String[0];

        Iterator<Object> iterator = bank_customer_list.iterator();
        while (iterator.hasNext()){
            next = (String[])iterator.next();

        }

        Assertions.assertNotEquals("1", next[3]);

    }

    @Test
    public void edit_other_customer_details_Other_Data_test_01(){

        //given
        Customer customer = new Customer();
        customer.add_new_customer("111555777", "F. Seventh");

        //when
        Customer_Bank customer_bank = new Customer_Bank();
        customer_bank.edit_other_customer_details_Other_Data("111555777", "Mob: 999-888-777");

        //then
        ArrayList<Object> bank_customer_list = Bank.getBank_customer_list();

        String[] next = new String[0];

        Iterator<Object> iterator = bank_customer_list.iterator();
        while (iterator.hasNext()){
            next = (String[]) iterator.next();

        }

        Assertions.assertEquals("Mob: 999-888-777", next[4]);

    }

    @Test
    public void edit_other_customer_details_Other_Data_test_02(){

        //given
        Customer customer = new Customer();
        customer.add_new_customer("111555777222", "F. Second");

        //when
        Customer_Bank customer_bank = new Customer_Bank();
        customer_bank.edit_other_customer_details_Other_Data("111555777222", "Mob: 999-888-222");

        //then
        ArrayList<Object> bank_customer_list = Bank.getBank_customer_list();

        String[] next = new String[0];

        Iterator<Object> iterator = bank_customer_list.iterator();
        while (iterator.hasNext()){
            next = (String[]) iterator.next();

        }

        Assertions.assertNotEquals("Mob: 999-888-2221", next[4]);

    }

    @Test
    public void edit_personal_customer_details_Name_test_01(){

        //given
        Customer customer = new Customer();
        customer.add_new_customer("999888777", "N. Ninth-Eighth-Seventh");

        //when
        Customer_Bank customer_bank = new Customer_Bank();
        customer_bank.edit_personal_customer_details_Name("999888777", "N. Seventh");

        //then
        ArrayList<Object> bank_customer_list = Bank.getBank_customer_list();

        String[] next = new String[0];

        Iterator<Object> iterator = bank_customer_list.iterator();
        while (iterator.hasNext()){
            next = (String[]) iterator.next();

        }

        Assertions.assertEquals("N. Seventh", next[1]);

    }

    @Test
    public void edit_personal_customer_details_Name_test_02(){

        //given
        Customer customer = new Customer();
        customer.add_new_customer("999888111", "N. Ninth-Eighth-First");

        //when
        Customer_Bank customer_bank = new Customer_Bank();
        customer_bank.edit_personal_customer_details_Name("999888111", "N. First");

        //then
        ArrayList<Object> bank_customer_list = Bank.getBank_customer_list();

        String[] next = new String[0];

        Iterator<Object> iterator = bank_customer_list.iterator();
        while(iterator.hasNext()){
            next = (String[]) iterator.next();

        }

        Assertions.assertNotEquals("N. Ninth-Eighth-First", next[1]);

    }

    // 3. uzupełnić plik README

}
