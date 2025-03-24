import java.util.Scanner;

public class Bonus {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double broj=Double.parseDouble(scanner.nextLine());
        double bonus=0.0;

        if (broj<=100){
            bonus=5;
        } else if (broj<1000) {
            bonus=broj*0.2;
        }
        else{
            bonus=broj*0.1;
        }
        if (broj%2==0){
            bonus+=1;
        } else if (broj%10==5) {
            bonus+=2;
        }

        System.out.println(bonus);
        System.out.println(broj+bonus);


    }
}
