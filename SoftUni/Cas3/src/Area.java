import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double area=0.0;
        String name= scanner.nextLine();
        if (name.equals("square")){
            double length=Double.parseDouble(scanner.nextLine());
            area=length*length;
            System.out.printf("%.3f",area);
        } else if (name.equals("rectangle")) {
            double length1=Double.parseDouble(scanner.nextLine());
            double length2=Double.parseDouble(scanner.nextLine());
            area=length1*length2;
            System.out.printf("%.3f",area);
        }
        else if (name.equals("circle")) {
            double rad=Double.parseDouble(scanner.nextLine());
            area=Math.PI*rad*rad;
            System.out.printf("%.3f",area);
        } else if (name.equals("triangle")) {
            double a=Double.parseDouble(scanner.nextLine());
            double h=Double.parseDouble(scanner.nextLine());
            area=a*h/2;
            System.out.printf("%.3f",area);

        }
    }
}
