package Exercise_3;

public class Person implements Nameable{
    private String firstName, secondName;
    Person(String name_1, String name_2){
        firstName = name_1;
        secondName = name_2;
    }

    @Override
    public String getName() {
        return firstName + " " + secondName;
    }
}
