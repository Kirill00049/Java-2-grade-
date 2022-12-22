package InternetShop;
import java.lang.*;
import java.util.Scanner;

public class TestInernetShop {
    public static void main(String[] args){
        Shop shop = new Shop();
        System.out.println("Введите объем памяти, модель монитора, скорость, имя: ");
        Scanner scanner = new Scanner(System.in);
        int capacity = scanner.nextInt();
        int size = scanner.nextInt();
        int speed = scanner.nextInt();
        String name = scanner.next();
        shop.addComp(capacity, size, speed, name);
        System.out.println("Введите объем памяти, модель монитора, скорость, имя: ");
        capacity = scanner.nextInt();
        size = scanner.nextInt();
        speed = scanner.nextInt();
        name = scanner.next();
        shop.addComp(capacity, size, speed, name);
        shop.getArr();
        capacity = scanner.nextInt();
        size = scanner.nextInt();
        speed = scanner.nextInt();
        name = scanner.next();
        System.out.println();
        shop.DelComp(capacity, size, speed, name);
        shop.getArr();

    }
}
