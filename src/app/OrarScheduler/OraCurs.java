package app.OrarScheduler;

public class OraCurs extends Interval{

    private String materie;
    private String sala;


    public OraCurs(int oraIncepere, int durataMin, String materie, String sala){
        super(oraIncepere, durataMin);
        this.setMaterie(materie);
        this.setSala(sala);
    }


    /// copy constructor()
    public OraCurs(OraCurs copieOraCurs){
        super(copieOraCurs);
        this.setMaterie(copieOraCurs.getMaterie());
        this.setSala(copieOraCurs.getSala());
    }

    @Override
    public String afisare(){
        return this.getClass() + ": " + "ora " + this.getOraInceput() + this.getDurataMin() + this.getMaterie() + this.getSala();
    }

    @Override
    public String getTipInterval(){
        return "CURS";
    }

    public String getMaterie() {
        return materie;
    }

    public void setMaterie(String materie) {
        this.materie = materie;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    @Override
    public Interval duplicate(){
        return new OraCurs(this);
    }
}
