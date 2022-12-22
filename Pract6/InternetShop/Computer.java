package InternetShop;

public class Computer {

    public String name;
    public Memory memory;
    public Monitor monitor;
    public  Processor processor;

    public Computer(int capacity, int size,int speed, String name) {
        memory = new Memory(capacity);
        monitor = new Monitor(size);
        processor = new Processor(speed);
        this.name = name;
    };
}

