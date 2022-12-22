package Practice;

public class MovableRectangle implements Movable {
    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed){
        topLeft.x = x1;
        topLeft.y = y1;
        topLeft.xSpeed = xSpeed;
        topLeft.ySpeed = ySpeed;
        bottomRight.x = x2;
        bottomRight.y = y2;
        bottomRight.xSpeed = xSpeed;
        bottomRight.ySpeed = ySpeed;
    }

    @Override
    public void moveUp() {
        if (topLeft.ySpeed == bottomRight.ySpeed) {
            topLeft.y += topLeft.ySpeed;
            bottomRight.y += bottomRight.ySpeed;
        }
        else{
            System.out.println("Скорости не равны");
        }
    }

    @Override
    public void moveDown() {
        if (topLeft.ySpeed == bottomRight.ySpeed) {
            topLeft.y -= topLeft.ySpeed;
            bottomRight.y -= bottomRight.ySpeed;
        }
        else{
            System.out.println("Скорости не равны");
        }
    }

    @Override
    public void moveLeft() {
        if (topLeft.xSpeed == bottomRight.xSpeed) {
            topLeft.x -= topLeft.xSpeed;
            bottomRight.x -= bottomRight.xSpeed;
        }
        else{
            System.out.println("Скорости не равны");
        }
    }

    @Override
    public void moveRight() {
        if (topLeft.xSpeed == bottomRight.xSpeed) {
        topLeft.x += topLeft.xSpeed;
        bottomRight.x += bottomRight.xSpeed;
    }
        else{
            System.out.println("Скорости не равны");
        }
    }

    public String toString(){
        return ("Координаты точки topLeft: " + topLeft.x + ";" + topLeft.y + ", координаты точки bottomRight: " + bottomRight.x + ";" + bottomRight.y + "\nСкорость по x: " + topLeft.xSpeed + " Скорость по y: " + topLeft.ySpeed);
    }
}
