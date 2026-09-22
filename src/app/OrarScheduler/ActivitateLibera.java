package app.OrarScheduler;

public class ActivitateLibera extends Interval{

    //denumirea, locul de desfășurare

    String denumire;
    String locDesfasurare;


    public ActivitateLibera(int oraInceput, int durataMin, String denumire, String locDesfasurare){

        super(oraInceput, durataMin);
        this.setDenumire(denumire);
        this.setLocDesfasurare(locDesfasurare);
    }

    /// copy constructor()
    public ActivitateLibera(ActivitateLibera copieActivitateLibera){
        super(copieActivitateLibera);
        this.setDenumire(copieActivitateLibera.getDenumire());
        this.setLocDesfasurare(copieActivitateLibera.getLocDesfasurare());
    }


    @Override
    public String getTipInterval(){
        return "ACTIVITATII";
    }


    public String getDenumire() {
        return denumire;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public String getLocDesfasurare() {
        return locDesfasurare;
    }

    public void setLocDesfasurare(String locDesfasurare) {
        this.locDesfasurare = locDesfasurare;
    }


    @Override
    public Interval duplicate(){
        return new ActivitateLibera(this);
    }
}
