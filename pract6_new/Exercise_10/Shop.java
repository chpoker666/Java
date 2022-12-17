package Exercise_10;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Shop {
    ArrayList<Computer> computers;
    Shop(){
        computers = new ArrayList<>();
    }
    public Computer findComputer(){
        Computer ans = null;
        Processor proc = null;
        Memory mem = null;
        Monitor mon = null;
        Marks mark = null;
        Scanner scanner = new Scanner(System.in);
        int count;
        System.out.print("Введите количество различных признаков, по которому необходимо выбрать компьютер (от 1 до 4): ");
        count = scanner.nextInt();
        for (int i = 0; i < count; ++i){
            int characteristic;
            System.out.print("Введите по какому признаку хотите выбрать компьютер (1 - процессор, 2 - память, 3 - монитор, 4 - марка): ");
            characteristic = scanner.nextInt();
            if (characteristic == 1)
                proc = new Processor();
            else if (characteristic == 2)
                mem = new Memory();
            else if (characteristic == 3)
                mon = new Monitor();
            else{
                System.out.print("Выберите марку (1 - ASUS, 2 - Lenono, 3 - Dell): ");
                int choice = scanner.nextInt();
                if (choice == 1)
                    mark = Marks.ASUS;
                else if (choice == 2)
                    mark = Marks.Lenono;
                else mark = Marks.Dell;
            }
        }
        for (Computer el: computers){
            if(el.isComputer(proc, mem, mon, mark))
                ans = el;
        }
        if (ans == null)
            System.out.println("Компьютера с такой характеристикой у нас в магазин не завезли");
        return ans;
    }

    public void addComputer(Computer newComputer){
        computers.add(newComputer);
    }

    public void removeComputer(){
        computers.remove(findComputer());
    }

    public void printAllComputers(){
        if (computers.size() != 0) {
            System.out.println("Все доступные в магазине компьютеры: ");
            for (int i = 0; i < computers.size(); ++i)
                System.out.println("Комьютер " + (i + 1) + ":\n" + computers.get(i));
        }
        else System.out.println("Магазин пуст");
    }
}
