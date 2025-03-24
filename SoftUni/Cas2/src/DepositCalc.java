import java.util.Scanner;

public class DepositCalc {
    public static void main(String[] args) {
       /* Deposit amount – a floating-point number in the interval [100.00 … 10000.00]
        Term of the deposit (in months) – an integer in the interval [1…12]
        Annual interest rate – a floating-point number in the interval [0.00 …100.00]*/

        Scanner scanner = new Scanner(System.in);
        double dep = Double.parseDouble(scanner.nextLine());
        int term = Integer.parseInt(scanner.nextLine());
        double interest = Double.parseDouble(scanner.nextLine());

        double out=dep+ term*((dep*interest/100)/12);
        System.out.println(out);
    }
}
