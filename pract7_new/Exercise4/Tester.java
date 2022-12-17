package Exercise4;

import java.util.Scanner;

public class Tester
{
    public static void main(String [] args)
    {
        System.out.print("Введите действительную часть комплексного числа: ");
        Scanner scan = new Scanner(System.in);
        double x = scan.nextDouble();
        System.out.print("Введите мнимую часть комплексного числа: ");
        double y = scan.nextDouble();
        MathFunc func = new MathFunc(x, y);
        System.out.print("Введите степень, в которую хотите возвести ваше комплексное число: ");
        int k = scan.nextInt();
        func.powComplex(k);
        System.out.print("Ваше новое возведенное в степень комплексное число: " + func);
    }
}
