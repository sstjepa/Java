import java.util.Scanner;

public class FruitShop {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String fruit= scanner.nextLine();
        String day= scanner.nextLine();
        double kolicina=Double.parseDouble(scanner.nextLine());
        double fin;

        switch (day){
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
                switch (fruit){
                    case "banana":
                        fin=kolicina*2.5;
                        System.out.printf("%.2f",fin);
                        break;
                    case "apple":
                        fin=kolicina*1.2;
                        System.out.printf("%.2f",fin);
                        break;
                    case "orange":
                        fin=kolicina*0.85;
                        System.out.printf("%.2f",fin);
                        break;
                    case "grapefruit":
                        fin=kolicina*1.45;
                        System.out.printf("%.2f",fin);
                        break;
                    case "kiwi":
                        fin=kolicina*2.7;
                        System.out.printf("%.2f",fin);
                        break;
                    case "pineapple":
                        fin=kolicina*5.5;
                        System.out.printf("%.2f",fin);
                        break;
                    case "grapes":
                        fin=kolicina*3.85;
                        System.out.printf("%.2f",fin);
                        break;
                    default:
                        System.out.println("error");
                        break;
                }
                break;

            case "Saturday":
            case "Sunday":
                switch (fruit){
                    case "banana":
                        fin=kolicina*2.7;
                        System.out.printf("%.2f",fin);
                        break;
                    case "apple":
                        fin=kolicina*1.25;
                        System.out.printf("%.2f",fin);
                        break;
                    case "orange":
                        fin=kolicina*0.9;
                        System.out.printf("%.2f",fin);
                        break;
                    case "grapefruit":
                        fin=kolicina*1.6;
                        System.out.printf("%.2f",fin);
                        break;
                    case "kiwi":
                        fin=kolicina*3.0;
                        System.out.printf("%.2f",fin);
                        break;
                    case "pineapple":
                        fin=kolicina*5.6;
                        System.out.printf("%.2f",fin);
                        break;
                    case "grapes":
                        fin=kolicina*4.2;
                        System.out.printf("%.2f",fin);
                        break;
                    default:
                        System.out.println("error");
                        break;
                }
                break;
            default:
                System.out.println("error");
                break;
        }

    }
}
