import java.util.Scanner;

public class Pages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int page = Integer.parseInt(scanner.nextLine());
        int hour = Integer.parseInt(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());

        int out = (page/hour)/days;
        System.out.println(out);
    }
}
