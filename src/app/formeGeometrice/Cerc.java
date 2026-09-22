package app.formeGeometrice;

public class Cerc extends Figura{

    //proprietati
    private Punct punct;
    private int raza;


    public Punct getPunct() {
        return punct;
    }

    public int getRaza() {
        return raza;
    }

    public void setPunct(Punct punct) {
        this.punct = punct;
    }

    public void setRaza(int raza) {
        this.raza = raza;
    }


    @Override
    public String toString(){
        return "Punct: " + punct.toString() + ", " + "raza: " + this.getRaza();
    }
}
