import java.util.Comparator;

class SortingStudentsByGPA implements Comparator<Student> {
    public int compare(Student a, Student b){
        return a.getGPA() - b.getGPA();
    }
}
