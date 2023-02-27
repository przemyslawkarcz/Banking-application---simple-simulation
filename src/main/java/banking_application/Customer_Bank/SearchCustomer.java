package banking_application.Customer_Bank;

import banking_application.Bank.Bank;
import java.util.ArrayList;
import java.util.Iterator;

public class SearchCustomer {

    protected void find_customer(String id){

        System.out.println("\n* * * Customers Database * * *");

        ArrayList<Object> bank_customer_list = Bank.getBank_customer_list();

        Iterator<Object> iterator = bank_customer_list.iterator();
        while (iterator.hasNext()){
            String [] next = (String []) iterator.next();

            if (next[0].equals(id)){

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
