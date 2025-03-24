import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        BufferedReader br = null;
        BufferedWriter bw = null;
        String fajl = null;
        Scanner sc = new Scanner(System.in);
        ArrayList<String> lines = new ArrayList<String>();

        while (sc.hasNextLine()) {
            fajl = sc.nextLine();

            if (fajl.equals("exit")) {
                System.out.println("Ugasen program");
                break;
            }
            else if (!fajl.endsWith(".txt")) {
                fajl += ".txt";
            }

            try
            {
                br = new BufferedReader(new FileReader(fajl));
                String currentLine = br.readLine();
                while (currentLine != null)
                {
                    lines.add(currentLine);
                    currentLine=br.readLine();
                }

                Collections.sort(lines);

                bw = new BufferedWriter(new FileWriter(fajl));

                for (String list : lines)
                {
                    bw.write(list);
                    bw.newLine();
                }
                bw.flush();
                lines.clear();
                System.out.println("Fajl je sortiran");
            }
            catch (IOException e) {
                throw new RuntimeException(e);
            }
            finally {
                try {
                    if (br != null) br.close();
                    if (bw != null) bw.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        }

    }
}
