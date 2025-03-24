import java.util.Scanner;

public class Time {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int hour=Integer.parseInt(scanner.nextLine());
        int min=Integer.parseInt(scanner.nextLine());

        int ukupno=hour*60+min;
        ukupno+=15;

        hour=ukupno/60;
        min=ukupno%60;
        if (hour>=24)
            hour=0;

        System.out.printf("%d:%02d",hour,min);
    }
}
