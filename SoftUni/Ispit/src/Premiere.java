import javax.print.DocFlavor;
import java.util.Scanner;

public class Premiere {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        String movie = scanner.nextLine();
        String pac = scanner.nextLine();
        int num=Integer.parseInt(scanner.nextLine());
        double total=0.0;

        if (movie.equals("Star Wars")){
            if (pac.equals("Drink")){
                total=18*num;
            } else if (pac.equals("Popcorn")) {
                total=25*num;
            } else if (pac.equals("Menu")) {
                total=30*num;
            }
            if(num>=4){
                total*=0.7;
            }
        }else if (movie.equals("Jumanji")){
            if (pac.equals("Drink")){
                total=9*num;
            } else if (pac.equals("Popcorn")) {
                total=11*num;
            } else if (pac.equals("Menu")) {
                total=14*num;
            }
            if(num==2){
                total*=0.85;
            }
        }else if (movie.equals("John Wick")){
            if (pac.equals("Drink")){
                total=12*num;
            } else if (pac.equals("Popcorn")) {
                total=15*num;
            } else if (pac.equals("Menu")) {
                total=19*num;
            }
        }

        System.out.printf("Your bill is %.2f USD.",total);
    }
}
