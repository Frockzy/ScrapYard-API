import java.io.FileNotFoundException;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        ReadingFile readingFile = new ReadingFile();
        try {
            try {
                readingFile.FileReading();
            } catch (SQLException e) {
                System.out.println("noe gikk galt"+ e.getMessage());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Noe gikk galt:" + e.getMessage());
        }
    }
}