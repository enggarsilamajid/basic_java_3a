import java.util.Scanner;

public class NumberinRange {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = Integer.parseInt(input.nextLine());
        if (num >= -100 && num <= 100 && num != 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
