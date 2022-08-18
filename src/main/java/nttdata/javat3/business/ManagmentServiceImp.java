package nttdata.javat3.business;

import java.util.Map;
import java.util.TreeMap;

/**
 * Clase que implementa los metodos para la gestion de usuarios
 * 
 * @author okami
 *
 */
public class ManagmentServiceImp implements ManagmentServicel {
	/** Simulacion de base de datos donde se almacenan los datos de los usuarios */
	protected static Map<Integer, Person> dbUser = new TreeMap<>();
	

	/**
	 * Implementacion del metodo registerUser de la interfaz ManagmentServicel
	 * @param person
	 */
	public static void registerUser(Person person) {
		dbUser.put(person.dni, person);
	}

	/**
	 * Implementacion del metodo listUsers de la interfaz ManagmentServicel
	 * @return
	 */
	public static String listUsers() {
		String personValuesToText = "USERS\n------------";
		for(Person value: dbUser.values()){
		    personValuesToText = personValuesToText.concat(value.showDetails());
		}
		return personValuesToText;
	}

}
