package Practice;

public class MovableCircle implements Movable{
    private int radius;
    private MovablePoint center;

    MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius){
        center.x = x;
        center.y = y;
        center.xSpeed = xSpeed;
        center.ySpeed = ySpeed;
        this.radius = radius;
    }

    @Override
    public void moveUp() {
        center.y += center.ySpeed;
    }

    @Override
    public void moveDown() {
        center.y -= center.ySpeed;
    }

    @Override
    public void moveLeft() {
        center.x -= center.xSpeed;
    }

    @Override
    public void moveRight() {
        center.x += center.xSpeed;
    }
}
