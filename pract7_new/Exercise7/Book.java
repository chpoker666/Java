package Exercise7;

public class Book implements Printable
{
    private String name, author, date;
    Book(String name, String author, String date){
        this.name = name;
        this.author = author;
        this.date = date;
    }

    public static void printBooks(Printable[] printable){
        System.out.print("Книги: ");
        for (Printable el: printable){
            if (el instanceof Book)
                System.out.print(((Book) el).getName() + " ");
        }
    }

    public String getName() {
        return name;
    }

    @Override
    public void print() {
        System.out.println("Данная книга имеет следующие параметры:\n    Название: " + name + "\n    Автор: " + author + "\n    Дата издания: " + date);
    }
}
