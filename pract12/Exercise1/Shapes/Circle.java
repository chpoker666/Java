package Exercise1.Shapes;

import java.util.Random;

public class Circle extends Shape {
    private int axisFirst, axisSecond;

    public Circle(){
        super();
        Random rand = new Random();
        axisFirst = rand.nextInt(30) + 10;
        axisSecond = rand.nextInt(30) + 10;
    }

    public int getAxisFirst() {
        return axisFirst;
    }

    public int getAxisSecond() {
        return axisSecond;
    }
}
