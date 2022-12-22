package Stroki;

public class StrokiClass implements Stroki{

    public StrokiClass() {}

    @Override
    public int Count(String stroka) {
        int res = stroka.length();
        return res;
    }

    @Override
    public String Odd(String stroka) {
        String  res="";
        for (int i = 0; i < stroka.length(); i+=2){
            res += stroka.charAt(i);
        }
        return res;
    }

    @Override
    public String Inversiya(String stroka) {
        String res = "";
        for (int i = stroka.length() - 1; i > -1; i--){
            res += stroka.charAt(i);
        }
        return res;
    }
}
