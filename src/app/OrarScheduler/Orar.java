package app.OrarScheduler;

import java.util.ArrayList;
import java.util.List;

public class Orar {

    //Intervale
    List<Interval> arrIntervale = new ArrayList<>();

    public Orar(){

    }

    public Orar(Orar orar){
        orar.setArrIntervale(arrIntervale);
    }


    public void setArrIntervale(List<Interval> arrIntervale) {
        this.arrIntervale = arrIntervale;
    }

    public void adaugaInterval(Interval interval){

        arrIntervale.add(interval);

    }



    public List<Interval> getArrIntervale(){
        List<Interval> copyIntervale = new ArrayList<>(arrIntervale);
        return copyIntervale;
    }


    public void afisare(){
        if(arrIntervale.size() > 1){
            for (Interval interval : arrIntervale){
                System.out.println(interval.afisare());
            }
        }
        else{
            System.out.println("nu exista niciun interval setat.");

        }
    }

    public String decalareOrar(int nrMinute){

        for (Interval interval : arrIntervale){
            interval.decalare(nrMinute);
        }

        return "Orarul a fost decalat cu " + nrMinute + " minute.";
    }


    public Orar duplicate(){
        return new Orar(this);
    }
}
