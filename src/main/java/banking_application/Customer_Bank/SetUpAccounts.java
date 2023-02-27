package banking_application.Customer_Bank;

import banking_application.Bank.Bank;
import banking_application.Customer.Customer;
import java.util.ArrayList;
import java.util.Iterator;

public class SetUpAccounts {

    protected void find_customer_and_add_account(String id, String account_no){

        System.out.println("\n* * * List of customers and accounts * * *");

        ArrayList<Object> bank_customer_list = Bank.getBank_customer_list();

        Customer customer_ = new Customer();
        customer_.setAccount_number(account_no);

        Iterator<Object> iterator = bank_customer_list.iterator();
        while (iterator.hasNext()){
            String [] next = (String []) iterator.next();

            if (next[0].equals(id)){

                next[2] = customer_.getAccount_number();

                System.out.println(
                        "Customer: " +
                                "id='" + next[0] + '\'' +
                                ", full_name='" + next[1] + '\'' +
                                ", account_number='" + next[2] + '\'' +
                                ", account_funds='" + next[3] + '\'' +
                                ", other_data='" + next[4] + '\''
                );

            }

        }

    }

}
