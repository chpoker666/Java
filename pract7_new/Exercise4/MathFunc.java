package Exercise4;

import static java.lang.Math.*;

public class MathFunc implements MathCalculable{
    private double x, y, phi;
    MathFunc(double xNew, double yNew){
        x = xNew;
        y = yNew;
        phi = atan2(y, x);
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setX(double x) {
        this.x = x;
    }

    @Override
    public double absComplex() {
        return sqrt(x*x + y+y);
    }

    @Override
    public void powComplex(int k) {
        double absValue = pow(absComplex(), k);
        double first = cos(k*phi);
        double second = sin(k*phi);
        setX(absValue*first);
        setY(absValue*second);
    }

    @Override
    public String toString() {
        if (y > 0)
            return "Ваше комплексное число: " + x + " + " + y + "i";
        else if (y < 0)
            return "Ваше комплексное число: " + x + " " + y + "i";
        else return "Ваше комплексное число: " + x;
    }
}
