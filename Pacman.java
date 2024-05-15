// Classe PacMan
public class Pacman {
    //Atributos
    private int posX;
    private int posY;
    private int vidas;
    private int puntuacion;

    //Constructor de la classe Pacman.
    public Pacman(int posX, int posY) {
        this.posX = posX;
        this.posY = posY;
        this.vidas = 3; // Pacman comienza con 3 vidas
        this.puntuacio = 0;
    }

    // Implementa el moviment de Pac-Man
    public void move(int newPosX, int newPosY) {        
        this.posX = newPosX;
        this.posY = newPosY;
    }

    //Recogida de bolas y suma de puntuacion
    public void pickupBola() {
        puntuacion += 15; // Ejemplo de puntos
    }

    //Metodo para cojer una bola especial y que sume la puntuacion.
    public void pickupBolaEspecial() {
        puntuacion += 40; // Ejemplo de puntos extra
    }


}
