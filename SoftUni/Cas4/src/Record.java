import java.util.Scanner;

public class Record {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        double rec=Double.parseDouble(scanner.nextLine());
        double m=Double.parseDouble(scanner.nextLine());
        double ms=Double.parseDouble(scanner.nextLine());

        double swimsec=m*ms;
        double late=Math.floor(m/15);
        swimsec+=late*12.5;

        if (swimsec>=rec){
            System.out.printf("No, he failed! He was %.2f seconds slower.",swimsec-rec);
        }else {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.",swimsec);
        }

    }
}
