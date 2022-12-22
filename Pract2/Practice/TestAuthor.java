package Practice;

import java.lang.*;
public class TestAuthor {
    public static void main(String[] args){
        System.out.println("toString");
        Author A1 = new Author("Paul", "Paul003@mail.ru", 'M');
        System.out.println(A1);
        System.out.println("getName");
        System.out.println(A1.getName());
        System.out.println("getEmail");
        System.out.println(A1.getEmail());
        System.out.println("getGender");
        System.out.println("Пол: " + A1.getGender());
        System.out.println("setEmail");
        A1.setEmail("meow@edu.mirea.ru");
        System.out.println("getEmail");
        System.out.println(A1.getEmail());
    }
}
