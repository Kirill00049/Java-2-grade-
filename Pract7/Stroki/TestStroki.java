package Stroki;

import java.util.Scanner;

public class TestStroki {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку для подсчета символов: ");
        String stroka = scanner.nextLine();
        StrokiClass strokiClass = new StrokiClass();
        System.out.println(strokiClass.Count(stroka));
        System.out.print("Введите строку для вывода нечетных символов: ");
        stroka = scanner.nextLine();
        System.out.println(strokiClass.Odd(stroka));
        System.out.print("Введите строку для инвертирования: ");
        stroka = scanner.nextLine();
        System.out.println(strokiClass.Inversiya(stroka));
    }
}
