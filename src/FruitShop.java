import java.util.Scanner;

public class FruitShop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String fruit = input.nextLine();
        String day = input.nextLine();
        double quant = Double.parseDouble(input.nextLine());
        double price = 0;
        double total = 0;
        if (day.equals("Sunday") || day.equals("Saturday")) {
            if (fruit.equals("banana")) {
                price = 2.70;
            } else if (fruit.equals("apple")) {
                price = 1.25;
            } else if (fruit.equals("orange")) {
                price = 0.90;
            } else if (fruit.equals("grapefruit")) {
                price = 1.60;
            } else if (fruit.equals("kiwi")) {
                price = 3.00;
            } else if (fruit.equals("pineapple")) {
                price = 5.60;
            } else if (fruit.equals("grapes")) {
                price = 4.20;
            }
        } else if (day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday") || day.equals("Thursday") || day.equals("Friday")) {
                if (fruit.equals("banana")) {
                    price = 2.50;
                } else if (fruit.equals("apple")) {
                    price = 1.20;
                } else if (fruit.equals("orange")) {
                    price = 0.85;
                } else if (fruit.equals("grapefruit")) {
                    price = 1.45;
                } else if (fruit.equals("kiwi")) {
                    price = 2.70;
                } else if (fruit.equals("pineapple")) {
                    price = 5.50;
                } else if (fruit.equals("grapes")) {
                    price = 3.85;
                }
        }
        total = quant*price;
        if (total !=0) {
            System.out.printf("%.2f", total);
        } else {
            System.out.println("error");
        }
    }
}
