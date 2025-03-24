import java.util.Scanner;

public class House {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        String flower= scanner.nextLine();
        int num=Integer.parseInt(scanner.nextLine());
        int budget=Integer.parseInt(scanner.nextLine());
        double total=0.0;
        double rest=0.0;
        double price;

        if (flower.equals("Roses")){
            if (num>80)
                total=num*5*0.9;
            else
                total=num*5;
        } else if (flower.equals("Dahlias")) {
            if (num>90)
                total=num*3.8*0.85;
            else
                total=num*3.8;
        } else if (flower.equals("Tulips")) {
            if (num>80)
                total=num*2.8*0.85;
            else
                total=num*2.8;
        } else if (flower.equals("Narcissus")) {
            if (num<=120) {
                price = 3 * 1.15;
                total = num * price;
            }
            else
                total=num*3;
        } else if (flower.equals("Gladiolus")) {
            if (num<=80) {
                price = 2.5 * 1.2;
                total = num * price;
            }
            else
                total=num*2.5;
        }
        if (budget>=total) {
            rest = budget - total;
            System.out.printf("Hey, you have a great garden with %d %s and %.2f USD left.", num, flower, rest);
        }else {
            rest= total-budget;
            System.out.printf("Not enough money, you need %.2f USD more.",rest);
        }
    }
}
