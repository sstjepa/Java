import java.util.Scanner;

public class Shop {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        String product= scanner.nextLine();
        String city= scanner.nextLine();
        float times=Float.parseFloat(scanner.nextLine());

        switch (city) {
            case "London":
                switch (product){
                    case "coffee":
                        System.out.println(times*0.5);
                        break;
                    case "water":
                        System.out.println(times*0.8);
                        break;
                    case "beer":
                        System.out.println(times*1.20);
                        break;
                    case "sweets":
                        System.out.println(times*1.45);
                        break;
                    case "peanuts":
                        System.out.println(times*1.6);
                        break;
                }
                break;

            case "Rome":
                switch (product){
                    case "coffee":
                        System.out.println(times*0.4);
                        break;
                    case "water":
                        System.out.println(times*0.7);
                        break;
                    case "beer":
                        System.out.println(times*1.15);
                        break;
                    case "sweets":
                        System.out.println(times*1.3);
                        break;
                    case "peanuts":
                        System.out.println(times*1.5);
                        break;
                }
                break;
            case "Paris":
                switch (product){
                    case "coffee":
                        System.out.println(times*0.45);
                        break;
                    case "water":
                        System.out.println(times*0.7);
                        break;
                    case "beer":
                        System.out.println(times*1.1);
                        break;
                    case "sweets":
                        System.out.println(times*1.35);
                        break;
                    case "peanuts":
                        System.out.println(times*1.55);
                        break;
                }
                break;

        }

    }
}
