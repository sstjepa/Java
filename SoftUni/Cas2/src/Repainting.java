import java.util.Scanner;

public class Repainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nylon = Integer.parseInt(scanner.nextLine());
        int paint = Integer.parseInt(scanner.nextLine());
        int deterg = Integer.parseInt(scanner.nextLine());
        int hour = Integer.parseInt(scanner.nextLine());

        double total, totsum;
        total = (nylon+2)*1.5+ (paint*1.1)*14.5+ deterg*5+ 0.4;

        totsum=((total*0.3)*hour)+total;
        System.out.println(totsum);


    }
}
