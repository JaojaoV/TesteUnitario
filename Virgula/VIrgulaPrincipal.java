import java.util.Scanner;

public class VIrgulaPrincipal {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (s.hasNextLine()) {
            String f = s.nextLine();
            int i = f.indexOf(',');

            String p1 = f.substring(0, i).trim();
            String p2 = f.substring(i + 1).trim();

            System.out.println(p1);
            System.out.println(p2);
        }
        s.close();
    }
}
