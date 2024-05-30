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

    // Insertar Pelicula
    public static void insertPelicula(Connection conn, int id, String titol, int anyEstrena, int directorId) throws SQLException {
        String sql = "INSERT INTO Pelicula (id, titol, anyEstrena, directorId) VALUES (?, ?, ?, ?)";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            pstmt.setString(2, titol);
            pstmt.setInt(3, anyEstrena);
            pstmt.setInt(4, directorId);
            pstmt.executeUpdate();
        }
    }

    // SQL que une las tablas de "peliculas" y "director"
    public static void getPeliculasByDirector(Connection conn, String nom, String cognom) throws SQLException {
        String sql = "SELECT p.titol, p.anyEstrena " +
                     "FROM Pelicula p " +
                     "JOIN Director d ON p.directorId = d.id " +
                     "WHERE d.nom = ? AND d.cognom = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, nom);
            pstmt.setString(2, cognom);
            try (ResultSet rs = pstmt.executeQuery()) {
                while (rs.next()) {
                    System.out.println("Titol: " + rs.getString("titol") + ", Any Estrena: " + rs.getInt("anyEstrena"));
                }
            }
        }
    }
    
}
