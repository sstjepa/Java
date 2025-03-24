import java.util.Scanner;

public class School {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pens= Integer.parseInt(scanner.nextLine());
        int markers= Integer.parseInt(scanner.nextLine());
        int deterget= Integer.parseInt(scanner.nextLine());
        int popust= Integer.parseInt(scanner.nextLine());

        double total= pens*5.8+ markers*7.2+ deterget*1.2;

        System.out.println(total-(total*popust/100));


    }
}
