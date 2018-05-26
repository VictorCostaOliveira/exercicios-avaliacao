import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TesteExercicios {

    @Test
    public void testaSalarioCerto() {
        Exercicios exercicios = new Exercicios();
        float salario = exercicios.calculaAumentoSalario(2000, 25);
        float salarioCerto = 2500;
        assertEquals(salarioCerto, salario, 0x0);
    }

    @Test
    public void testaSalarioZerado() {
        Exercicios exercicios = new Exercicios();
        float salario = exercicios.calculaAumentoSalario(0, 25);
        float salarioCerto = 0;
        assertEquals(salarioCerto, salario, 0x0);
    }

    @Test
    public void testaSePalindromo() {
        Exercicios exercicios = new Exercicios();
        assertTrue(exercicios.vificaPalindromo("subinoonibus"));
    }

    @Test
    public void testaSeNaoPalindromo() {
        Exercicios exercicios = new Exercicios();
        assertFalse(exercicios.vificaPalindromo("escola"));
    }
}
