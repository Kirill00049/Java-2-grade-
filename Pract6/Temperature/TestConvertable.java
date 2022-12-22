package Temperature;

import java.util.Scanner;

public class TestConvertable {
    public static void main(String[] args) {
        System.out.println("Введите температуру");
        Scanner scanner = new Scanner(System.in);
        float x = scanner.nextFloat();
        Far far = new Far();
        far.convert(x);
        Kelv kelv = new Kelv();
        kelv.convert(x);
    }
}
