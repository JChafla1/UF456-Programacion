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

    // Main
    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS)) {
            // Agregar nuevo director
            insertDirector(conn, 3, "Quentin", "Tarantino");
            
            // Agregar nueva pelicula
            insertPelicula(conn, 5, "Pulp Fiction", 1994, 3);
            
            // Recuperar peliculas de un director concreto
            getPeliculasByDirector(conn, "Quentin", "Tarantino");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
}
