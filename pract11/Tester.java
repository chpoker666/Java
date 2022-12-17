import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Tester {

    public static ArrayList<Integer> createArrayList(){
        ArrayList<Integer> ans = new ArrayList<>(10);
        for (int i = 0; i < 10; ++i)
            ans.add(i, i + 1);
        return ans;
    }

    public static LinkedList<Integer> createLinkedList(){
        LinkedList<Integer> ans = new LinkedList<>();
        Random rand = new Random();
        for (int i = 0; i < 10; ++i)
            ans.add(i + 1);
        return ans;
    }

    public static void main(String [] args) throws ParseException {
//Задание 1
         /*Date dateBegin = new Date(2022, 10, 10, 12, 40);
        Date dateEnd = new Date();
        System.out.print("Пискун Ярослав:\n    Дата получения работы: " + dateBegin.toString()
                + "\n    Дата завершения работы: " + dateEnd.toString());*/
//Задание 2
        /* Scanner scan = new Scanner(System.in);
        System.out.print("Введите дату (в таком формате 2017-9-11): ");
        String stringDate = scan.next();
        Date personDate = new SimpleDateFormat("y-M-d").parse(stringDate);
        Date now = new Date();
        if (now.getTime() - personDate.getTime() < 86400000 && now.getTime() - personDate.getTime() > 0)
            System.out.print("Даты совпадают");
        else if (now.getTime() - personDate.getTime() > 86400000)
            System.out.print("Дата, введенная пользователем, была в прошлом");
        else System.out.print("Дата, введенная пользователем, будет в будущем");*/

//Задание 3
        /*   Scanner scan = new Scanner(System.in);
        System.out.print("Введите имя студента: ");
        String name = scan.next();
        System.out.print("Введите дату (в таком формате 2017-9-11): ");
        String stringDate = scan.next();
        Date personDate = new SimpleDateFormat("y-M-d").parse(stringDate);
        System.out.print(personDate);
        Student ans = new Student(name, personDate);
        System.out.print("Существует 3 типа формата даты:\n" +
                "1 - год (4 знака).месяц (2 знака).день (2 знака)\n" +
                "2 - день (2 знака), месяц (2 знака), год (2 знака)\n" +
                "3 - сокр. день недели, день, месяц (название), год (4 знака)\n" +
                "Введите цифру формата: ");
        int choice = scan.nextInt();
        System.out.print(ans.toString(choice));*/


//Задание 4
       /* Scanner scan = new Scanner(System.in);
        System.out.print("Введите дату (в таком формате 05-09-2018 13:01): ");
        String stringDate = scan.nextLine();
        Date personDate = new SimpleDateFormat("dd-MM-yyyy HH:mm").parse(stringDate);
        System.out.print(personDate);*/

//Задание 5
        long start = System.nanoTime();
        ArrayList<Integer> first = createArrayList();
        long timeWorkCode = System.nanoTime() - start;
        System.out.println("Время добавления 10 элементов в ArrayList: " + timeWorkCode + " наносекунд");
        start = System.nanoTime();
        LinkedList<Integer> second = createLinkedList();
        timeWorkCode = System.nanoTime() - start;
        System.out.println("Время добавления 10 элементов в LinkedList: " + timeWorkCode + " наносекунд");
        start = System.nanoTime();
        first.remove(4);
        timeWorkCode = System.nanoTime() - start;
        System.out.println("Время удаления в ArrayList: " + timeWorkCode + " наносекунд");
        start = System.nanoTime();
        second.remove(4);
        timeWorkCode = System.nanoTime() - start;
        System.out.println("Время удаления в LinkedList: " + timeWorkCode + " наносекунд");
        start = System.nanoTime();
        first.add(1, 100);
        timeWorkCode = System.nanoTime() - start;
        System.out.println("Время вставки в ArrayList: " + timeWorkCode + " наносекунд");
        start = System.nanoTime();
        second.add(1, 100);
        timeWorkCode = System.nanoTime() - start;
        System.out.println("Время вставки в LinkedList: " + timeWorkCode + " наносекунд");
    }
}
