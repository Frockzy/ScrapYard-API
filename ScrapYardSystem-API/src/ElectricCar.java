//Arver fra klassen Vehicle
public class ElectricCar extends Vehicle{
    private int batterycapacity;
    private int chargelevel;

    //Genererer konstrunktør, getter og setter

    public ElectricCar(int vehicleid, String brand, String model, String chassisnumber, int yearmodel, String registrationnumber, boolean driveable, int numberofsellablewheels, int scrapyardid, int batterycapacity, int chargelevel) {
        super(vehicleid, brand, model, chassisnumber, yearmodel, registrationnumber, driveable, numberofsellablewheels, scrapyardid);
        this.batterycapacity = batterycapacity;
        this.chargelevel = chargelevel;
    }

    public int getBatterycapacity() {
        return batterycapacity;
    }

    public void setBatterycapacity(int batterycapacity) {
        this.batterycapacity = batterycapacity;
    }

    public int getChargelevel() {
        return chargelevel;
    }

    public void setChargelevel(int chargelevel) {
        this.chargelevel = chargelevel;
    }
}
