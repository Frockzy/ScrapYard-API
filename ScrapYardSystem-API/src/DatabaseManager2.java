import com.mysql.cj.jdbc.MysqlDataSource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DatabaseManager2 {

    private static final String SELECT_ALL_VEHICLES = "SELECT vehicleid, brand, model FROM fossilcar UNION ALL " +
                                                      "SELECT vehicleid, brand, model FROM electriccar UNION ALL " +
                                                      "SELECT vehicleid, brand, model FROM motorcycle";

    private static final String SELECT_TOTAL_FOSSILFUEL = "SELECT sum(fuelamount) as total_fuel FROM fossilcar";

    private static final String SELECT_DRIVEABLE_VEHICLES = "SELECT vehicleid, brand, model FROM fossilcar where driveable = true " + " UNION ALL " +
                                                            "SELECT vehicleid, brand, model FROM electriccar where driveable = true " + "UNION ALL " +
                                                            "SELECT vehicleid, brand, model FROM motorcycle where driveable = true ";

    private static final String SELECT_ALL_SCRAPYARD = "SELECT * FROM scrapyard";

    private final MysqlDataSource scrapyardDB;

    public DatabaseManager2() {
        scrapyardDB = new MysqlDataSource();
        scrapyardDB.setServerName(PropertiesProvider.PROPS.getProperty("host"));
        scrapyardDB.setPortNumber(Integer.parseInt(PropertiesProvider.PROPS.getProperty("port")));
        scrapyardDB.setDatabaseName(PropertiesProvider.PROPS.getProperty("db_name"));
        scrapyardDB.setUser(PropertiesProvider.PROPS.getProperty("uname"));
        scrapyardDB.setPassword(PropertiesProvider.PROPS.getProperty("pwd"));
    }

    public void allVehicles() throws SQLException {
        Connection con = scrapyardDB.getConnection();
        PreparedStatement statement = con.prepareStatement(SELECT_ALL_VEHICLES);
        ResultSet rs = statement.executeQuery();
        while (rs.next()){
            System.out.println("ID: "+rs.getInt("vehicleid")+
                    ", Brand: "+rs.getString("brand")+
                    ", Model: "+rs.getString("model"));
        }
        rs.close();
        statement.close();
        con.close();
    }

    public void totalFosilfuel() throws SQLException {
        Connection con = scrapyardDB.getConnection();
        PreparedStatement statement = con.prepareStatement(SELECT_TOTAL_FOSSILFUEL);
        ResultSet rs = statement.executeQuery();
        if (rs.next()){
            System.out.println("Total fosilfuel: "+ rs.getInt("total_fuel")+" Liters in total!");
        }
        rs.close();
        statement.close();
        con.close();
    }

    public void driveableVehicles() throws SQLException {
        Connection con = scrapyardDB.getConnection();
        PreparedStatement statement = con.prepareStatement(SELECT_DRIVEABLE_VEHICLES);
        ResultSet rs = statement.executeQuery();
        while (rs.next()){
            System.out.println("ID: "+rs.getInt("vehicleid")+
                    ", Brand: "+rs.getString("brand")+
                    ", Model: "+rs.getString("model"));
        }
        rs.close();
        statement.close();
        con.close();
    }

    public void selectAllScrapyard() throws SQLException {
        Connection con = scrapyardDB.getConnection();
        PreparedStatement statement = con.prepareStatement(SELECT_ALL_SCRAPYARD);
        ResultSet rs = statement.executeQuery();
        while (rs.next()){
            System.out.println("Scrapyard ID: "+rs.getInt("scrapyardid")+
                    ", Name: "+rs.getString("name")+
                    ", Adress: "+rs.getString("address")+
                    ", Phonenumber: "+rs.getString("phonenumber"));
        }
        rs.close();
        statement.close();
        con.close();
    }
}
