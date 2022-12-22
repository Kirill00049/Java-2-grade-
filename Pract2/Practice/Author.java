package Practice;

import java.lang.*;
public class Author {

    private String name;
    private String email;
    private char gender;
    public Author(String name, String email, char gender){
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

     public String getName(){
        return ("Имя автора: " + name);
    }
    public String getEmail(){
        return ("Email автора: " + email);
    }

    public void setEmail(String email){
        this.email = email;
        System.out.println("Email updated" );
    }
    public char getGender(){
        return (gender);
    }
    public String toString(){
        return ("Автор: " + name + "\nПочта: " + email + "\nПол: " + gender);
    }
}
