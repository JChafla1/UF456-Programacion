
public class Main {
    public static void main(String[] args) {
        Cercle cercle = new Cercle("Cercle", 5.0);
        Rectangle rectangle = new Rectangle("Rectangle", 4.0, 3.0);

        System.out.println("Cercle:");
        System.out.println("Àrea: " + cercle.calcularArea());
        System.out.println("Perímetre: " + cercle.calcularPerimetre());

        System.out.println("\nRectangle:");
        System.out.println("Àrea: " + rectangle.calcularArea());
        System.out.println("Perímetre: " + rectangle.calcularPerimetre());
    }
}
