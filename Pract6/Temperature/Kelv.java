package Temperature;

public class Kelv implements Convertable{

    public float res;

    Kelv(){};

    @Override
    public void convert(float res) {
        this.res = res + (float) 273.15;
        System.out.println("Температура по Келвину = " + this.res);
    }
}
