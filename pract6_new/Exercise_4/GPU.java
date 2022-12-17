package Exercise_4;

public class GPU implements Priceable{
    private int price, watts, countCudaCores, countTensorCores;

    GPU(int price, int watts, int countCudaCores, int countTensorCores){
        this.price = price;
        this.watts = watts;
        this.countCudaCores = countCudaCores;
        this.countTensorCores = countTensorCores;
    }

    @Override
    public int getPrice() {
        return price;
    }
}
