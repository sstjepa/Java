import java.util.Scanner;

public class Break {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String serija= scanner.nextLine();
        int ep=Integer.parseInt(scanner.nextLine());
        int brk=Integer.parseInt(scanner.nextLine());

        double timelunch=(double) brk*1/8;
        double timebreak=(double) brk*1/4;
        double total=brk-timebreak-timelunch;



        if (total-ep>=0){
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.",serija,Math.ceil(total-ep));
        }else {
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.",serija,Math.ceil(ep-total));
        }

    }
}
