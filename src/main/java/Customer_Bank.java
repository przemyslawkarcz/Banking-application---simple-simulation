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

    public void find_customer_and_perform_operation_deposit_on_account(String id, String funds){

        System.out.println("\n* * * List of customers and funds in the accounts * * *");

        ArrayList<Object> bank_customer_list = Bank.getBank_customer_list();

        Customer customer_ = new Customer();
        customer_.setAccount_funds(funds);

        Iterator<Object> iterator = bank_customer_list.iterator();
        while (iterator.hasNext()){
            String [] next = (String []) iterator.next();

            if (next[0].equals(id)){

                next[3] = customer_.getAccount_funds();

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
