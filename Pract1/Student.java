import java.lang.*;
public class Student {

    private String name;
    private int age;
    public Student(String n, int a, String g){
        name = n;
        age = a;
    }

    public String toString(){
        return name + " " + name + ", возраст которого - " + age;
    }

}