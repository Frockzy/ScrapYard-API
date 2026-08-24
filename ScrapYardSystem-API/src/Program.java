import java.sql.SQLException;
import java.util.Scanner;

public class Program {
    DatabaseManager2 db = new DatabaseManager2();
    public void run() throws SQLException {
        System.out.println("Welcome to my program! Chose between 1-5");
        int choice = 0;
        Scanner userInput = new Scanner(System.in);
        while (choice != 5) {
            presentMenuOptions();
            choice = userInput.nextInt();
            switch (choice) {
                case 1 -> allVehicles();
                case 2 -> totalFosilFuel();
                case 3 -> driveableVehicles();
                case 4 -> allScrapyard();
                case 5 -> quit();
                default -> System.out.println("Chose between 1-5");

            }
        }
    }

    private void quit() {
    }

    private void allScrapyard() throws SQLException {
        db.selectAllScrapyard();
    }

    private void driveableVehicles() throws SQLException {
        db.driveableVehicles();
    }

    private void totalFosilFuel() throws SQLException {
        db.totalFosilfuel();
    }

    private void allVehicles() throws SQLException {
        db.allVehicles();
    }

    private void presentMenuOptions() {
        System.out.println("1: All vehicles");
        System.out.println("2: Total FosilCar fuel");
        System.out.println("3: All driveable vehicles");
        System.out.println("4: All scrapyard");
        System.out.println("5: quit");
    }
}
