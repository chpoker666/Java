package Exercise1.Shapes;

import java.awt.*;
import java.util.Random;

public abstract class Shape {
    private Color color;
    private int x, y;

    public Shape(){
        Random rand = new Random();
        x = rand.nextInt(300);
        y = rand.nextInt(300);
        color = new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256));
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Color getColor() {
        return color;
    }
}