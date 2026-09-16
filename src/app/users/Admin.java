package app.users;

public class Admin extends User{

    private int anAngajare;
    private String nume;
    private int nrConturi;

    public Admin(String text){
        super(text);
        String[] arr = text.split(",");
        setAnAngajare(Integer.parseInt(arr[5]));
        setNume(arr[6]);
        setNrConturi(Integer.parseInt(arr[7]));
    }


    public int getAnAngajare(){
        return anAngajare;
    }

    public String getNume(){
        return nume;
    }

    public int getNrConturi(){
        return nrConturi;
    }

    public void setAnAngajare(int angajare){
        this.anAngajare = angajare;
    }

    public void setNume(String nume){
        this.nume = nume;
    }

    public void setNrConturi(int nrConturi){
        this.nrConturi = nrConturi;
    }

    @Override
    public String descriere(){
        return "ADMIN" + "," + super.descriere() + "," + anAngajare + "," + nume + "," + nrConturi;
    }

    @Override
    public String tip(){
        return "ADMIN";
    }

    public String raport (String titlu){
        return titlu + ": " + nume;
    }

    public String raport(String titlu, int an){
        return titlu + ": " + nume + ", " + an;
    }
}
