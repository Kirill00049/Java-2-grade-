import java.lang.*;
public class Tester {
    public static void main(String[] args) {
        Kotic c1 = new Kotic("Мура", "Сфинкс", 7);
        c1.setAmountChild(9);
        System.out.println(c1);
        Car c2 = new Car("Mazda",333);
        c2.setTurboRej(true);
        System.out.println(c2);
        Student c3 = new Student("Кирилл",13, "Второкурсник");
        c3.setDolg(false);
        System.out.println(c3);
    }
}