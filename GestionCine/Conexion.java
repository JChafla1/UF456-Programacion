package GestionCine;

public class Conexion {
    // Atributos
    private static final String DB_URL = "jdbc:mysql://localhost:3306/cinema";
    private static final String USER = "root";
    private static final String PASS = "1234";

    // Insertar Director
    public static void insertDirector(Connection conn, int id, String nom, String cognom) throws SQLException {
        String sql = "INSERT INTO Director (id, nom, cognom) VALUES (?, ?, ?)";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            pstmt.setString(2, nom);
            pstmt.setString(3, cognom);
            pstmt.executeUpdate();
        }
    }
    
}
