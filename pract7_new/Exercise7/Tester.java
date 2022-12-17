package Exercise7;

public class Tester {

    public static void main(String [] args)
    {
        Printable [] massive = new Printable[5];
        for (int i = 0; i < 5; ++i)
        {
            if (i % 2 == 0){
                Book tmp = new Book("world" + i*i, "bruno", "200" + i);
                massive[i] = tmp;
            }
            else {
                Magazine tmp = new Magazine("war" + i * i, 1984, "100" + i);
                massive[i] = tmp;
            }
        }
        Magazine.printMagazines(massive);
        System.out.print("\n");
        Book.printBooks(massive);
    }
}
