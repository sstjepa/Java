import java.util.Scanner;

public class Outfit {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int temp=Integer.parseInt(scanner.nextLine());
        String daytime= scanner.nextLine();
        String outfit="";
        String shoes="";

        if (daytime.equals("Morning")) {
            if (temp>=10 && temp<=18){
                outfit="Sweatshirt";
                shoes="Sneakers";
            } else if (temp>18 && temp<=24) {
                outfit="Shirt";
                shoes="Moccasins";
            }else {
                outfit="T-Shirt";
                shoes="Sandals";
            }
        } else if (daytime.equals("Afternoon")) {
            if (temp>=10 && temp<=18){
                outfit="Shirt";
                shoes="Moccasins";
            } else if (temp>18 && temp<=24) {
                outfit="T-Shirt";
                shoes="Sandals";
            }else {
                outfit="Swim Suit";
                shoes="Barefoot";
            }
        } else if (daytime.equals("Evening")) {
            if (temp>=10 && temp<=18){
                outfit="Shirt";
                shoes="Moccasins";
            } else if (temp>18 && temp<=24) {
                outfit="Shirt";
                shoes="Moccasins";
            }else {
                outfit="Shirt";
                shoes="Moccasins";
            }
        }
        System.out.printf("It's %d degrees, get your %s and %s.",temp,outfit,shoes);
    }
}
