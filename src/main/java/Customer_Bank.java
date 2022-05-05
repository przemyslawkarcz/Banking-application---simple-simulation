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
        System.out.println("##################################################################");
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
                                ", account_funds='" + next[3] + '\'' +
                                ", other_data='" + next[4] + '\''
                );

            }

        }
        //xxxxxxxxxxxxxxxxxxxx
        int parsedTransferAmount = Integer.parseInt(transfer_amount);
        int parsedTransferAmountReversed = parsedTransferAmount * (-1);
        String transferAmountAsStringAgain = String.valueOf(parsedTransferAmountReversed);

        Customer_Bank customer_bank = new Customer_Bank();
        customer_bank.find_customer_and_perform_operation_deposit_withdrawal_from_account(id_of_client_receiving_transfer,
                transferAmountAsStringAgain);

    }


    /*
    public void find_customer_v02(String id, String funds){

        System.out.println("\n* * * Find customer v02 * * *");

        ArrayList<Object> bank_customer_list = Bank.getBank_customer_list();

        Customer customer = new Customer();
        customer.setAccount_funds(funds);

        Iterator<Object> iterator = bank_customer_list.iterator();
        while (iterator.hasNext()){
            String [] next = (String []) iterator.next();

            if (next[0].equals(id)){

                // - - - working code
                int parseInt = Integer.parseInt(customer.getAccount_funds());
                System.out.println("ParseInt: " + parseInt);
                System.out.println("next[3]: " + next[3]);
                int parseInt2 = Integer.parseInt(next[3]);
                System.out.println("ParseInt2: " + parseInt2);
                int i = parseInt + parseInt2;
                System.out.println("i: " + i);
                next[3] = String.valueOf(i);
                // xxxxxxxxxx tu skończyłem, linijka poniżej nr 121 jest do usunięcia, blok working code trzeba jedynie oczyścić
                // dodawanie nowych wartości do konta udało się

                //next[3] = next[3] + customer.getAccount_funds();

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

    }*/

    /*public void make_transfer_operation_between_customers(String id_client_ordering_transfer, String funds,
                                                          String id_client_receiving_transfer){

        System.out.println("\n* * * List of customers and funds after transfer operation * * *");

        ArrayList<Object> bank_customer_list = Bank.getBank_customer_list();

        Iterator<Object> iterator = bank_customer_list.iterator();
        while (iterator.hasNext()){
            String [] next = (String []) iterator.next();

            if (next[0].equals(id_client_ordering_transfer)){

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

    }*/

}
