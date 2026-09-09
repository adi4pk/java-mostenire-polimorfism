package app.users;

import java.time.LocalDate;

public class User {

    private String id;
    private String email;
    protected String password;
    protected LocalDate createdAt;

    public User(String text){
        text = "";
        String arr[] = text.split(",");
        this.setUserId(arr[0]);
        this.setEmail(arr[1]);
        this.setPassword(arr[2]);
        this.setCreatedAt(LocalDate.parse(arr[3]));
    }

    public User(String id, String email, String password, LocalDate createdAt){
        this.setUserId(id);
        this.setEmail(email);
        this.setPassword(password);
        this.setCreatedAt(createdAt);
    }


    public String getUserId() {
        return id;
    }

    public void setUserId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDate createdAt) {
        this.createdAt = createdAt;
    }


}
