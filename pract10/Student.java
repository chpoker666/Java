public class Student {

    private String firstName,secondName, specialty, group;
    private int course, GPA;

    public Student(String firstName, int GPA){
        this.firstName = firstName;
        this.GPA = GPA;
        secondName = "Kal";
        specialty = "ing";
        course = 2;
        group = "ikbo-04-21";
    }
    public Student(String firstName, String secondName, String specialty, int course, String group, int GPA) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.specialty = specialty;
        this.course = course;
        this.group = group;
        this.GPA = GPA;
    }

    @Override
    public String toString() {
        return "Студент " + firstName + " " + secondName + ":\n"
                + "    Специальность: " + specialty + "\n"
                + "    Курс: " + course + "\n"
                + "    Группа: " + group + "\n"
                + "    Средняя оценка: " + GPA + "\n";
    }

    public int getGPA() {
        return GPA;
    }

    public void setGPA(int newGPA) {
        GPA = newGPA;
    }
}
