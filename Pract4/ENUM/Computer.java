package ENUM;

public abstract class Computer {
    private Marka mark;
    private String color;
    private double size;
    private String name;

    public Computer(Marka mark,String color,double size,String name){
        this.mark=mark;
        this.color=color;
        this.size=size;
        this.name=name;
    }
    public Marka getMark(){return mark;}
    public String getColor(){return color;}
    public double size(){return size;}
    public String name(){return name;}

    public String toString(){
        return "{" +"mark: "+ mark+", color: "+color+", size: "+ size+", name: " + name+"}";
    }

}

