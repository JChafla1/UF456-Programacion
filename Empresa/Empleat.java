package Empresa;

public class Empleat {
    private String nom;
    private double salari;

    public Empleat(String nom, double salari) {
        this.nom = nom;
        this.salari = salari;
    }

    public void imprimirDetalls() {
        System.out.println("Nom de l'empleat: " + nom);
        System.out.println("Salari: " + salari);
    }
}
