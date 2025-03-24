import java.util.Scanner;

public class ConcatenateData {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ime = scanner.nextLine();
        String prezime= scanner.nextLine();
        int godine = Integer.parseInt(scanner.nextLine());
        String grad = scanner.nextLine();

        System.out.printf("You are %s %s, a %d-years old person from %s.",ime, prezime,godine,grad);

    }
}
