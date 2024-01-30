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

	public void menu() {

		int opcionMenu = 0;

		do {

			opcionMenu = escribirMenu();

			switch (opcionMenu) {
			case 0:
				System.out.println("Adios !!!");
				break;
			case 1:
				
				break;
			case 2:
				
				break;
			case 3:
				
				break;
			
			default:
				System.out.println("Esta opcion no deberia salir");
			}

		} while (opcionMenu != 0);
		teclado.close();
	}

	private void pintarMenu() {
		System.out.println(" ");
		System.out.println("- Menu Inicial -");
		System.out.println("----------------");
		System.out.println("1. Aniadir alumno");
		System.out.println("2. Mostrar todos alumnos");
		System.out.println("3. Mostrar alumno");
		System.out.println("0. Salir");
		System.out.println(" ");
	}

	private int escribirMenu() {
		int ret = 0;
		do {
			try {
				pintarMenu();
				System.out.print("Escoge una opcion: ");
				ret = teclado.nextInt();
				teclado.nextLine();
			} catch (Exception e) {
				System.out.println("Error!!! Opcion incorrecta");
				teclado.nextLine();
				ret = -1;
			}
		} while ((ret < 0) || (ret > 10));
		return ret;
	}

	
}
