package app.vehicule;

public class Barca extends Vehicul {

    private double lungimeMetri;

    public Barca(String marca, int vitezaMaxima, int numarLocuri, double lungimeMetri) {
        super(marca, vitezaMaxima, numarLocuri);
        this.lungimeMetri = lungimeMetri;
    }

    public double getLungimeMetri() {
        return lungimeMetri;
    }

    @Override
    public void porneste() {
        System.out.println(getMarca() + ": pornesc motorul de pe pupa.");
    }

    @Override
    public void deplaseaza() {
        System.out.println(getMarca() + ": plutesc pe apa.");
    }

    @Override
    public String descriere() {
        return super.descriere() + ", " + lungimeMetri + " m lungime";
    }

    public void aruncaAncora() {
        System.out.println(getMarca() + ": ancora aruncata.");
    }
}
