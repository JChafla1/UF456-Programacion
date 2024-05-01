package Empresa;

public class Main {
    public static void main(String[] args) {
        // Crear instàncies d'empleats de diferents tipus
        EmpleatPerHores empleatHores = new EmpleatPerHores("Anna", 0, 40, 15.0);
        EmpleatAsalariat empleatAsalariat = new EmpleatAsalariat("Marc", 3000.0);
        EmpleatPerComissio empleatComissio = new EmpleatPerComissio("Laura", 2000.0, 10000.0, 0.05);

        // Calcular salaris i mostrar detalls
        System.out.println("Detalls de l'empleat per hores:");
        empleatHores.calcularSalari();
        empleatHores.imprimirDetalls();

        System.out.println("\nDetalls de l'empleat asalariat:");
        empleatAsalariat.imprimirDetalls();

        System.out.println("\nDetalls de l'empleat per comissió:");
        empleatComissio.calcularSalari();
        empleatComissio.imprimirDetalls();
    }
}
