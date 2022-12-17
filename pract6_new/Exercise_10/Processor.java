package Exercise_10;

import java.util.Objects;
import java.util.Scanner;

public class Processor {
    private String name;
    private int countCores;
    private double frequency;
    Processor(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите название процессора: ");
        name = scanner.next();
        System.out.print("Введите количество ядер процессора: ");
        countCores = scanner.nextInt();
        System.out.print("Введите частоту процессора: ");
        frequency = scanner.nextDouble();
    }

    public String getName() {
        return name;
    }

    public int getCountCores() {
        return countCores;
    }

    public double getFrequency() {
        return frequency;
    }

    public boolean equals(Processor obj) {
        return Objects.equals(name, obj.getName()) && countCores == obj.getCountCores() && frequency == obj.getFrequency();
    }

    @Override
    public String toString() {
        return "    Процессор:\n" +
                "        Название: " + name + "\n" +
                "        Количество ядер: " + countCores + "\n" +
                "        Частота: " + frequency + "\n";
    }
}
