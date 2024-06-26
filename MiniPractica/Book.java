package MiniPractica;

public class Book {
  // Atributos
    private int id;
    private String title;
    private String author;
    private int year;

    // Constructor por defecto
    public Book() {}

    // útil para crear nuevos libros antes de ser insertados en la base de datos
    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    // útil para crear objetos de libros con datos completos recuperados de la base de datos
    public Book(int id, String title, String author, int year) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.year = year;
    }

  // Getters
    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

  // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setYear(int year) {
        this.year = year;
    }

  // Proporcionar una cadena que describa el objeto Book con sus principales atributos.
    @Override
    public String toString() {
        return "Book [id=" + id + ", title=" + title + ", author=" + author + ", year=" + year + "]";
    }
}

