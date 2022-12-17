package Exercise_11;

import java.util.Scanner;

public class Temperature implements Convertable
{
    private double temperature;
    private int choice;

    Temperature(double temp, int tmp)
    {
        temperature = temp;
        choice = tmp;
    }

    @Override
    public void convert() {
        Scanner scan = new Scanner(System.in);
        int select;
        System.out.println("В какую температуру хотите перевести: 1 - Кельвин, 2 - Фаренгейт, 3 - Цельсия");
        select = scan.nextInt();
        if ((select == 1 && choice == 1) || (select == 2 && choice == 2) || (select == 3 && choice == 3))
            System.out.println("Перевод не нужен.");
        else{
            if (select == 3 && choice == 2){
                temperature  = (temperature - 32) / 1.8;
                choice = 3;
            }
            else if (select == 1 && choice == 2){
                temperature  = (temperature - 32) / 1.8 + 273.15;
                choice = 1;
            }
            else if (select == 1 && choice == 3){
                temperature += 273.15;
                choice = 1;
            }
            else if (select == 2 && choice == 3){
                temperature = temperature * 1.8 + 32;
                choice = 2;
            }
            else if (select == 2 && choice == 1){
                temperature = (temperature - 273.15) * 1.8 + 32;
                choice = 2;
            }
            else if (select == 3 && choice == 1){
                temperature -= 273.15;
                choice = 3;
            }
            System.out.println("Перевод осуществлен: " + temperature);
        }
    }
}
