import java.io.File;
import java.io.FileNotFoundException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadingFile{

    public void FileReading() throws FileNotFoundException, SQLException {
        File file = new File("vehicles.txt");
        List<Scrapyard> scrapyardList = new ArrayList<>();
        List<Vehicle> vehicleList = new ArrayList<>();
        Scanner filescanner = new Scanner(file);

        // leser scrapyard
        int numberofscrapeyards = Integer.parseInt(filescanner.nextLine()); //leser antall skrapehandelsteder
                for (int i=0;i<numberofscrapeyards;i++) {
                    int id = Integer.parseInt(filescanner.nextLine());
                    String name = filescanner.nextLine();
                    String adress = filescanner.nextLine();
                    String phonenumber = filescanner.nextLine();
                    String novalue = filescanner.nextLine(); //leser strekene som skylder scapyard (---)
                    Scrapyard scrapyard = new Scrapyard(id, name, adress, phonenumber);
                    scrapyardList.add(scrapyard);
                }
        DatabaseManager db = new DatabaseManager(); //kontakter databasen og legger til scrapyard
        for (Scrapyard scrapyard : scrapyardList){
            db.insertScrapyard(scrapyard);
        }

                //leser Vehicles
        DatabaseManager dbManager = new DatabaseManager();
        int numberofvehicles = Integer.parseInt(filescanner.nextLine()); //leser antall kjøretøy
        for (int i=0;i<numberofvehicles;i++){
            int vehicleid = Integer.parseInt(filescanner.nextLine());
            int scrapyardid = Integer.parseInt(filescanner.nextLine());
            String vehicletype = filescanner.nextLine();
            String brand = filescanner.nextLine();
            String model = filescanner.nextLine();
            int yearmodel = Integer.parseInt(filescanner.nextLine());
            String registrationnumber = filescanner.nextLine();
            String chassisnumber = filescanner.nextLine();
            boolean driveable = Boolean.parseBoolean(filescanner.nextLine());
            int numberofsellablewheels = Integer.parseInt(filescanner.nextLine());

            //her leser vi basert på hvilken type kjøretøy som er registrert
            switch (vehicletype){
                    case "ElectricCar":
                        int batterycapacity = Integer.parseInt(filescanner.nextLine());
                        int chargelevel = Integer.parseInt(filescanner.nextLine());
                        ElectricCar electricCar = new ElectricCar(vehicleid, brand, model, chassisnumber, yearmodel, registrationnumber, driveable, numberofsellablewheels, scrapyardid, batterycapacity, chargelevel);
                        vehicleList.add(electricCar);
                        filescanner.nextLine(); //leser "---"
                        dbManager.insertElectricCar(electricCar);
                        break;
                    case "FossilCar":
                        String fueltype = filescanner.nextLine();
                        int fuelamount = Integer.parseInt(filescanner.nextLine());
                        FossilCar fossilCar = new FossilCar(vehicleid, brand, model, chassisnumber, yearmodel, registrationnumber, driveable, numberofsellablewheels, scrapyardid, fueltype, fuelamount);
                        vehicleList.add(fossilCar);
                        filescanner.nextLine(); //leser "---"
                        dbManager.insertFossilCar(fossilCar);
                        break;
                    case "Motorcycle":
                        boolean hassidecar = Boolean.parseBoolean(filescanner.nextLine());
                        int enginecapacity = Integer.parseInt(filescanner.nextLine());
                        boolean ismodified = Boolean.parseBoolean(filescanner.nextLine());
                        int numberofwheels = Integer.parseInt(filescanner.nextLine());
                        MotorCycle motorCycle = new MotorCycle(vehicleid, brand, model, chassisnumber, yearmodel, registrationnumber, driveable, numberofsellablewheels, scrapyardid, hassidecar, enginecapacity, ismodified, numberofwheels);
                        vehicleList.add(motorCycle);
                        filescanner.nextLine(); //leser "---"
                        dbManager.insertMotorCycle(motorCycle);
                        break;
                }
                }
        System.out.println("antall skraphandlesteder: " + scrapyardList.size());
        System.out.println("antall kjøretøy: " + vehicleList.size());

            }
        }
