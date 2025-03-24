import java.util.Scanner;

public class Yard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sm = Double.parseDouble(scanner.nextLine());
        double price=1;
        double dis=1;
        if (sm>0 && sm<=10000.00) {
            price = sm * 7.61;
            dis=0.18 * price;
            System.out.printf("The final price is: %f USD. \nThe discount is: %f USD.",price-dis,dis);
        }
    }
}
