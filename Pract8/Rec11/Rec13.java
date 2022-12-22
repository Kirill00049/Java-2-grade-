package Rec11;

import java.util.Scanner;

public class Rec13 {
    public static void recursion() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        // Базовый случай
        if (n > 0) {
            int m = scanner.nextInt();
            System.out.println(n);
            if (m > 0) {
                recursion();
            }
        }
    }
    public static void main(String[] args) {
        recursion();
    }
}