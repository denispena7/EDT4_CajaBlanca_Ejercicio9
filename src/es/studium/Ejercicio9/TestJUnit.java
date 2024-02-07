package es.studium.Ejercicio9;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestJUnit {

	@Test
	void camino1() 
	{
		String resultadoReal = CajaBlanca.diasDeLaSemana(1);
		String resultadoEsperado = "Hoy es lunes";
		assertEquals(resultadoReal, resultadoEsperado);
	}
	
	@Test
	void camino2() 
	{
		String resultadoReal = CajaBlanca.diasDeLaSemana(2);
		String resultadoEsperado = "Hoy es martes";
		assertEquals(resultadoReal, resultadoEsperado);
	}
	
	@Test
	void camino3() 
	{
		String resultadoReal = CajaBlanca.diasDeLaSemana(3);
		String resultadoEsperado = "Hoy es miércoles";
		assertEquals(resultadoReal, resultadoEsperado);
	}
	
	@Test
	void camino4() 
	{
		String resultadoReal = CajaBlanca.diasDeLaSemana(4);
		String resultadoEsperado = "Hoy es jueves";
		assertEquals(resultadoReal, resultadoEsperado);
	}
	
	@Test
	void camino5() 
	{
		String resultadoReal = CajaBlanca.diasDeLaSemana(5);
		String resultadoEsperado = "Hoy es viernes";
		assertEquals(resultadoReal, resultadoEsperado);
	}
	
	@Test
	void camino6() 
	{
		String resultadoReal = CajaBlanca.diasDeLaSemana(6);
		String resultadoEsperado = "Hoy es sábado";
		assertEquals(resultadoReal, resultadoEsperado);
	}
	
	@Test
	void camino7() 
	{
		String resultadoReal = CajaBlanca.diasDeLaSemana(7);
		String resultadoEsperado = "Hoy es domingo";
		assertEquals(resultadoReal, resultadoEsperado);
	}
	
	@Test
	void camino8() 
	{
		String resultadoReal = CajaBlanca.diasDeLaSemana(8);
		String resultadoEsperado = "No es un día válido";
		assertEquals(resultadoReal, resultadoEsperado);
	}
}