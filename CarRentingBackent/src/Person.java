import java.io.Serializable;

public abstract class Person implements Serializable {

    protected int id;
    protected  String Cnic;
    protected String Name;
    protected  String conact;

    public Person()
    {

    }

    public Person(int id, String cnic, String name, String conact) {
        this.id = id;
        Cnic = cnic;
        Name = name;
        this.conact = conact;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCnic() {
        return Cnic;
    }

    public void setCnic(String cnic) {
        Cnic = cnic;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getConact() {
        return conact;
    }

    public void setConact(String conact) {
        this.conact = conact;
    }

    public abstract void Add();
    public abstract void Update();
    public abstract void Remove();


    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", Cnic='" + Cnic + '\'' +
                ", Name='" + Name + '\'' +
                ", conact='" + conact + '\'' +
                '}';
    }





}
