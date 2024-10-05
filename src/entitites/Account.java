package entitites;

public class Account {

    private Integer number;
    private String holder;
    private double balance;

    public Account(){
    }

    public Account(Integer number, String holder, double balance) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
    }
}
