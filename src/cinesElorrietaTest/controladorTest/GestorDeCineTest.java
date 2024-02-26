package cinesElorrietaTest.controladorTest;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import cinesElorrieta.bbdd.Pelicula;
import cinesElorrieta.bbdd.Sesion;
import cinesElorrieta.logica.GestorDeCine;
import cinesElorrieta.logica.GestorDePeliculas;
import cinesElorrieta.logica.GestorDeSesion;

public class GestorDeCineTest {

	@Test
	public void testGetNameOfCines() {
		String radomString = null;
		ArrayList<String> cine = null;
		GestorDeCine gestorDeCine = new GestorDeCine();
		cine = (ArrayList<String>) gestorDeCine.getNameOfCines();
		for (int i = 0; i < cine.size(); i++) {
			// (testCinema, cinemas.get(i));
			assertNotSame(cine.get(i), radomString);
		}
	}

	@Test
	public void testObtenerElPrecioPelis() {
		int cine = 0;
		List<Pelicula> pelis = null;
		GestorDePeliculas gestorDePeliculas = new GestorDePeliculas();
		pelis = gestorDePeliculas.getLasPeliculas(cine);
		for (int i = 0; i < pelis.size(); i++) {
			assertNotEquals(pelis.get(i).getPrecio(), 0);
		}
	}


	@Test
	public void getFechaDeSesionPeli() {
		int codPeli = 0;
		List<Sesion> sesion = null;
		GestorDeSesion gestorDeSesion = new GestorDeSesion();
		sesion =gestorDeSesion.seleccionarPeliculaParaSesion(codPeli);
		for (int i = 0; i < sesion.size(); i++) {
			assertNotNull(sesion.get(i).getFecha());
		}
	}

	@Test
	public void testGetMovieFromCinema() {
		int codCine = 1;
		List<Pelicula> peli = null;
		GestorDePeliculas gestorDePeliculas = new GestorDePeliculas();
		peli = gestorDePeliculas.getLasPeliculas(codCine);
		assertNotNull(peli);
	}
}
