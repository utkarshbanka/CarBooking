import java.io.Serializable;

public class Customer  extends  Person implements Serializable {

    private int bill;


    public Customer()
    {
        super();
    }

    public Customer(int id, String cnic, String name, String conact, int bill) {
        super(id, cnic, name, conact);
        this.bill = bill;
    }

    public int getBill() {
        return bill;
    }

    public void setBill(int bill) {
        this.bill = bill;
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
