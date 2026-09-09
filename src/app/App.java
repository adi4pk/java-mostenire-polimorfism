package app;

import app.users.Student;
import app.users.Teacher;
import app.users.User;
import app.vehicule.Avion;
import app.vehicule.Barca;
import app.vehicule.Masina;
import app.vehicule.Vehicul;

import java.time.LocalDate;

//todo:
// ===========================MOSTENIREA=======
// A extends B  {} A sn subclasa B sn superclasa
// A  are acces la toate campurile protected sau public  ale lui B
// A  este obligata la instantiere sa apeleze constructorul  lui B
// cuvantul cheie super ne ajuta sa accesam campurile superclasei
// B poate fi referinta pentru orice subclasa
// B nu are acces la metodele din subclasa
//  =================CONVERSII=========
// Fie:   A extends B si C extends B
//   A x = new A();
//   B y  = x   upcasting
//   A a  =(A)y downcasting
//
public class App {

    public static void main(String[] args) {

        Student s1 = new Student("001,studentMail@ex.com,parola123,2026-09-09,2024,Ionescu,20");
        Student s2 = new Student("002,maria.popescu@ex.com,parola234,2024-09-01,2024,Popescu,19");
        Student s3 = new Student("003,andrei.ionescu@ex.com,parola345,2023-09-01,2023,Ionescu,21");
        Student s4 = new Student("004,elena.georgescu@ex.com,parola456,2022-09-01,2022,Georgescu,22");
        Student s5 = new Student("005,mihai.stan@ex.com,parola567,2024-09-01,2024,Stan,20");
        Student s6 = new Student("006,ana.dumitru@ex.com,parola678,2021-09-01,2021,Dumitru,23");
        Teacher t1 = new Teacher("007,elProfessor@mail.com,prof999,2026-09-03,2025,Dumitru,5000");


        User user=s1; // intr-o referinta de tip user am stocat un obiect de tip Student

        System.out.println(user.descriereUser());



        if(user instanceof Student){
            Student st=(Student)user;
            System.out.println(st.descriereStudent());
        }else{
            System.out.println("nu se poate converti");
        }








    }
}
