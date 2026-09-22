package app.OrarScheduler;

public class Interval {

    //ora inceput, durata in min, materia, sala

    private int oraInceput;
    private int durataMin;

    public Interval(int oraInceput, int durataMin) {

        this.setOraInceput(oraInceput);
        this.setDurataMin(durataMin);
    }

    /// copy constructor()
    public Interval(Interval copieInterval){
        this.setOraInceput(copieInterval.getOraInceput());
        this.setDurataMin(copieInterval.getDurataMin());
    }

    public int getOraInceput() {
        return oraInceput / 60;
    }

    public void setOraInceput(int oraInceput) {
        this.oraInceput = oraInceput * 60;      // ora x min
    }

    public int getDurataMin() {
        return durataMin;
    }

    public void setDurataMin(int durataMin) {
        this.durataMin = durataMin;
    }


    public String getTipInterval(){
        return "";
    }

    public void decalare(int nrMinute){
        int decalajInMinute = (getOraInceput() * 60) + nrMinute;
        int oraDecalata = decalajInMinute/60;
        int minDecalate = decalajInMinute % 60;

        this.setOraInceput(oraDecalata);


        if(decalajInMinute % 60 == 0){
            System.out.println("Orarul a fost decalat. Noua ora de incepere a " + getTipInterval() + " este " + "ora " + oraDecalata + ":" +minDecalate);

        }
        else{
            System.out.println("Orarul a fost decalat. Noua ora de incepere a " + getTipInterval() + " este " + "ora " + oraDecalata + ":" +minDecalate + "0");

        }
    }

    public Interval duplicate(){
        return new Interval(this);
    }
}
