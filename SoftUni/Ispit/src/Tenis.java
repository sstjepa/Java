import java.util.Scanner;

public class Tenis {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        double reket=Double.parseDouble(scanner.nextLine());
        int numrek=Integer.parseInt(scanner.nextLine());
        int numsneak=Integer.parseInt(scanner.nextLine());

        double total;

        double totalrek=reket*numrek;
        double sneaker=reket/6;
        double totalsneak=sneaker*numsneak;

        total=(totalrek+totalsneak)*1.2;

        double djokovic=Math.floor(total/8);
        double sponsor=Math.ceil(total/8*7);
        System.out.printf("Price to be paid by Djokovic %.0f\n",djokovic);
        System.out.printf("Price to be paid by sponsors %.0f",sponsor);

    }
}
