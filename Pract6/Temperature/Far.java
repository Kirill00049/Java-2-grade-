package Temperature;

public class Far implements Convertable{
    public float res;

    Far(){};

    @Override
    public void convert(float res) {
        this.res = res*9/5+32;
        System.out.println("Температура по Фаренгейту = " + this.res);
    }
}
