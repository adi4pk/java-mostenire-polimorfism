package app.formeGeometrice;

public class Linie extends Figura{

    //proprietati
    private Punct punctA;
    private Punct punctB;


    public Linie(Punct p1, Punct p2){
        this.setPunctA(p1);
        this.setPunctB(p2);
    }


    public Punct getPunctA() {
        return punctA;
    }

    public void setPunctA(Punct punctA) {
        this.punctA = punctA;
    }

    public Punct getPunctB() {
        return punctB;
    }

    public void setPunctB(Punct punctB) {
        this.punctB = punctB;
    }



    @Override
    public String toString(){
        return "Punctul A: " + punctA.toString() + ", " + "Punctul B: " + punctB.toString();
    }


    @Override
    public void translate(int x, int y){
        this.getPunctA().setX(x);
        this.getPunctA().setY(y);

        this.getPunctB().setX(x);
        this.getPunctB().setY(y);
    }
}
