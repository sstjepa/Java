import java.util.Scanner;

public class SumSeconds {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int time1=Integer.parseInt(scanner.nextLine());
        int time2=Integer.parseInt(scanner.nextLine());
        int time3=Integer.parseInt(scanner.nextLine());
        int total=time1+time2+time3;

        int minutes=total/60;
        int sec=total%60;
        if (sec<10)
            System.out.printf("%d:0%d",minutes,sec);
        else
            System.out.printf("%d:%d",minutes,sec);

    }
}
