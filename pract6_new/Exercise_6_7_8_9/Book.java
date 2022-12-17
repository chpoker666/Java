package Exercise_6_7_8_9;

public class Book implements Printable{
    private String name, author, date;
    Book(String name, String author, String date){
        this.name = name;
        this.author = author;
        this.date = date;
    }

    @Override
    public void print() {
        System.out.println("Данная книга имеет следующие параметры:\n    Название: " + name + "\n    Автор: " + author + "\n    Дата издания: " + date);
    }
}
