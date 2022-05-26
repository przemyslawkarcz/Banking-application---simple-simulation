import java.util.ArrayList;
import java.util.Iterator;

public class Customer_Bank {

    public void find_customer(String id){

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

    public void find_customer_and_add_account(String id, String account_no){

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

    public void find_customer_and_perform_operation_deposit_withdrawal_from_account(String id, String funds){

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

    public void find_customers_and_make_transfers_between_customers(String id_of_client_ordering_transfer, String transfer_amount,
    String id_of_client_receiving_transfer) {

        System.out.println("\n* * * List of customers and funds after transfers between customers * * *");

        ArrayList<Object> bank_customer_list = Bank.getBank_customer_list();

        Customer customer = new Customer();
        customer.setAccount_funds(transfer_amount);

        Iterator<Object> iterator = bank_customer_list.iterator();
        while (iterator.hasNext()) {
            String[] next = (String[]) iterator.next();

            if (next[0].equals(id_of_client_ordering_transfer)) {

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

        /*Customer_Bank customer_bank = new Customer_Bank();
        customer_bank.find_customer_and_perform_operation_deposit_withdrawal_from_account(id_of_client_receiving_transfer,
                transferAmountAsStringAgain);
        */

        Customer customer2 = new Customer();
        customer2.setAccount_funds(transferAmountAsStringAgain);

        Iterator<Object> iterator2 = bank_customer_list.iterator();
        while (iterator2.hasNext()) {
            String[] next = (String[]) iterator2.next();

            if (next[0].equals(id_of_client_receiving_transfer)) {

                //next[3] = customer.getAccount_funds();

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

    public void edit_other_customer_details_Other_Data(String id, String other_data){

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

    public void edit_personal_customer_details_Name(String id, String new_personal_data){

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
