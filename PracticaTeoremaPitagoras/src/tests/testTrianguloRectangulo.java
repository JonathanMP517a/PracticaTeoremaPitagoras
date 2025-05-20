package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import clases.TrianguloRectangulo;

class testTrianguloRectangulo {

	static TrianguloRectangulo tri1;

	@BeforeAll
	static void setup() {
		tri1 = new TrianguloRectangulo();
	}

	@Test
	void testArea() {

		double resultadoObtenido = tri1.area();
		double resultadoEsperado = 0.5;

		assertEquals(resultadoObtenido, resultadoEsperado);
	}

	@Test
	void testHipotenusa() {
		double resultadoObtenido = tri1.hipotenusa();
		double resultadoEsperado = 1.41;

		assertEquals(resultadoObtenido, resultadoEsperado, 0.01);
	}

	@Test
	void testPerimetro() {
		double resultadoObtenido = tri1.perimetro();
		double resultadoEsperado = 3.41;

		assertEquals(resultadoObtenido, resultadoEsperado, 0.01);
	}

	@Test
	void testArea2() {
		TrianguloRectangulo tri2 = new TrianguloRectangulo(2, 4);
		double resultadoObtenido = tri2.area();
		double resultadoEsperado = 4;

		assertEquals(resultadoObtenido, resultadoEsperado);
	}

	@Test
	void testHipotenusa2() {
		TrianguloRectangulo tri2 = new TrianguloRectangulo(2, 4);
		double resultadoObtenido = tri2.hipotenusa();
		double resultadoEsperado = 4.47;

		assertEquals(resultadoObtenido, resultadoEsperado, 0.01);
	}

	@Test
	void testPerimetro2() {
		TrianguloRectangulo tri2 = new TrianguloRectangulo(2, 4);
		double resultadoObtenido = tri2.perimetro();
		double resultadoEsperado = 10.47;

		assertEquals(resultadoObtenido, resultadoEsperado, 0.01);
	}

	@Test
	void testExcepcion() {
		Exception E = assertThrows(IllegalArgumentException.class, () -> new TrianguloRectangulo(-1, -3));
		String mensajeEsperado = "Los catetos no pueden obtener valores negativos";
		String mensajeObtenido = E.getMessage();
		assertEquals(mensajeObtenido, mensajeEsperado);
	}
}
