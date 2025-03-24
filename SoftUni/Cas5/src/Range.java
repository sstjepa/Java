import java.util.Scanner;

public class Range {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double broj=Double.parseDouble(scanner.nextLine());

        if (broj>=-100 && broj<=100 && broj!=0)
            System.out.println("Yes");
        else
            System.out.println("No");

    }
}
