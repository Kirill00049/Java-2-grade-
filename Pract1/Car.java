import java.lang.*;
public class Car {

    private String mark;
    private int number;
    private boolean turboRej;
    private String turboRejStr;

    public Car(String n, int b){
        mark = n;
        number = b;
    }

    public void setTurboRej(boolean turboRej) {
        if (turboRej) {
            turboRejStr = "в турборежиме";
        }
        else turboRejStr = "не использует турбо";
    }

    public String toString(){
        return "Машина марки " + mark +  " c нумерным знаком " + number + " сейчас " + turboRejStr ;
    }

}