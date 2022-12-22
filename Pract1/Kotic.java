import java.lang.*;
public class Kotic {

    private String name;
    private String breed;
    private int amountChild;

    public Kotic(String n, String b, int a){
        name = n;
        breed = b;
        amountChild = a;
    }

    public void setAmountChild(int amountChild) {
        this.amountChild = amountChild;
    }

    public String toString(){
        return this.name + " имеет в потомстве " + amountChild + " котиков," +" порода: " + breed;
    }

}
