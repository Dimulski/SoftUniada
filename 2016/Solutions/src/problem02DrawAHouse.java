import java.util.Scanner;

public class problem02DrawAHouse {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        String firstLineSide = repeat(".", n - 1);
        System.out.println(firstLineSide + "*" + firstLineSide);
        int whitespaces = 1;
        for (int i = 0; i < n - 1; i++) {
            if (i != n - 2) {
                sb.append((repeat(".", n - 2 - i) + "*" + repeat(" ", whitespaces) + "*" + repeat(".", n - 2 - i)) + "\n");
                whitespaces += 2;
            } else {
                sb.append((String.join(" ", (repeat("*", n).split("")))) + "\n");
            }

        }

        System.out.println(sb.toString());
    }

    public static String repeat(String str, int times) {
        return new String(new char[times]).replace("\0", str);
    }
}
