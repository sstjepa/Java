import java.util.Scanner;

public class Animal {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String animal= scanner.nextLine();
        switch (animal){
            case "crocodile":
            case "tortoise":
            case "snake":
                System.out.println("reptile");
                break;

            case "dog":
                System.out.println("mammal");
                break;
            default:
                System.out.println("unknown");
                break;

        }
    }
}
