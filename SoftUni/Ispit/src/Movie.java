import java.util.Scanner;

public class Movie {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int shooting=Integer.parseInt(scanner.nextLine());
        int num=Integer.parseInt(scanner.nextLine());
        int duration=Integer.parseInt(scanner.nextLine());

        int prep= (int) (shooting*0.15);

        int req=prep+num*duration;

        if (req>shooting){
            System.out.printf("Time is up! To complete the movie you need %d minutes.",req-shooting);
        }else {
            System.out.printf("You managed to finish the movie on time! You have %d minutes left!",shooting-req);
        }

    }
}
