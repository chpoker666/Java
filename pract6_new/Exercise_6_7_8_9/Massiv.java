package Exercise_6_7_8_9;

import java.util.ArrayList;

public class Massiv {
    public static void main(String [] args){
        ArrayList<Printable> arr = new ArrayList<>();
        arr.add(new Book("Flight", "Tom Cruise", "23/04/2022"));
        arr.add(new Book("War", "Top Gun", "23/04/2003"));
        arr.add(new Magazine("War And Piece Bro", 283, "23/04/2003"));
        for (Printable el: arr){
            el.print();
        }
    }
}
