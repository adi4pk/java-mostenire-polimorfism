package app.vehicule;

public class Masina extends Vehicul {

    private int numarUsi;

    public Masina(String marca, int vitezaMaxima, int numarLocuri, int numarUsi) {
        super(marca, vitezaMaxima, numarLocuri);
        this.numarUsi = numarUsi;
    }

    public int getNumarUsi() {
        return numarUsi;
    }

    @Override
    public void porneste() {
        System.out.println(getMarca() + ": rasucesc cheia, motorul porneste.");
    }

    @Override
    public void deplaseaza() {
        System.out.println(getMarca() + ": rulez pe sosea.");
    }

    @Override
    public String descriere() {
        return super.descriere() + ", " + numarUsi + " usi";
    }

    public void claxoneaza() {
        System.out.println(getMarca() + ": biiip!");
    }
}
