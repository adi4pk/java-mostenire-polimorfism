package app.formeGeometrice;

public class Eticheta extends Figura{

    //proprietati - 2 puncte ce definesc un Dreptunghi  + textul dintre ele

    private Punct punct1;
    private String text;
    private Punct punct2;

    public Punct getPunct1() {
        return punct1;
    }

    public void setPunct1(Punct punct1) {
        this.punct1 = punct1;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Punct getPunct2() {
        return punct2;
    }

    public void setPunct2(Punct punct2) {
        this.punct2 = punct2;
    }

    public Eticheta(Punct punct1, String text, Punct punct2){

        this.setText(text);
        Dreptunghi dreptunghi = new Dreptunghi(punct1, punct2);

    }

    @Override
    public String toString(){
        return "Eticheta: " + punct1.toString() + " " +text + " " +punct2.toString();
    }
}
