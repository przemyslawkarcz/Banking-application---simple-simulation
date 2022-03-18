public class Accounts{

    public Integer account_number;
    public Integer account_funds;

    public Accounts(){}

    public Accounts(Integer account_number, Integer account_funds) {
        this.account_number = account_number;
        this.account_funds = account_funds;
    }

    public Integer getAccount_number() {
        return account_number;
    }

    public void setAccount_number(Integer account_number) {
        this.account_number = account_number;
    }

    public Integer getAccount_funds() {
        return account_funds;
    }

    public void setAccount_funds(Integer account_funds) {
        this.account_funds = account_funds;
    }

    @Override
    public String toString() {
        return "Accounts{" +
                "account_number=" + account_number +
                ", account_funds=" + account_funds +
                '}';
    }
}
