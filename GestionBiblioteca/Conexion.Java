import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/biblioteca";
    private static final String USER = "root";
    private static final String PASSWORD = "1234";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}


public class Main {
    public static void main(String[] args) {
        LibraryManager manager = new LibraryManager();

        // Añadir un nuevo autor
        manager.insertAuthor("Isabel", "Allende");

        // Añadir un nuevo libro
        manager.insertBook("La casa de los espíritus", 1982, 1);

        // Obtener libros en concreto
        manager.getBooksByAuthor(1);
    }
}
