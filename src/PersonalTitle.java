import java.util.Scanner;

public class PersonalTitle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double age = Double.parseDouble(input.nextLine());
        String gender = input.nextLine();
        if (gender.equals("f")) {
            if (age < 16) {
                System.out.println("Miss");
            } else if (age >= 16) {
                System.out.println("Ms.");
            }
        } else if (gender.equals("m")) {
            if (age < 16) {
                System.out.println("Master");
            } else if (age >= 16) {
                System.out.println("Mr.");
            }
        }
    }
}