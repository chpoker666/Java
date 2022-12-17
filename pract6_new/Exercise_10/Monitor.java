package Exercise_10;

import java.util.Objects;
import java.util.Scanner;

public class Monitor {
    private String name, resolution;
    private double diagonal;
    Monitor(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите название монитора: ");
        name = scanner.next();
        System.out.print("Введите диагональ монитора: ");
        diagonal = scanner.nextDouble();
        System.out.print("Введите разрешение монитора: ");
        resolution = scanner.next();
    }

    public String getName() {
        return name;
    }

    public double getDiagonal() {
        return diagonal;
    }

    public String getResolution() {
        return resolution;
    }

    public boolean equals(Monitor obj) {
        return Objects.equals(name, obj.getName()) && diagonal == obj.getDiagonal() && resolution == obj.getResolution();
    }

    @Override
    public String toString() {
        return "    Монитор:\n" +
                "        Название: " + name + "\n" +
                "        Диагональ: " + diagonal + "\n" +
                "        Разрешение: " + resolution + "\n";
    }
}
