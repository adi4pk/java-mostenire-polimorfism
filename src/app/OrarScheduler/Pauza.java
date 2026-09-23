package app.OrarScheduler;

public class Pauza extends Interval{


    public Pauza(int oraIncepere, int durataMin){
        super(oraIncepere, durataMin);

    }


    /// copy constructor()
    public Pauza(Pauza copiePauza){
        super(copiePauza);
    }

    @Override
    public String getTipInterval(){
        return "PAUZA";
    }


    @Override
    public String afisare(){
        return super.afisare();
    }

    @Override
    public Interval duplicate(){
        return new Pauza(this);
    }


}
