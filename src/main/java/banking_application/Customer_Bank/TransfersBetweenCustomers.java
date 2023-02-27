package banking_application.Customer_Bank;

import banking_application.Bank.Bank;
import banking_application.Customer.Customer;
import java.util.ArrayList;
import java.util.Iterator;

public class TransfersBetweenCustomers {

    protected void find_customers_and_make_transfers_between_customers(String id_of_client_ordering_transfer, String transfer_amount,
                                                                    String id_of_client_receiving_transfer) {

        System.out.println("\n* * * List of customers and funds after transfers between customers * * *");

        ArrayList<Object> bank_customer_list = Bank.getBank_customer_list();

        Customer customer = new Customer();
        customer.setAccount_funds(transfer_amount);

        Iterator<Object> iterator = bank_customer_list.iterator();
        while (iterator.hasNext()) {
            String[] next = (String[]) iterator.next();

            if (next[0].equals(id_of_client_ordering_transfer)) {

                int parsedFunds01 = Integer.parseInt(customer.getAccount_funds());
                int parsedFunds02 = Integer.parseInt(next[3]);
                int fundsTotal = parsedFunds01 + parsedFunds02;
                next[3] = String.valueOf(fundsTotal);

                System.out.println(
                        "Customer: " +
                                "id='" + next[0] + '\'' +
                                ", full_name='" + next[1] + '\'' +
                                ", account_number='" + next[2] + '\'' +
                                ", account_before_transfer='" + parsedFunds02 + '\'' +
                                ", amount_charged='" + parsedFunds01 + '\'' +
                                ", account_after_transfer='" + next[3] + '\'' +
                                ", other_data='" + next[4] + '\''
                );

            }

        }

        int parsedTransferAmount = Integer.parseInt(transfer_amount);
        int parsedTransferAmountReversed = parsedTransferAmount * (-1);
        String transferAmountAsStringAgain = String.valueOf(parsedTransferAmountReversed);

        Customer customer2 = new Customer();
        customer2.setAccount_funds(transferAmountAsStringAgain);

        Iterator<Object> iterator2 = bank_customer_list.iterator();
        while (iterator2.hasNext()) {
            String[] next = (String[]) iterator2.next();

            if (next[0].equals(id_of_client_receiving_transfer)) {

                int parsedFunds01 = Integer.parseInt(customer2.getAccount_funds());
                int parsedFunds02 = Integer.parseInt(next[3]);
                int fundsTotal = parsedFunds01 + parsedFunds02;
                next[3] = String.valueOf(fundsTotal);

                System.out.println(
                        "Customer: " +
                                "id='" + next[0] + '\'' +
                                ", full_name='" + next[1] + '\'' +
                                ", account_number='" + next[2] + '\'' +
                                ", account_before_transfer='" + parsedFunds02 + '\'' +
                                ", amount_received='" + parsedFunds01 + '\'' +
                                ", account_after_transfer='" + next[3] + '\'' +
                                ", other_data='" + next[4] + '\''
                );

            }

        }

    }

}
