package Exercise1_2;

import Exercise1_2.Movable;
import Exercise1_2.MovablePoint;

public class MovableRectangle implements Movable {
    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
        if (y1 < y2) {
            topLeft = new MovablePoint(x2, y2, xSpeed, ySpeed);
            bottomRight = new MovablePoint(x1, y1, xSpeed, ySpeed);
        } else {
            topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
            bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
        }
        System.out.println(bottomRight.getxSpeed() + " " + bottomRight.getySpeed());
        System.out.println(bottomRight.getxSpeed() + " " + bottomRight.getySpeed());
    }

    @Override
    public String toString() {
        return "Прямоугольник перемещается со скоростью: по горизонтали - " + bottomRight.getxSpeed() + ", по вертикали - " + bottomRight.getySpeed();
    }

    @Override
    public void moveUp() {
        topLeft.moveUp();
        bottomRight.moveUp();
    }

    @Override
    public void moveDown() {
        topLeft.moveDown();
        bottomRight.moveDown();
    }

    @Override
    public void moveLeft() {
        topLeft.moveLeft();
        bottomRight.moveLeft();
    }

    @Override
    public void moveRight() {
        topLeft.moveRight();
        bottomRight.moveRight();
    }
}
