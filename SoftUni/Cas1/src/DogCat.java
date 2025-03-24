import java.util.Scanner;

public class DogCat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dog = Integer.parseInt(scanner.nextLine());
        int cat = Integer.parseInt(scanner.nextLine());
        float price=0;

        if (dog>0 && dog<=100)
            price+=dog*2.5;
        if (cat>0 && cat<=100)
            price+=cat*4;

        System.out.printf("%f USD",price);
    }
}
