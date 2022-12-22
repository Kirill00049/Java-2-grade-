package Rec10;

import java.util.Scanner;

public class Rec10 {
    public static int consoleInputFirstNumber() {
        Scanner scanner = new Scanner(System. in );
        System.out.print("Введите число: ");
        if (scanner.hasNextInt()) {
            return scanner.nextInt();
        } else {
            System.out.println("Не балуйтесь! ");
            return consoleInputFirstNumber();
        }
    }

    public static void numberReverse(int number) {
        if (number == 0) {
            return;
        } else {
            System.out.print(number % 10);
            numberReverse(number / 10);
        }
    }

    public static void consoleOutput(int result) {
        System.out.println(result);
    }

    public static void main(String[] args) {
        int input = consoleInputFirstNumber();
        numberReverse(input);
    }
}
