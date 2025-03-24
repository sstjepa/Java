import java.util.Scanner;

public class Toys {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double Puzzle=2.60;
        double Doll=3.0;
        double Bear=4.10;
        double Minion=8.20;
        double Truck=2.0;

        double trip=Double.parseDouble(scanner.nextLine());
        int nump=Integer.parseInt(scanner.nextLine());
        int numd=Integer.parseInt(scanner.nextLine());
        int numb=Integer.parseInt(scanner.nextLine());
        int numm=Integer.parseInt(scanner.nextLine());
        int numt=Integer.parseInt(scanner.nextLine());

        double total=Puzzle*nump+Doll*numd+Bear*numb+Minion*numm+Truck*numt;


        int numtoys=numb+numd+numm+numt+nump;
        if (numtoys>=50){
            total*=0.75;
        }

        total*=0.9;

        if (total>=trip){
            System.out.printf("Yes! %.2f USD left.",total-trip);
        }else {
            System.out.printf("Not enough money! %.2f USD needed.",trip-total);
        }
    }
}
