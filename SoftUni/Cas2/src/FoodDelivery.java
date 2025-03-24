import java.util.Scanner;

public class FoodDelivery {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        int chicken=Integer.parseInt(scanner.nextLine());
        int fish=Integer.parseInt(scanner.nextLine());
        int vege=Integer.parseInt(scanner.nextLine());

        double total;
        total=chicken*10.35+ fish*12.4+ vege*8.15;

        System.out.println(total+(total*0.2)+2.5);
    }
}
