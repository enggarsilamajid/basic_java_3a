import java.util.Scanner;

public class WorkingHours {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int hour = Integer.parseInt(input.nextLine());
        String day = input.nextLine();
        switch (day) {
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
            case "Saturday":
                if (hour >= 10 && hour <= 18) {
                    System.out.println("open");
                } else {
                    System.out.println("closed");
                }
                break;
            default:
                System.out.println("closed");
        }
    }
}
