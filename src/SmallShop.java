import java.util.Scanner;

public class SmallShop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String product = input.nextLine();
        String city = input.nextLine();
        double quant = Double.parseDouble(input.nextLine());
        double price = 0;
        if (product.equals("coffee")) {
            if (city.equals("London")) {
                price = quant * 0.50;
            } else if (city.equals("Rome")) {
                price = quant * 0.40;
            } else if (city.equals("Paris")) {
                price = quant * 0.45;
            }
            System.out.printf("%f", price);
        } else if (product.equals("water")) {
            if (city.equals("London")) {
                price = quant * 0.80;
            } else if (city.equals("Rome")) {
                price = quant * 0.70;
            } else if (city.equals("Paris")) {
                price = quant * 0.70;
            }
            System.out.printf("%f", price);
        } else if (product.equals("beer")) {
            if (city.equals("London")) {
                price = quant * 1.20;
            } else if (city.equals("Rome")) {
                price = quant * 1.15;
            } else if (city.equals("Paris")) {
                price = quant * 1.10;
            }
            System.out.printf("%f", price);
        } else if (product.equals("sweets")) {
            if (city.equals("London")) {
                price = quant * 1.45;
            } else if (city.equals("Rome")) {
                price = quant * 1.30;
            } else if (city.equals("Paris")) {
                price = quant * 1.35;
            }
            System.out.printf("%f", price);
        } else if (product.equals("peanuts")) {
            if (city.equals("London")) {
                price = quant * 1.60;
            } else if (city.equals("Rome")) {
                price = quant * 1.50;
            } else if (city.equals("Paris")) {
                price = quant * 1.55;
            }
            System.out.printf("%f", price);
        }
    }
}