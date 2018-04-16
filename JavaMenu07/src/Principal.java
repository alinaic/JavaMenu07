import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner miScanner = new Scanner(System.in);
		// lo siguiente es un objeto que guarda
		// objeto de la clase libro
		ArrayList<Libro> listDeLibros = new ArrayList<Libro>();

		int intWhile = 0;
		while (intWhile != -1) {
			System.out.println("despues es distinto de -1");
			System.out.println("inserta una opcion");
			System.out.println("1- Introducir libro");
			System.out.println("2- Listar libro");
			System.out.println("3- Salir");
			String introducido = miScanner.nextLine();

			// la aplicacion se para hasta que el usuario introduzca enter

			System.out.println("Has introducido: " + introducido);
			int introducidoInt = Integer.parseInt(introducido);
			switch (introducidoInt) {
			case 1:
				System.out.println("Introduce los datos del libro: ");
				Libro nuevo = new Libro();
				System.out.println("Introduce el titulo");
				introducido = miScanner.nextLine();
				nuevo.titulo = introducido;

				System.out.println("Introduce las paginas: ");
				introducido = miScanner.nextLine();
				nuevo.paginas = Integer.parseInt(introducido);

				System.out.println("Introduce el precio: ");
				introducido = miScanner.nextLine();
				nuevo.precio = Double.parseDouble(introducido);

				// y agregamos el libro a la lista

				listDeLibros.add(nuevo);
				System.out.println("Libro registrado correctamente");

				// el codigo para registrar un libro

				break;
			case 2:
				System.out.println("Listando libros");

				// codigo para listar libros
				// java soporta foreach para arrays y colecciones
				System.out.println("**************");
				for (Libro elemento : listDeLibros) {
					elemento.mostrarDatos();

				}
				System.out.println("----------------");
				break;

			case 3:
				System.out.println("Hasta luego");
				intWhile = -1;
				break;

			default:
				System.out.println("Opcion no valida");
				break;

			}// end switch

		}// end while
		System.out.println("despues del while");
		miScanner.close();

	}// end main
}// end class
