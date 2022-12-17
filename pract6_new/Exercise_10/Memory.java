package Exercise_10;

import java.util.Objects;
import java.util.Scanner;

public class Memory {
    private String name;
    private int count;
    private double frequency;
    Memory(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите название памяти: ");
        name = scanner.next();
        System.out.print("Введите количество памяти: ");
        count = scanner.nextInt();
        System.out.print("Введите частоту оборотов памяти: ");
        frequency = scanner.nextDouble();
    }

    public String getName() {
        return name;
    }

    public int getCount() {
        return count;
    }

    public double getFrequency() {
        return frequency;
    }

    public boolean equals(Memory obj) {
        return Objects.equals(name, obj.getName()) && count == obj.getCount() && frequency == obj.getFrequency();
    }

    @Override
    public String toString() {
        return "    Память:\n" +
                "        Название: " + name + "\n" +
                "        Количество: " + count + "\n" +
                "        Частота оборотов: " + frequency + "\n";
    }
}
