package app.users;

public class Teacher extends User{

    private int anAngajare;
    private String nume;
    private int salariu;


    public Teacher(String text){
        super(text);
        String arr[] = text.split(",");
        this.setAnAngajare(Integer.parseInt(arr[5]));
        this.setNume(arr[6]);
        this.setSalariu(Integer.parseInt(arr[7]));
    }


    public int getAnAngajare() {
        return anAngajare;
    }

    public void setAnAngajare(int anAngajare) {
        this.anAngajare = anAngajare;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getSalariu() {
        return salariu;
    }

    public void setSalariu(int salariu) {
        this.salariu = salariu;
    }

    @Override
    public String descriere(){
        return "TEACHER" + "," + super.descriere()+ "," + anAngajare + "," + nume +"," + salariu;
    }

    @Override
    public String tip(){
        return "TEACHER";
    }

    @Override
    public String toString(){
        return "TEACHER" + "," + super.toString() + "," +anAngajare + "," + nume + "," + salariu;
    }

}
