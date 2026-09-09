package app.users;


import java.time.LocalDate;

public class Student extends User{

    private int anInscriere;
    private String nume;
    private int nrCredite;



    public Student(String id, String email, String password, LocalDate createdAt, int anInscriere, String nume, int nrCredite){
       super(id, email, password, createdAt);
        this.anInscriere = anInscriere;
        this.nume = nume;
        this.nrCredite = nrCredite;

    }

    public Student(String text){
        super(text);
        String arr[] = text.split(",");
        this.setAnInscriere(Integer.parseInt(arr[4]));
        this.setNume(arr[5]);
        this.setNrCredite(Integer.parseInt(arr[6]));

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

    public String descriereStudent(){
        return descriereUser()+ ", " + anInscriere + ", " + nume +"," + nrCredite;
    }

}
