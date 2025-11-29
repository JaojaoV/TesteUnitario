package Principal;

import java.util.Scanner;

public class BacteriaPrincipal {

    public static String verificarResistencia(String D, String S) {
        if (D.contains(S)) {
            return "Resistente";
        } else {
            return "Nao resistente";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()) {
            String D = scanner.nextLine();
            String S = scanner.nextLine();

            String resultado = verificarResistencia(D, S);
            System.out.println(resultado);
        }

        scanner.close();
    }
}
