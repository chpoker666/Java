package Exercise5_6;

public class ProcessStrings implements StringAble{
    private String current;

    ProcessStrings(String value){
        current = value;
    }

    public String getCurrent() {
        return current;
    }

    @Override
    public int countChar(char value) {
        int count = 0;
        for (int i = 0; i < current.length(); ++i)
            if (current.charAt(i) == value)
                count++;
        return count;
    }

    @Override
    public String odd() {
        String ans = "";
        for (int i = 0; i < current.length(); i += 2)
            ans += current.charAt(i);
        return ans;
    }

    @Override
    public void reverse() {
        String ans = "";
        for (int i = current.length() - 1; i >= 0; --i)
            ans += current.charAt(i);
        current = ans;
    }
}
