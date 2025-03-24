import java.util.Scanner;

public class FishTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int len=Integer.parseInt(scanner.nextLine());
        int wid=Integer.parseInt(scanner.nextLine());
        int hig=Integer.parseInt(scanner.nextLine());
        double percent=Double.parseDouble(scanner.nextLine());

        double volume=(double) (len*hig*wid)/1000; //odmah u dm3

        System.out.println(volume*(1-(percent/100)));
    }
}
