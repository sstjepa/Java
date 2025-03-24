import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        double budget=Double.parseDouble(scanner.nextLine());
        int n=Integer.parseInt(scanner.nextLine());
        int m=Integer.parseInt(scanner.nextLine());
        int p=Integer.parseInt(scanner.nextLine());

        int Card=250;

        double sumcard=n*Card;
        double sumcpu=m*sumcard*0.35;
        double sumram=p*sumcard*0.1;
        double total=sumcard+sumcpu+sumram;

        if (n>m){
            total*=0.85;
        }

        if (budget>=total){
            System.out.printf("You have %.2f USD left!",budget-total);
        }else {
            System.out.printf("Not enough money! You need %.2f USD more!",total-budget);
        }

    }
}
