import java.util.Arrays;
import java.util.Scanner;

public class problem03SumTime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String time1 = scanner.nextLine();
        String time2 = scanner.nextLine();


    }

    private static int[] parseTime(String time) {
        if (time.indexOf("::") == 1) {
            time = "0::" + time;
        }
        time.replace("::", ":");
        int[] timeTokens = time.split(":")
    }
}
