import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FraseProcessorTest {

    private String[] separar(String frase) {
        int i = frase.indexOf(',');
        String p1 = frase.substring(0, i).trim();
        String p2 = frase.substring(i + 1).trim();
        return new String[]{p1, p2};
    }

    @Test
    void testeBasico() {
        String frase = "Parte A,Parte B";
        String[] esperado = {"Parte A", "Parte B"};
        assertArrayEquals(esperado, separar(frase));
    }


    @Test
    void testeTrim() {
        String frase = "  primeira , segunda  ";
        String[] esperado = {"primeira", "segunda"};
        assertArrayEquals(esperado, separar(frase));
    }
}
