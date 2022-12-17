package Exercise7;

import Exercise5_6.ProcessStrings;

public class Magazine implements Printable
{
    private String name, date;
    private int issue;
    Magazine(String name, int issue, String date){
        this.name = name;
        this.issue = issue;
        this.date = date;
    }

    public static void printMagazines(Printable[] printable){
        System.out.print("Журналы: ");
        for (Printable el: printable){
            if (el instanceof Magazine)
                System.out.print(((Magazine) el).getName() + " ");
        }
    }

    public String getName() {
        return name;
    }

    @Override
    public void print() {
        System.out.println("Данный журнал имеет следующие параметры:\n    Название: " + name + "\n    Выпуск: " + issue + "\n    Дата издания: " + date);
    }
}
