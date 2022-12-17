package Exercise_6_7_8_9;

public class Magazine implements Printable{
    private String name, date;
    private int issue;
    Magazine(String name, int issue, String date){
        this.name = name;
        this.issue = issue;
        this.date = date;
    }

    @Override
    public void print() {
        System.out.println("Данный журнал имеет следующие параметры:\n    Название: " + name + "\n    Выпуск: " + issue + "\n    Дата издания: " + date);
    }
}
