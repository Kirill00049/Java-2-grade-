package InternetShop;
import java.lang.*;
import java.util.ArrayList;

public class Shop {
    public ArrayList<Computer> compArr = new ArrayList<Computer>();
    public int k = -1;
    public Shop(){};

    public void addComp(int capacity, int size, int speed, String name){
        compArr.add(new Computer(capacity,size,speed, name));
    }

    public boolean CompareComp(int capacity, int size, int speed, String name){
        Computer compareComp = new Computer(capacity, size, speed, name);
        for (int i = 0; i < compArr.size(); i++){
            if (compareComp.processor.speed == compArr.get(i).processor.speed &&
                    compareComp.memory.capacity == compArr.get(i).memory.capacity &&
                    compareComp.monitor.size == compArr.get(i).monitor.size &&
                    compareComp.name.equals(compArr.get(i).name)){
                k = i;
                return true;
            }
        }
        return false;
    }

    public void DelComp(int capacity, int size, int speed, String name){
        Computer delComp = new Computer(capacity,size,speed, name);
        if (CompareComp(capacity, size, speed, name)){
            compArr.remove(k);
        }
        else System.out.println("Данного компьютера нет");
    }

    public void getArr(){
        for (int i = 0; i < compArr.size(); i++){
            System.out.println("Компьютер №" + (i+1) + "\nОбъем памяти: " + compArr.get(i).memory.capacity +
                    "\nМодель монитора: " + compArr.get(i).monitor.size + "\nРазмер памяти: "
                    + compArr.get(i).processor.speed + "\nМодель компьютера: " + compArr.get(i).name);
        }
    }
}
