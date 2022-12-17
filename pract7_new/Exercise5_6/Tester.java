package Exercise5_6;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args)
    {
        System.out.println("Введите строку: ");
        Scanner scan = new Scanner(System.in);
        String value = scan.next();
        ProcessStrings superString = new ProcessStrings(value);
        System.out.print("Введите символ, который хотите посчитать: ");
        String simbol = scan.next();
        System.out.println("Количество символов" + simbol + ": " + superString.countChar(simbol.charAt(0)));
        System.out.println("Строка, состоящая из символов четных позиций: " + superString.odd());
        superString.reverse();
        System.out.print("Перевернутая строка: " + superString.getCurrent());
    }
}
