package app;

import app.users.Student;
import app.users.Teacher;
import app.users.User;
import app.users.UserRepository;
import app.vehicule.Avion;
import app.vehicule.Barca;
import app.vehicule.Masina;
import app.vehicule.Vehicul;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

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
// ==========================POLIMORFISM========================================
//  Polimorfismul implica autmat mostenirea
//   Early Binding and Late Binding
//   early binding => functia se leaga de corp la compilare
//   late  binding =>functia se leaga de corb la rulare
//
public class App {

    public static void main(String[] args) {

//        Student s1 = new Student("001,studentMail@ex.com,parola123,2026-09-09,2024,Ionescu,20");
//        Student s2 = new Student("002,maria.popescu@ex.com,parola234,2024-09-01,2024,Popescu,19");
//        Student s3 = new Student("003,andrei.ionescu@ex.com,parola345,2023-09-01,2023,Ionescu,21");
//        Student s4 = new Student("004,elena.georgescu@ex.com,parola456,2022-09-01,2022,Georgescu,22");
//        Student s5 = new Student("005,mihai.stan@ex.com,parola567,2024-09-01,2024,Stan,20");
//        Student s6 = new Student("006,ana.dumitru@ex.com,parola678,2021-09-01,2021,Dumitru,23");
//        Teacher t1 = new Teacher("007,elProfessor@mail.com,prof999,2026-09-03,2025,Dumitru,5000");
//        Teacher t2 = new Teacher("008,teacher@teach.com,test123,2026-09-04,2025,Ionescu,5000");
//
//
//        User user=s1; // intr-o referinta de tip user am stocat un obiect de tip Student
//
//        System.out.println(user.descriereUser());
//
//
//
//        if(user instanceof Student){
//            Student st=(Student)user;
//            System.out.println(st.descriereStudent());
//        }else{
//            System.out.println("nu se poate converti");
//        }
//
//
//
//        List<User> users= new ArrayList<>();
//        users.add(s2);
//        users.add(s4);
//        users.add(t1);
//        users.add(t2);
//
//        System.out.println("\nLista useri: ");
//        for(User u : users){
//           if(u instanceof  Student){
//               Student st=(Student)u;
//               System.out.println(st.descriereStudent());
//           } else if (u instanceof Teacher) {
//               Teacher teacher = (Teacher) u;
//               System.out.println(teacher.descriereTeacher());
//           }
//        }


        UserRepository userRepo = new UserRepository();

        //System.out.println(userRepo.returnAllUsers());

        userRepo.showAllUsers();

        userRepo.save();

        Teacher t99 = new Teacher("TEACHER,998,TEST.prof@teach.com,prof678,2026-08-30,2022,TEST_TEST,10000");
        Student s99 = new Student("STUDENT,999,alex@student.com,pass456,2026-09-06,2025,Test_Student,30");

        userRepo.addUser(t99);
        userRepo.addUser(s99);
        userRepo.showAllUsers();
    }
}
