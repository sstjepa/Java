import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String pass="s3cr3t!P@ssw0rd";
        String unos=scanner.nextLine();

        if (unos.equals(pass))
        {
            System.out.println("Welcome");
        }
        else {
            System.out.println("Wrong password!");
        }
    }
}
