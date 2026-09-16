package app.users;

import javax.swing.text.html.Option;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class UserRepository {

    private  List<User> users;
    private String FILE_PATH = "src/app/users/users.txt";

    public UserRepository(){

        users= new ArrayList<>();
        loadData();
    }

    public void addUser(User user){
        users.add(user);

        save();

    }


    public List<User> returnAllUsers (){
        return new ArrayList<>(users);
    }

    public void loadData(){
        File file = new File(FILE_PATH);

        if(!file.exists()){
            return;
        }

        try{
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()){
             String line = scanner.nextLine().trim();
             String type= line.split(",")[0];

             switch (type){
                 case  "STUDENT": this.users.add(new Student(line));
                 break;
                 case "TEACHER": this.users.add(new Teacher(line));
                 break;
                 default:
                     System.out.println("type nout found");
             }

        }
      }catch (Exception e){
            e.printStackTrace();
        }
    }


    public Optional<User> cautaUserDupaId(String id){
        for (User u: users){
            if(u.getUserId().equals(id)){
                if (u instanceof Student){
                    System.out.println("Utilizator " + u.getUserId() + ": " + ((Student) u).getNrCredite() + " credite" );
                }
                return Optional.of(u);
            }

        }
        System.out.println("Utilizator " + id + " nu exista.");
        return Optional.empty();
    }


    public void save(){
        StringBuilder content = new StringBuilder();
        for (User u : users){
            content.append(u.descriere()).append(System.lineSeparator());
        }

        try (PrintWriter writer = new PrintWriter(FILE_PATH)){
            writer.print(content);

        } catch (FileNotFoundException exception){
            throw new IllegalArgumentException("Cannot write file: " + FILE_PATH, exception);
        }

    }

    public void showAllUsers(){
        for (User u : users){
         //   if(u instanceof Student){
           //     System.out.println(((Student) u).descriereStudent());
            //}
            //if (u instanceof Teacher) {
              //  System.out.println(((Teacher) u).descriereTeacher());

            //}

            System.out.println(u.descriere());
        }
    }
}
