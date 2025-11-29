package teste;
import Arvore.Principal;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Test;

public class Teste {

    @Test
    void testeArvoreComN5() throws Exception {
        String input = "5";
        InputStream originalIn = System.in;
        PrintStream originalOut = System.out;

        ByteArrayInputStream inSimulado = new ByteArrayInputStream(input.getBytes());
        ByteArrayOutputStream outCapturado = new ByteArrayOutputStream();

        try {
            System.setIn(inSimulado);
            System.setOut(new PrintStream(outCapturado));

            Principal.main(new String[]{});

        } finally {
            System.setIn(originalIn);
            System.setOut(originalOut);
        }

        String LS = System.lineSeparator();

        String esperado = "  *" + LS
            + " ***" + LS
            + "*****" + LS
            + "  *" + LS
            + " ***" + LS;


        assertEquals(esperado, outCapturado.toString());
    }
}
