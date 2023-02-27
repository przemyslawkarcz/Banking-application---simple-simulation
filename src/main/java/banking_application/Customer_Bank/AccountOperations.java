package banking_application.Customer_Bank;

import banking_application.Bank.Bank;
import banking_application.Customer.Customer;
import java.util.ArrayList;
import java.util.Iterator;

public class AccountOperations {

    protected void find_customer_and_perform_operation_deposit_withdrawal_from_account(String id, String funds){

        System.out.println("\n* * * List of customers and funds in the accounts * * *");

        ArrayList<Object> bank_customer_list = Bank.getBank_customer_list();

        Customer customer = new Customer();
        customer.setAccount_funds(funds);

        Iterator<Object> iterator = bank_customer_list.iterator();
        while (iterator.hasNext()){
            String [] next = (String []) iterator.next();

            if (next[0].equals(id)){

                //next[3] = customer.getAccount_funds();

                int parsedFunds01 = Integer.parseInt(customer.getAccount_funds());
                int parsedFunds02 = Integer.parseInt(next[3]);
                int fundsTotal = parsedFunds01 + parsedFunds02;
                next[3] = String.valueOf(fundsTotal);

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
