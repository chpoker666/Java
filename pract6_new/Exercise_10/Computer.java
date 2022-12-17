package Exercise_10;

import java.util.Objects;
import java.util.Scanner;

public class Computer {
    private Processor processor;
    private Memory ram;
    private Monitor monitor;

    private Marks mark;
    Computer(Processor proc, Memory memory, Monitor monic){
        Scanner scanner = new Scanner(System.in);
        processor = proc;
        ram = memory;
        monitor = monic;
        System.out.print("Выберите название марки компьютера (1 - ASUS, 2 - Lenono, 3 - Dell)");
        int count = scanner.nextInt();
        if (count == 1)
            mark = Marks.ASUS;
        else if (count == 2)
            mark = Marks.Lenono;
        else mark = Marks.Dell;
    }

    public String getStringMark(){
        String markString = "Марка: ";
        if (mark == Marks.ASUS)
            markString += "ASUS";
        else if (mark == Marks.Lenono)
            markString += "Lenovo";
        else
            markString += "Dell";
        return markString;
    }
    public boolean isComputer(Processor proc, Memory mem, Monitor mon, Marks mar){
        boolean ans = true;
        if (proc != null && !processor.equals(proc))
            ans = false;
        if (mem != null && !ram.equals(mem))
            ans = false;
        if (mon != null && !monitor.equals(mon))
            ans = false;
        else if (mar != null && mark != mar)
            ans = false;
        return ans;
    }

    @Override
    public String toString() {
        return "" + processor + ram + monitor + getStringMark() + "\n";
    }
}
