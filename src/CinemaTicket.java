import java.util.Scanner;

public class CinemaTicket {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String day = input.nextLine();
        switch (day) {
            case "Monday":
            case "Tuesday":
            case "Friday":
                System.out.println("12");
                break;
            case "Wednesday":
            case "Thursday":
                System.out.println("14");
                break;
            case "Saturday":
            case "Sunday":
                System.out.println("16");
                break;
        }
    }
}
