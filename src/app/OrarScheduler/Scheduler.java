package app.OrarScheduler;

import java.util.ArrayList;
import java.util.List;

public class Scheduler {

    private List<Orar> listaOrare;

    public void setListaOrare(){
        List<Orar> arrOrare = new ArrayList<>(listaOrare);
    }

    public List<Orar> getListaOrare(){
        return listaOrare;
    }

    public Scheduler(){

    }


    public void creeazaOrar(){
        Orar orar = new Orar();
    }

    public void afiseazaOrar(Orar orar){
        orar.afisare();
    }

    public void duplicare(Orar orar){
        Orar copieOrar = new Orar(orar);
    }


}
