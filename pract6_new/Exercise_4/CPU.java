package Exercise_4;

public class CPU implements Priceable{
    private int price, watts, countCore;

    CPU(int price, int watts, int countCore ){
        this.price = price;
        this.watts = watts;
        this.countCore = countCore;
    }

    @Override
    public int getPrice() {
        return price;
    }
}
