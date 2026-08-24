//Arver fra klassen Vehicle
public class MotorCycle extends Vehicle {
    private boolean hassidecar;
    private int enginecapacity;
    private boolean ismodified;
    private int numberofwheels;

    //Genererer konstrunktør, getter og setter

    public MotorCycle(int vehicleid, String brand, String model, String chassisnumber, int yearmodel, String registrationnumber, boolean driveable, int numberofsellablewheels, int scrapyardid, boolean hassidecar, int enginecapacity, boolean ismodified, int numberofwheels) {
        super(vehicleid, brand, model, chassisnumber, yearmodel, registrationnumber, driveable, numberofsellablewheels, scrapyardid);
        this.hassidecar = hassidecar;
        this.enginecapacity = enginecapacity;
        this.ismodified = ismodified;
        this.numberofwheels = numberofwheels;
    }

    public boolean isHassidecar() {
        return hassidecar;
    }

    public void setHassidecar(boolean hassidecar) {
        this.hassidecar = hassidecar;
    }

    public int getEnginecapacity() {
        return enginecapacity;
    }

    public void setEnginecapacity(int enginecapacity) {
        this.enginecapacity = enginecapacity;
    }

    public boolean isIsmodified() {
        return ismodified;
    }

    public void setIsmodified(boolean ismodified) {
        this.ismodified = ismodified;
    }

    public int getNumberofwheels() {
        return numberofwheels;
    }

    public void setNumberofwheels(int numberofwheels) {
        this.numberofwheels = numberofwheels;
    }
}