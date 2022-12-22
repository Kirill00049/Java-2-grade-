package Movable;

import java.lang.*;

public class TestMove {
    public static void main(String[] args){
        MovablePoint MP = new MovablePoint(3, 2, 4, 6);
        MP.moveUp();
        MP.moveRight();
        System.out.println("Точка\n" + MP);

        MovableCircle MC = new MovableCircle(3, 2, 4, 6, 2);
        MC.moveUp();
        MC.moveRight();
        System.out.println("\nКруг\n" + MC);
    }
}
