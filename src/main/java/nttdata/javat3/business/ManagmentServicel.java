package nttdata.javat3.business;

import java.util.Map;
import java.util.Scanner;

import nttdata.javat3.business.Student.Modality;

/**
 * Clase encargada de la gestion de usuarios
 * 
 * @author Victor Carrasco
 *
 */
public class ManagmentServicel {
	/** Mapa en el cual se grabara la informacion de los usuarios */
	private Map<String, Person> dbUsers;

	/** Metodo encargado de registrar al usuario */
	public void register() {
		char answer = 'N';
		String name;
		Integer dni;
		char type;
		String school;
		Modality modality;
		String project;
		String category;
		
		try (Scanner in = new Scanner(System.in)) {
			System.out.println("Bienvenido");
			do {
				System.out.println("¿Quieres introducir un usuario? S/N");
				answer = in.nextLine().charAt(0);
				if (answer == 'S') {
					System.out.println("Porfavor introduzca el nombre y el dni del usuario");
					System.out.print("Nombre: ");
					name = in.nextLine();
					System.out.print("\nDNI: ");
					dni = in.nextInt();
					do {
						System.out.println("¿El usuario se trata de un (E)mployee o de un (S)tudent?");
						System.out.println("--> ");
						type = in.nextLine().charAt(0);
						
					}while();
					
					
				} else if (answer == 'N') {
					System.out.println("Hasta luego");
				} else {
					System.out.println("No te he entendido");
					answer = 'S';
				}
			} while (answer == 'S');
		}
	}

	/** Metodo encargado de listar todos los usuarios registrados */
	public void list() {

	}
}
