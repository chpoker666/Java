package Exercise_3;

public class Pet implements Nameable {
    private String name;
    Pet(String newName){
        name = newName;
    }

    @Override
    public String getName() {
        return name;
    }
}
