
package cinesElorrietaTest.modeloTest;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import cinesElorrieta.bbdd.Pelicula;

public class PeliculaTest {
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
	public void testSetNombre() {
		Pelicula peli = new Pelicula();
		String Nombre = null;
		peli.setNombre(Nombre);
		assertNull("Incorrecto, esta vacio el nombre");
	}
	
	public void testSetNombre2() {
		Pelicula peli = new Pelicula();
		String Nombre = "pepe";
		peli.setNombre(Nombre);
		assertNull("El nombre es:" + Nombre);
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
		Pelicula peli = new Pelicula();
		int duracion = peli.getDuracion();
		assertNotNull(duracion);
	}
	
	@Test
	public void testGetDuracion2() {
		Pelicula peli = new Pelicula();
		int duracion = peli.getDuracion();
		duracion = 0;
		assertNull("Incorrecta, esa pelicula no tiene duracion");
	}

	@Test
	public void testSetDuracion() {
		Pelicula peli = new Pelicula();
		int duracion = 0;
		peli.setDuracion(duracion);
		assertNull("Incorrecto, esta vacio la duracion");
	}
	
	@Test
	public void testSetDuracion2() {
		Pelicula peli = new Pelicula();
		int duracion = 6;
		peli.setDuracion(duracion);
		assertNull("La pelicula dura" + duracion + "horas");
	}

	@Test
	public void testEqualsObject() {
		Pelicula peli = new Pelicula();

	}

	@Test
	public void testToString() {
		Pelicula peli = new Pelicula();
		String datos = null;
		Assert.assertNull(datos, peli.toString());
	}
	
	public void testToString2() {
		Pelicula peli = new Pelicula();
		String datos = "nombre,genero,duracion,fecha,hora";
		Assert.assertNotNull(datos, peli.toString());
	}


}