import java.util.Scanner;

public class TradeCommissions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String city = input.nextLine();
        double volume = Double.parseDouble(input.nextLine());
        double com = 0;
        if (volume >= 0) {
            switch (city) {
                case "London":
                    if (volume >= 0 && volume <= 500) {
                        com = volume * 0.05;
                    } else if (volume > 500 && volume <= 1000) {
                        com = volume * 0.07;
                    } else if (volume > 1000 && volume <= 10000) {
                        com = volume * 0.08;
                    } else if (volume > 10000) {
                        com = volume * 0.12;
                    }
                    break;
                case "Paris":
                    if (volume >= 0 && volume <= 500) {
                        com = volume * 0.045;
                    } else if (volume > 500 && volume <= 1000) {
                        com = volume * 0.075;
                    } else if (volume > 1000 && volume <= 10000) {
                        com = volume * 0.1;
                    } else if (volume > 10000) {
                        com = volume * 0.13;
                    }
                    break;
                case "Rome":
                    if (volume >= 0 && volume <= 500) {
                        com = volume * 0.055;
                    } else if (volume > 500 && volume <= 1000) {
                        com = volume * 0.08;
                    } else if (volume > 1000 && volume <= 10000) {
                        com = volume * 0.12;
                    } else if (volume > 10000) {
                        com = volume * 0.145;
                    }
                    break;
            } if (com > 0) {
                System.out.printf("%.2f", com);
            } else {
                System.out.println("error");
            }
        } else {
            System.out.println("error");
        }
    }
}
