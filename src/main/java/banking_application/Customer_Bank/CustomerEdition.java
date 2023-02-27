package banking_application.Customer_Bank;

import banking_application.Bank.Bank;
import banking_application.Customer.Customer;
import java.util.ArrayList;
import java.util.Iterator;

public class CustomerEdition {
    protected void edit_other_customer_details_Other_Data(String id, String other_data){

        System.out.println("\n* * * New, edited OTHER customer data * * *");

        ArrayList<Object> bank_customer_list = Bank.getBank_customer_list();

        Customer customer = new Customer();
        customer.setOther_data(other_data);

        Iterator<Object> iterator = bank_customer_list.iterator();
        while (iterator.hasNext()){
            String [] next = (String []) iterator.next();

            if (next[0].equals(id)){

                next[4] = customer.getOther_data();

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

    protected void edit_personal_customer_details_Name(String id, String new_personal_data){

        System.out.println("\n* * * New, edited PERSONAL customer data * * *");

        ArrayList<Object> bank_customer_list = Bank.getBank_customer_list();

        Customer customer = new Customer();
        customer.setFull_name(new_personal_data);

        Iterator<Object> iterator = bank_customer_list.iterator();
        while (iterator.hasNext()){
            String [] next = (String []) iterator.next();

            if (next[0].equals(id)){

                next[1] = customer.getFull_name();

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
