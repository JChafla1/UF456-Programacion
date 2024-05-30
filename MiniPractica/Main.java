package MiniPractica;

public class Main {
    public static void main(String[] args) {
        DatabaseManager dbManager = new DatabaseManager();

        // Agregar libros
        dbManager.addBook(new Book("El Quijote", "Miguel de Cervantes", 1605));
        dbManager.addBook(new Book("1984", "George Orwell", 1949));

        // Recuperar y mostrar la lista de libros
        for (Book book : dbManager.getBooks()) {
            System.out.println(book);
        }

    }
}
