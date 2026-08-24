//Arver fra klassen Vehicle
public class FossilCar extends Vehicle{
    private String fueltype;
    private int fuelamount;

    //Genererer konstrunktør, getter og setter

    public FossilCar(int vehicleid, String brand, String model, String chassisnumber, int yearmodel, String registrationnumber, boolean driveable, int numberofsellablewheels, int scrapyardid, String fueltype, int fuelamount) {
        super(vehicleid, brand, model, chassisnumber, yearmodel, registrationnumber, driveable, numberofsellablewheels, scrapyardid);
        this.fueltype = fueltype;
        this.fuelamount = fuelamount;
    }

    public String getFueltype() {
        return fueltype;
    }

    public void setFueltype(String fueltype) {
        this.fueltype = fueltype;
    }

    public int getFuelamount() {
        return fuelamount;
    }

    public void setFuelamount(int fuelamount) {
        this.fuelamount = fuelamount;
    }
}
