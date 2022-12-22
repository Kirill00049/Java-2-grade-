package Movable;

import java.lang.*;
public class MovablePoint implements Movable {
    public int x;
    public int y;
    public int xSpeed;
    public int ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed){
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    };

    @Override
    public void moveUp()
    {
        y += ySpeed;
    };
    @Override
    public void moveDown()
    {
        y -= ySpeed;
    };
    @Override
    public void moveLeft()
    {
        x -= xSpeed;
    };
    @Override
    public void moveRight()
    {
        x += xSpeed;
    };
    public String toString(){
        return "x = " + x + '\n' +
                "y = " + y + '\n' +
                "xSpeed = " + xSpeed + '\n' +
                "ySpeed = " + ySpeed;
    }

}
