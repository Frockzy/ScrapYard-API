//abstrakt klasse for de forskjellige type kjøretøyene
public abstract class Vehicle {
    private int vehicleid;
    private String brand;
    private String model;
    private int yearmodel;
    private String registrationnumber;
    private String chassisnumber;
    private boolean driveable;
    private int numberofsellablewheels;
    private int scrapyardid;



    //Genererer konstrunktør, getter og setter
    public Vehicle(int vehicleid, String brand, String model, String chassisnumber, int yearmodel, String registrationnumber, boolean driveable, int numberofsellablewheels, int scrapyardid) {
        this.vehicleid = vehicleid;
        this.brand = brand;
        this.model = model;
        this.chassisnumber = chassisnumber;
        this.yearmodel = yearmodel;
        this.registrationnumber = registrationnumber;
        this.driveable = driveable;
        this.numberofsellablewheels = numberofsellablewheels;
        this.scrapyardid = scrapyardid;
    }

    public int getVehicleid() {
        return vehicleid;
    }

    public void setVehicleid(int vehicleid) {
        this.vehicleid = vehicleid;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearmodel() {
        return yearmodel;
    }

    public void setYearmodel(int yearmodel) {
        this.yearmodel = yearmodel;
    }

    public String getRegistrationnumber() {
        return registrationnumber;
    }

    public void setRegistrationnumber(String registrationnumber) {
        this.registrationnumber = registrationnumber;
    }

    public String getChassisnumber() {
        return chassisnumber;
    }

    public void setChassisnumber(String chassisnumber) {
        this.chassisnumber = chassisnumber;
    }

    public boolean isDriveable() {
        return driveable;
    }

    public void setDriveable(boolean driveable) {
        this.driveable = driveable;
    }

    public int getNumberofsellablewheels() {
        return numberofsellablewheels;
    }

    public void setNumberofsellablewheels(int numberofsellablewheels) {
        this.numberofsellablewheels = numberofsellablewheels;
    }

    public int getScrapyardid() {
        return scrapyardid;
    }

    public void setScrapyardid(int scrapyardid) {
        this.scrapyardid = scrapyardid;
    }
}
