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

    public String afisare(){
        int ora = getOraInceput();

        if(getDurataMin() >= 60){

            int minute = getDurataMin() % 60;
            int incrementareOre = getDurataMin() / 60;
            ora += incrementareOre;

            if (minute ==0){
                return this.getTipInterval() + ": " + "ora " + ora + ":" + minute +"0 ";
            }
            return this.getTipInterval() + ": " + "ora " + ora + ":" + minute +" ";

        } else if (getDurataMin() < 10){
            return this.getTipInterval() + ": " + "ora " + ora + ":0" + this.getDurataMin() +" ";

        }
        return this.getTipInterval() + ": " + "ora " + ora + ":" + this.getDurataMin() +" ";
    }

    public void decalare(int nrMinute){
        int decalajInMinute = (getOraInceput() * 60) + nrMinute;

        if (getOraInceput() *60 +nrMinute > 1440){

        }
        int oraDecalata = decalajInMinute/60;
        int minDecalate = decalajInMinute % 60;

        this.setOraInceput(oraDecalata);


        if(decalajInMinute % 60 == 0){
            System.out.println("Orarul a fost decalat. Noua ora de incepere " + getTipInterval() + " este " + "ora " + oraDecalata + ":" +minDecalate);

        }
        if (decalajInMinute % 60 != 0 && decalajInMinute/60 < 10){
            System.out.println("Orarul a fost decalat. Noua ora de incepere " + getTipInterval() + " este " + "ora " + oraDecalata + ":" +minDecalate + "0test");

        }
        else {
            System.out.println("Orarul a fost decalat. Noua ora de incepere " + getTipInterval() + " este " + "ora " + oraDecalata + ":" +"0" +minDecalate);
        }

    }

    public Interval duplicate(){
        return new Interval(this);
    }
}
