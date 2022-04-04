public class New_Customer {

    String id_bank;
    String pesel;
    String first_name;
    String last_name;
    String account_number;

    public String getId_bank() {
        return id_bank;
    }

    public void setId_bank(String id_bank) {
        this.id_bank = id_bank;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getAccount_number() {
        return account_number;
    }

    public void setAccount_number(String account_number) {
        this.account_number = account_number;
    }

    public void add_customer (String id, String pesel, String first_name, String last_name){

        this.id_bank = id;
        this.pesel = pesel;
        this.first_name = first_name;
        this.last_name = last_name;

        String [] customer_data = new String[]{id, pesel, first_name, last_name};

        for (String s:customer_data) {
            System.out.println(s + " | ");
        }

    }
}
