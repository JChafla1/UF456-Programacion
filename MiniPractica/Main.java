package MiniPractica;

public class Main {
    public static void main(String[] args) {
        DatabaseManager dbManager = new DatabaseManager();

        // Agregar libros
        dbManager.addBook(new Book("El Quijote", "Miguel de Cervantes", 1605));
        dbManager.addBook(new Book("1984", "George Orwell", 1949));

    }
}
