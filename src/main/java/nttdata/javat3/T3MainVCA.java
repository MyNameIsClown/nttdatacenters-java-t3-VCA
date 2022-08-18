package nttdata.javat3;

import nttdata.javat3.business.Employee;
import nttdata.javat3.business.ManagmentServiceImp;
import nttdata.javat3.business.Person;
import nttdata.javat3.business.Student;
import nttdata.javat3.business.Student.Modality;
/**
 * Clase main donde se ejecuta la aplicacion
 * @author Victor Carrasco
 *
 */
public class T3MainVCA {
	/**
	 * Main
	 * @param args
	 */
	public static void main(String[] args) {
		Person e1 = new Employee(12345, "Luis", 12, 4, 2004, "Desarrollador", "Naturgy");
		Person e2 = new Employee(234234, "Miguel", 22, 8, 2002, "Marketing", "Naturgy");
		Person s1 = new Student(0123134, "Juan", 15, 1, 1999, "UPO", Modality.DAM);
		ManagmentServiceImp.registerUser(e1);
		ManagmentServiceImp.registerUser(e2);
		ManagmentServiceImp.registerUser(s1);
		System.out.println(ManagmentServiceImp.listUsers());
	}
}
