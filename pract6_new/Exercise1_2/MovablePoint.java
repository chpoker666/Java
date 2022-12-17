package Exercise1_2;

import Exercise1_2.Movable;

public class MovablePoint implements Movable {
    private int x;
    private int y;
    private int xSpeed;
    private int ySpeed;

    public MovablePoint(int _x, int _y, int _xSpeed, int _ySpeed){
        x = _x;
        y = _y;
        xSpeed = _xSpeed;
        ySpeed = _ySpeed;
    }

    public String toString(){
        return "Точка расположена в точке (" + x + ", " + y + ").";
    }

    public int getxSpeed() {
        return xSpeed;
    }

    public int getySpeed() {
        return ySpeed;
    }

    @Override
    public void moveUp() {
        ySpeed = -1;
        xSpeed = 0;
    }

    @Override
    public void moveDown() {
        ySpeed = 1;
        xSpeed = 0;
    }

    @Override
    public void moveLeft() {
        ySpeed = 0;
        xSpeed = -1;
    }

    @Override
    public void moveRight() {
        ySpeed = 0;
        xSpeed = 1;
    }

}
