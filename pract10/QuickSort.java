import java.util.Scanner;

public class QuickSort {
    private static SortingStudentsByGPA comparator = new SortingStudentsByGPA();
    public static void quickSort(Student[] array, int low, int high){
        if(array == null || array.length == 0)
            return;
        if(high <= low)
            return;
        Student middle = array[(low + high)/2];
        int i = low;
        int j = high;
        while (i <= j){
            while (comparator.compare(middle, array[i]) < 0)
                i++;
            while (comparator.compare(middle, array[j]) > 0)
                j--;
            if (i <= j) {
                Student tmp = array[i];
                array[i] = array[j];
                array[j] = tmp;
                i++;
                j--;
            }
        }
        if (low < j)
            quickSort(array, low, j);
        else if (high > i)
            quickSort(array, i, high);
    }
    public static void merge(Student[] a, Student[] l, Student[] r, int left, int right){
        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (comparator.compare(l[i], r[j]) > 0)
                a[k++] = l[i++];
            else
                a[k++] = r[j++];
        }
        while (i < left)
            a[k++] = l[i++];
        while (j < right)
            a[k++] = r[j++];
    }
    public static void mergeSort(Student[] array, int size){
        if (size < 2)
            return;
        int mid = size / 2;
        Student[] l = new Student[mid];
        Student[] r = new Student[size - mid];
        System.arraycopy(array, 0, l, 0, mid);
        if (size - mid >= 0) System.arraycopy(array, mid, r, 0, size - mid);
        mergeSort(l, mid);
        mergeSort(r, size - mid);
        merge(array, l, r, mid, size - mid);
    }

    public static Student[] setArray(){
        System.out.print("Введите количество студентов: ");
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        Student [] iDNumber = new Student[size];
        String name_1, name_2, speciality, group;
        int GPA, course;
        for (int i = 0; i < size; ++i){
            System.out.print("Введите имя студента: ");
            name_1 = scan.next();
            System.out.print("Введите фамилию студента: ");
            name_2 = scan.next();
            System.out.print("Введите специальность студента: ");
            speciality = scan.next();
            System.out.print("Введите курс студента: ");
            course = scan.nextInt();
            System.out.print("Введите группа студента: ");
            group = scan.next();
            System.out.print("Введите среднюю оценку студента: ");
            GPA = scan.nextInt();
            iDNumber[i] = new Student(name_1, name_2, speciality, course, group, GPA);
        }
        return iDNumber;
    }

    public static void main(String []args){
        //Student[] iDNumber = setArray();

        Student[] iDNumber = new Student[3];
        iDNumber[0] =  new Student("sasha", 5);
        iDNumber[1] = new Student("peta", 15);
        iDNumber[2] =new Student("ivan", 10);

        Student[] iDNumber2 = new Student[4];
        iDNumber2[0] =  new Student("ulean", 8);
        iDNumber2[1] = new Student("adolf", 7);
        iDNumber2[2] =new Student("avatar", 11);
        iDNumber2[3] =new Student("aang", 13);
        quickSort(iDNumber2, 0, iDNumber2.length - 1);
        for (Student s : iDNumber2)
            System.out.println(s);
    }
}
