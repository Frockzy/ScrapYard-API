import com.mysql.cj.jdbc.MysqlDataSource;

import java.sql.*;
import java.util.List;


public class DatabaseManager {

    private static final String INSERT_VALUES_TO_SCRAPYARD = "INSERT INTO scrapyard VALUES (?, ?, ?, ?)";

    private static final String INSERT_VALUES_TO_ELECTRICCAR = "INSERT INTO electriccar VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

    private static final String INSERT_VALUES_TO_FOSSILCAR = "INSERT INTO fossilcar VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

    private static final String INSERT_VALUES_TO_MOTORCYCLE = "INSERT INTO motorcycle VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

    private final MysqlDataSource scrapyardDB;

    public DatabaseManager() {
        scrapyardDB = new MysqlDataSource();
        scrapyardDB.setServerName(PropertiesProvider.PROPS.getProperty("host"));
        scrapyardDB.setPortNumber(Integer.parseInt(PropertiesProvider.PROPS.getProperty("port")));
        scrapyardDB.setDatabaseName(PropertiesProvider.PROPS.getProperty("db_name"));
        scrapyardDB.setUser(PropertiesProvider.PROPS.getProperty("uname"));
        scrapyardDB.setPassword(PropertiesProvider.PROPS.getProperty("pwd"));
    }

    public void insertScrapyard(Scrapyard scrapyard) throws SQLException {
        Connection con = scrapyardDB.getConnection();
            PreparedStatement statement = con.prepareStatement(INSERT_VALUES_TO_SCRAPYARD);
            statement.setInt(1, scrapyard.getScrapyardid());
            statement.setString(2, scrapyard.getName());
            statement.setString(3, scrapyard.getAdress());
            statement.setString(4, scrapyard.getPhonenumber());
            statement.executeUpdate();
            statement.close();
            con.close();
    }

    public void insertElectricCar(ElectricCar electricCar) throws SQLException {
        Connection con = scrapyardDB.getConnection();
        PreparedStatement statement = con.prepareStatement(INSERT_VALUES_TO_ELECTRICCAR);
        statement.setInt(1, electricCar.getVehicleid());
        statement.setString(2, electricCar.getBrand());
        statement.setString(3, electricCar.getModel());
        statement.setInt(4, electricCar.getYearmodel());
        statement.setString(5, electricCar.getRegistrationnumber());
        statement.setString(6, electricCar.getChassisnumber());
        statement.setBoolean(7, electricCar.isDriveable());
        statement.setInt(8, electricCar.getNumberofsellablewheels());
        statement.setInt(9, electricCar.getScrapyardid());
        statement.setInt(10, electricCar.getBatterycapacity());
        statement.setInt(11, electricCar.getChargelevel());
        statement.executeUpdate();
        statement.close();
        con.close();
    }

    public void insertFossilCar(FossilCar fossilCar) throws SQLException {
        Connection con = scrapyardDB.getConnection();
        PreparedStatement statement = con.prepareStatement(INSERT_VALUES_TO_FOSSILCAR);
        statement.setInt(1, fossilCar.getVehicleid());
        statement.setString(2, fossilCar.getBrand());
        statement.setString(3, fossilCar.getModel());
        statement.setInt(4, fossilCar.getYearmodel());
        statement.setString(5, fossilCar.getRegistrationnumber());
        statement.setString(6, fossilCar.getChassisnumber());
        statement.setBoolean(7, fossilCar.isDriveable());
        statement.setInt(8, fossilCar.getNumberofsellablewheels());
        statement.setInt(9, fossilCar.getScrapyardid());
        statement.setString(10, fossilCar.getFueltype());
        statement.setInt(11, fossilCar.getFuelamount());
        statement.executeUpdate();
        statement.close();
        con.close();
    }

    public void insertMotorCycle(MotorCycle motorCycle) throws SQLException {
        Connection con = scrapyardDB.getConnection();
        PreparedStatement statement = con.prepareStatement(INSERT_VALUES_TO_MOTORCYCLE);
        statement.setInt(1, motorCycle.getVehicleid());
        statement.setString(2, motorCycle.getBrand());
        statement.setString(3, motorCycle.getModel());
        statement.setInt(4, motorCycle.getYearmodel());
        statement.setString(5, motorCycle.getRegistrationnumber());
        statement.setString(6, motorCycle.getChassisnumber());
        statement.setBoolean(7, motorCycle.isDriveable());
        statement.setInt(8, motorCycle.getNumberofsellablewheels());
        statement.setInt(9, motorCycle.getScrapyardid());
        statement.setBoolean(10, motorCycle.isHassidecar());
        statement.setInt(11, motorCycle.getEnginecapacity());
        statement.setBoolean(12, motorCycle.isIsmodified());
        statement.setInt(13, motorCycle.getNumberofwheels());
        statement.executeUpdate();
        statement.close();
        con.close();
    }
}