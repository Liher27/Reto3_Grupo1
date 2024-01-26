package cinesElorrieta.controlador;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import cinesElorrieta.modelo.Pelicula;

/**
 * Clase que gestiona los alumno
 */
public class GestorDePeliculas {

	private static Scanner teclado = null;
	private List<Pelicula> peliculas = null;

	public GestorDePeliculas() {
		teclado = new Scanner(System.in);
		peliculas = new ArrayList<Pelicula>();
	}
}
