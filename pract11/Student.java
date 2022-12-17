import java.text.SimpleDateFormat;
import java.util.Date;

public class Student {
    Date date;
    String name;
    Student(String name, Date date){
        this.name = name;
        this.date = date;
    }

    public String toString(int choice){
        String[] patterns = {	"yyyy.MM.dd",
                "dd.MM.yy GGG",
                "EEE, d MMM yyyy"
        };
        return "Имя студента: " + name + "\nДата рождения: " + new SimpleDateFormat(patterns[choice - 1]).format(date);
    }
}
