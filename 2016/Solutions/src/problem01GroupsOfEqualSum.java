import java.text.DecimalFormat;
import java.util.Scanner;

public class problem01GroupsOfEqualSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int num3 = Integer.parseInt(scanner.nextLine());
        int num4 = Integer.parseInt(scanner.nextLine());

        double halfSum = (num1 + num2 + num3 + num4) / 2.0;

        if (num1 == halfSum || num2 == halfSum || num3 == halfSum || num4 == halfSum || num1 + num4 == halfSum || num1 + num3 == halfSum || num1 + num2 == halfSum) {
            System.out.println("Yes");
            System.out.println(new DecimalFormat("0").format(halfSum));
        } else {
            System.out.println("No");
        }
    }
}
