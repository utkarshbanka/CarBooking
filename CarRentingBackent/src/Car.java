import java.io.Serializable;

public class Car  implements Serializable {


    private int ID;
    private String Maker, Name, Colour, Type;
    int SeatingCapacity;
    String Model, Condition, RegNo;
    private int RentPerHour;
    private CarOwner carOwner;

    public Car(int ID, String maker, String name, String colour, String type, int seatingCapacity, String model, String condition, String regNo, int rentPerHour, CarOwner carOwner) {
        this.ID = ID;
        Maker = maker;
        Name = name;
        Colour = colour;
        Type = type;
        SeatingCapacity = seatingCapacity;
        Model = model;
        Condition = condition;
        RegNo = regNo;
        RentPerHour = rentPerHour;
        this.carOwner = carOwner;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getMaker() {
        return Maker;
    }

    public void setMaker(String maker) {
        Maker = maker;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getColour() {
        return Colour;
    }

    public void setColour(String colour) {
        Colour = colour;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public int getSeatingCapacity() {
        return SeatingCapacity;
    }

    public void setSeatingCapacity(int seatingCapacity) {
        SeatingCapacity = seatingCapacity;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }

    public String getCondition() {
        return Condition;
    }

    public void setCondition(String condition) {
        Condition = condition;
    }

    public String getRegNo() {
        return RegNo;
    }

    public void setRegNo(String regNo) {
        RegNo = regNo;
    }

    public int getRentPerHour() {
        return RentPerHour;
    }

    public void setRentPerHour(int rentPerHour) {
        RentPerHour = rentPerHour;
    }

    public CarOwner getCarOwner() {
        return carOwner;
    }

    public void setCarOwner(CarOwner carOwner) {
        this.carOwner = carOwner;
    }

    @Override
    public String toString() {
        return "Car{" +
                "ID=" + ID +
                ", Maker='" + Maker + '\'' +
                ", Name='" + Name + '\'' +
                ", Colour='" + Colour + '\'' +
                ", Type='" + Type + '\'' +
                ", SeatingCapacity=" + SeatingCapacity +
                ", Model='" + Model + '\'' +
                ", Condition='" + Condition + '\'' +
                ", RegNo='" + RegNo + '\'' +
                ", RentPerHour=" + RentPerHour +
                ", carOwner=" + carOwner +
                '}';
    }





}
