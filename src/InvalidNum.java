import java.util.Scanner;

public class InvalidNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = Integer.parseInt(input.nextLine());
        if (num < 100 || num > 200) {
            if (num != 0) {
                System.out.println("invalid");
            }
        }
    }
}
