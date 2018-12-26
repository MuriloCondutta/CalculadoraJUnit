import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculadoraTest {

	@Test
	public void testSoma() {
		Calculadora calculadora = new Calculadora();
		assertEquals(7, calculadora.soma(3, 4));
	}

	@Test
	public void testSubtracao() {
		Calculadora calculadora = new Calculadora();
		assertEquals(0, calculadora.subtracao(3, 3));
	}

	@Test
	public void testDivisao() {
		Calculadora calculadora = new Calculadora();
		assertEquals(1, calculadora.divisao(6, 6));
	}

	@Test
	public void testMultiplicacao() {
		Calculadora calculadora = new Calculadora();
		assertEquals("A divisão deu certo :-)", 3, calculadora.multiplicacao(3, 1));
	}

}
