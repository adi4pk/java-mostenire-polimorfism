package app;

import app.vehicule.Avion;
import app.vehicule.Barca;
import app.vehicule.Masina;
import app.vehicule.Vehicul;
//todo:
// ===========================MOSTENIREA=======
// A extends B  {} A sn subclasa B sn superclasa
// A  are acces la toate campurile protected sau public  ale lui B
// A  este obligata la instantiere sa apeleze constructorul  lui B
//
public class App {

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
