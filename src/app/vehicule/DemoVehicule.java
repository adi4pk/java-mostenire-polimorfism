package app.vehicule;

public class DemoVehicule {

    public static void main(String[] args) {

        Vehicul[] parc = {
                new Masina("Dacia Logan", 180, 5, 4),
                new Barca("Yamaha 190", 70, 8, 5.8),
                new Avion("Airbus A320", 840, 180, 12000)
        };

        for (Vehicul vehicul : parc) {
            System.out.println(vehicul.descriere());
            vehicul.porneste();
            vehicul.deplaseaza();
            System.out.println();
        }

        for (Vehicul vehicul : parc) {
            if (vehicul instanceof Masina) {
                Masina masina = (Masina) vehicul;
                masina.claxoneaza();
            } else if (vehicul instanceof Barca) {
                Barca barca = (Barca) vehicul;
                barca.aruncaAncora();
            } else if (vehicul instanceof Avion) {
                Avion avion = (Avion) vehicul;
                avion.decoleaza();
            }
        }
    }
}
