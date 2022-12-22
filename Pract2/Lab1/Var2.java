package Lab1;
import java.lang.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Var2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int i = 0;
        ArrayList<String> meow = new ArrayList<>();
        while (!str.isEmpty()){
            meow.add(str);
            Scanner sc1 = new Scanner(System.in);
            str = sc1.nextLine();
            i++;
        }
        for(String s: meow){
            System.out.println(s);
        }
    }
}
