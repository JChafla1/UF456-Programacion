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

public class LibraryManager {
    public void insertAuthor(String nom, String cognom) {
        String sql = "INSERT INTO Autor (nom, cognom) VALUES (?, ?)";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, nom);
            pstmt.setString(2, cognom);
            pstmt.executeUpdate();
            System.out.println("Autor añadido von exito!");
        } catch (SQLException e) {
            System.out.println("Error al añadir a autor: " + e.getMessage());
        }
    }

    public void insertBook(String titol, int anyPublicacio, int autorId) {
        String sql = "INSERT INTO Llibre (titol, anyPublicacio, autorId) VALUES (?, ?, ?)";

        
    }

    public void getBooksByAuthor(int autorId) {
        String sql = "SELECT titol FROM Llibre WHERE autorId = ?";

        
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
