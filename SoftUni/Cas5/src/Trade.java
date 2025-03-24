import java.util.Scanner;

public class Trade {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String city= scanner.nextLine();
        double volume=Double.parseDouble(scanner.nextLine());
        double fin;

        if (volume<0)
            System.out.println("error");
        else if (volume>=0 && volume<=500){
            if (city.equals("London")){
                fin=volume*0.05;
                System.out.printf("%.2f",fin);
            } else if (city.equals("Paris")) {
                fin=volume*0.045;
                System.out.printf("%.2f",fin);
            } else if (city.equals("Rome")) {
                fin=volume*0.055;
                System.out.printf("%.2f",fin);
            }else
                System.out.println("error");
        } else if (volume>500 && volume<=1000) {
            if (city.equals("London")){
                fin=volume*0.07;
                System.out.printf("%.2f",fin);
            } else if (city.equals("Paris")) {
                fin=volume*0.075;
                System.out.printf("%.2f",fin);
            } else if (city.equals("Rome")) {
                fin=volume*0.08;
                System.out.printf("%.2f",fin);
            }else
                System.out.println("error");
        } else if (volume>1000 && volume<=10000) {
            if (city.equals("London")){
                fin=volume*0.08;
                System.out.printf("%.2f",fin);
            } else if (city.equals("Paris")) {
                fin=volume*0.1;
                System.out.printf("%.2f",fin);
            } else if (city.equals("Rome")) {
                fin=volume*0.12;
                System.out.printf("%.2f",fin);
            }else
                System.out.println("error");
        } else if (volume>10000) {
            if (city.equals("London")){
                fin=volume*0.12;
                System.out.printf("%.2f",fin);
            } else if (city.equals("Paris")) {
                fin=volume*0.13;
                System.out.printf("%.2f",fin);
            } else if (city.equals("Rome")) {
                fin=volume*0.145;
                System.out.printf("%.2f",fin);
            }else
                System.out.println("error");
        }
    }
}
