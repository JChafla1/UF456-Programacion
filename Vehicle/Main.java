package Vehicle;

public class Main {
    public static void main(String[] args) {

        // Crear una instància d'Automòbil
        Automovil cotxe = new Automovil("Toyota");
        cotxe.accelerar(60);
        System.out.println("Automovil marca: " + cotxe.getMarca());
        System.out.println("Velocidat actual del coche: " + cotxe.obtenerVelocidadActual() + " km/h");
        cotxe.frenar();
        System.out.println("Velocidat actual del coche despues de frenar: " + cotxe.obtenerVelocidadActual() + " km/h");
    
    }
}
