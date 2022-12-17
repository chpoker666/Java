package Exercise1.Shapes;

import java.util.Random;

public class Rectangle extends Shape {
    private int width, height;

    public Rectangle(){
        super();
        Random rand = new Random();
        width = rand.nextInt(30) + 10;
        height = rand.nextInt(30) + 10;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}
