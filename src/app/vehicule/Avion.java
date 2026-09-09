package app.vehicule;

public class Avion extends Vehicul {

    private int altitudineMaxima;

    public Avion(String marca, int vitezaMaxima, int numarLocuri, int altitudineMaxima) {
        super(marca, vitezaMaxima, numarLocuri);
        this.altitudineMaxima = altitudineMaxima;
    }

    public int getAltitudineMaxima() {
        return altitudineMaxima;
    }

    @Override
    public void porneste() {
        System.out.println(super.getMarca() + ": pornesc turbinele.");
    }

    @Override
    public void deplaseaza() {
        System.out.println(getMarca() + ": zbor la " + altitudineMaxima + " m.");
    }

    @Override
    public String descriere() {
        return super.descriere() + ", plafon " + altitudineMaxima + " m";
    }

    public void decoleaza() {
        System.out.println(getMarca() + ": decolez de pe pista.");
    }
}
