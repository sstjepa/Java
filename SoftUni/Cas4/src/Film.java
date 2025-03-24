import java.util.Scanner;

public class Film {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        double budget=Double.parseDouble(scanner.nextLine());
        int extras=Integer.parseInt(scanner.nextLine());
        double price=Double.parseDouble(scanner.nextLine());

        double film=budget*0.1;
        double merch=extras*price;
        if (extras>150)
            merch*=0.9;

        double sum=film+merch;
        if (budget>=sum){
            System.out.printf("Action!\nWingard starts filming with %.2f USD left.", budget-sum);
        }else {
            System.out.printf("Not enough money!\nWingard needs %.2f USD more.",sum-budget);
        }

    }
}
