package cinesElorrietaTest.modeloTest;

import static org.junit.Assert.*;

import org.junit.Test;

import cinesElorrieta.modelo.Pelicula;

public class PeliculaTest {

	@Test
	public void testHashCode() {
		fail("Not yet implemented");
	}

	@Test
	public void testPelicula() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetNombre() {
		Pelicula peli = new Pelicula();
		String nombre = peli.getNombre();
		nombre = null;
		assertNull("Incorrecto, esta vacio el nombre");
		
	}
	
	public void testGetNombre2() {
		Pelicula peli = new Pelicula();
		String nombre = peli.getNombre();
		assertNotNull(nombre);
		
	}

	@Test
	public void testSetNombre(String nombre) {
		Pelicula peli = new Pelicula();
		String Nombre = null;
		peli.setNombre(Nombre);
		assertNull("Incorrecto, esta vacio el nombre");
	}

	@Test
	public void testGetGenero() {
		Pelicula peli = new Pelicula();
		String genero = peli.getGenero();
		genero = null;
		assertNull("Incorrecto, esta vacio el genero");
	}
	
	public void testGetGenero2() {
		Pelicula peli = new Pelicula();
		String genero = peli.getGenero();
		assertNotNull(genero);
		
	}

	@Test
	public void testSetGenero() {
		Pelicula peli = new Pelicula();
		String genero = peli.getGenero();
		if (genero != null) {
			assertNotNull("Correcto" + genero);
		}else {
			assertNull("Incorrecto, esta vacio el nombre");
		}
	}

	@Test
	public void testGetDuracion() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetDuracion() {
		Pelicula peli = new Pelicula();
		int Duracion = 0;
		peli.setDuracion(Duracion);
		assertNull("Incorrecto, esta vacio la duracion");
	}

	@Test
	public void testGetFecha() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetFecha() {
		Pelicula peli = new Pelicula();
		String Fecha = null;
		peli.setFecha(Fecha);
		assertNull("Incorrecto, esta vacia la fecha");
	}

	@Test
	public void testGetHora() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetHora() {
		Pelicula peli = new Pelicula();
		String Hora = null;
		peli.setHora(Hora);
		assertNull("Incorrecto, esta vacia la hora");
	}

	@Test
	public void testGetSerialversionuid() {
		fail("Not yet implemented");
	}

	@Test
	public void testEqualsObject() {
		fail("Not yet implemented");
	}

	@Test
	public void testToString() {
		fail("Not yet implemented");
	}

	@Test
	public void testObject() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetClass() {
		fail("Not yet implemented");
	}

	@Test
	public void testEqualsObject1() {
		fail("Not yet implemented");
	}

	@Test
	public void testClone() {
		fail("Not yet implemented");
	}

	@Test
	public void testToString1() {
		fail("Not yet implemented");
	}

	@Test
	public void testNotify() {
		fail("Not yet implemented");
	}

	@Test
	public void testNotifyAll() {
		fail("Not yet implemented");
	}

	@Test
	public void testWait() {
		fail("Not yet implemented");
	}

	@Test
	public void testWaitLong() {
		fail("Not yet implemented");
	}

	@Test
	public void testWaitLongInt() {
		fail("Not yet implemented");
	}

	@Test
	public void testFinalize() {
		fail("Not yet implemented");
	}

}
