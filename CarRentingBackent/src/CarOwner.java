import java.io.Serializable;

public class CarOwner extends  Person implements Serializable {

    private int balance;


    public  CarOwner()
    {
        super();
    }

    public CarOwner(int id, String cnic, String name, String conact, int balance) {
        super(id, cnic, name, conact);
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public void Add() {

    }

    @Override
    public void Update() {

    }

    @Override
    public void Remove() {

    }
}
