package app.users;


import java.time.LocalDate;

public class Student extends User{

    private int anInscriere;
    private String nume;
    private int nrCredite;

    protected String rol = "STUDENT";


    public Student(String id, String email, String password, LocalDate createdAt, int anInscriere, String nume, int nrCredite){
       super(id, email, password, createdAt);
        this.anInscriere = anInscriere;
        this.nume = nume;
        this.nrCredite = nrCredite;

    }

    public Student(String text){
        super(text);
        String arr[] = text.split(",");
        this.setAnInscriere(Integer.parseInt(arr[5]));
        this.setNume(arr[6]);
        this.setNrCredite(Integer.parseInt(arr[7]));

    }



    public int getAnInscriere() {
        return anInscriere;
    }

    public void setAnInscriere(int anInscriere) {
        this.anInscriere = anInscriere;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getNrCredite() {
        return nrCredite;
    }

    public void setNrCredite(int nrCredite) {
        this.nrCredite = nrCredite;
    }

    @Override
    public String descriere(){
        return "STUDENT" + "," + super.descriere()+ "," + anInscriere + "," + nume +"," + nrCredite;
    }

    @Override
    public String tip(){
        return "STUDENT";
    }

}
