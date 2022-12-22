package Rec12;

import java.util.Scanner;

public class Rec12 {
    public static void recursion() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n % 2 == 1) {
            System.out.println(n);
            recursion();
        }
        else if (n == 0){
            System.out.println("Программа завершена");
        }
        else {
            recursion();
        }
    }
    public static void main(String[] args) {
        recursion();
    }
}