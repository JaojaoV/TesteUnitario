package Teste;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import Principal.BacteriaPrincipal;


import Principal.BacteriaPrincipal;

public class BacteriaTeste {

    @Test
    public void testeExemplo1() {
        String resultado = BacteriaPrincipal.verificarResistencia("ACGTC", "CGT");
        assertEquals("Resistente", resultado);
    }

    @Test
    public void testeExemplo2() {
        String resultado = BacteriaPrincipal.verificarResistencia("CCCT", "AG");
        assertEquals("Nao resistente", resultado);
    }
}
