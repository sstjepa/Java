import java.util.Scanner;

public class Projects {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String arhitekta = scanner.nextLine();
        int projekti = Integer.parseInt(scanner.nextLine());
        int prep =3;
        System.out.printf("The architect %s will need %d hours to complete %d project/s.",arhitekta,projekti*prep,projekti);
    }
}
