import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num=Integer.parseInt(scanner.nextLine());
        if (num%2==0)
            System.out.println("Even");
        else
            System.out.println("Odd");
    }
}
