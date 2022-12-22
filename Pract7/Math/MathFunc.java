package Math;

public class MathFunc implements MathCalculable{

    public MathFunc(){};

    @Override
    public int Pow(int R, int pow) {
        int K = R;
        for(int i = 1; i < pow; i++){
            K *= R;
        }
        return K;
    }

    @Override
    public double Module(int x, int y) {
        return(Math.sqrt(Pow(x,2)+Pow(y,2)));
    }

    public void Circle(int R){
        System.out.println((double)Pi*Pow(R,2));
    }


}
