package app.vehicule;

public class Vehicul {

    private String marca;
    private int vitezaMaxima;
    private int numarLocuri;

    public Vehicul(String marca, int vitezaMaxima, int numarLocuri) {
        this.marca = marca;
        this.vitezaMaxima = vitezaMaxima;
        this.numarLocuri = numarLocuri;
    }

    public String getMarca() {
        return marca;
    }

    public int getVitezaMaxima() {
        return vitezaMaxima;
    }

    public int getNumarLocuri() {
        return numarLocuri;
    }

    public void porneste() {
        System.out.println(marca + ": pornesc.");
    }

    public void deplaseaza() {
        System.out.println(marca + ": ma deplasez.");
    }

    public String descriere() {
        return marca + " - " + vitezaMaxima + " km/h, " + numarLocuri + " locuri";
    }
}
