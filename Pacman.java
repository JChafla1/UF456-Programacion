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
        this.puntuacion += 15; // Ejemplo de puntos
    }

    //Metodo para cojer una bola especial y que sume la puntuacion.
    public void pickupBolaEspecial() {
        this.puntuacion += 40; // Ejemplo de puntos extra
    }

    //Recogida de fruta y suma de puntuacion
    public void pickupFruita() {
        this.puntuacion += 100; // Ejemplo de puntuacion de frutas
    }

    //Metodo para perder vida
    public void loseLife() {
        this.vides--; // Reduce la vida
    }

    //Metodo para deterctar a Pacman chocas contra un fantasma
    public boolean detectColisionFantasma(Fantasma fantasma) {
        return (this.posX == fantasma.getPosX() && this.posY == fantasma.getPosY());
    }
}


// Classe Fantasma
public class Fantasma {
        private int posX;
        private int posY;

    //Constructor de la Clase Fantasma.
    public Fantasma(int newPosX, int newPosY){
        this.posX = posX;
        this.posY = posY;
    }

    //Metodo para el movimiento del fantasma
    public void move(int newPosX, int newPosY) {
        this.posX = newPosX;
        this.posY = newPosY;
    }
}


// Classe Bola
public class Bola {
    private int posX;
    private int posY;
    
    public Bola(int posX, int posY) {
        this.posX = posX;
        this.posY = posY;
    }
    
    // Metodo para obtener la posicion de la bola
    public int getPosX() {
        return posX;
    }
    
    public int getPosY() {
        return posY;
    }
}



// Clase bola especial
public class BolaEspecial {
    private int posX;
    private int posY;
    private boolean recogida;  

    //Constructor Bola especial
    public BolaEspecial(int posX, int posY){
        this.posX = posX;
        this.posY = posY;
        this.recogida = false;
    }

    //Metodo para establecer la posicion de la bola especial.
    public int getPosX() {
        return posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }
}


// Clase Fruta
public class Fruta {
    private int posX;
    private int posY;
    private boolean recogida;
    
    //Constructor
    public Fruta(int posX, int posY){
        this.posX = posX;
        this.posY = posY;
        this.recogida = false;
    }

    //Metodo para la posicion de la fruta
    public int getPosX() {
        return posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }
}


// Clase Laberinto
public class Laberinto {
    private char[][] mapa; // Representacion del laberinto en una matrix
    
    //Constructor de la clase Laberinto.
    public Laberinto(char[][] mapa) {
        this.mapa = mapa;
    }

    //Metodo para establecer si la posicion es un Laberinto.
    public boolean esPasillo(int x, int y) {
        return mapa[y][x] == ' ';
    }
}

