package Exercise_10;

import java.util.Scanner;

public class Tester {
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        Shop shop = new Shop();
        while (true){
            System.out.println("Выполните операцию (1 - добавить компьютер, 2 - удалить компьютер, 3 - найти компьютер, 4 - показать список компьютеров, 5 - выход из магазина)");
            int choice;
            choice = scanner.nextInt();
            if (choice == 1){
                Processor processor = new Processor();
                Memory memory = new Memory();
                Monitor monitor = new Monitor();
                Computer add = new Computer(processor, memory, monitor);
                shop.addComputer(add);
                System.out.println("Компьютер был успешно добавлен в перечень товаров магазина");
            }
            else if (choice == 2){
                shop.removeComputer();
                System.out.println("Компьютер был успешно удален из перечня товаров магазина");
            }
            else if (choice == 3){
                Computer ans = shop.findComputer();

                System.out.println(ans);
            }
            else if (choice == 4)
                shop.printAllComputers();
            else break;
        }
    }
}
