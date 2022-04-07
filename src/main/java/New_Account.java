public class New_Account {

    String account_number;

    public String getAccount_number() {
        return account_number;
    }

    public void setAccount_number(String account_number) {
        this.account_number = account_number;
    }

    @Override
    public String toString() {
        return "New_Account{" +
                "account_number='" + account_number + '\'' +
                '}';
    }

    public void create_account_number(String account_No, String customer_id){

        setAccount_number(account_No);

        String account_number = getAccount_number();
        System.out.println("\n" + account_number);

        Customer_Account customer_account = new Customer_Account();
        String account = customer_account.find_customer_and_assign_account(customer_id);
        System.out.println("account: " + account);


    }

}
