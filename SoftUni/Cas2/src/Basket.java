import java.util.Scanner;

public class Basket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int fee= Integer.parseInt(scanner.nextLine());
        double sneakers, outfit,ball, accessor,total;
        sneakers=fee*0.6;
        outfit=sneakers*0.8;
        ball=outfit*0.25;
        accessor=ball*0.2;
        total=fee+sneakers+outfit+ball+accessor;

        System.out.println(total);



    }
}
