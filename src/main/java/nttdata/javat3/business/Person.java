package nttdata.javat3.business;

import org.joda.time.LocalDate;

/**
 * Clase encargada del almacenamiento de la informacion de una persona
 * 
 * @author Victor Carrasco
 *
 */
public class Person {
	/** numero unico encargado de identificar a una persona */
	private Integer dni;
	/** nombre completo de la persona */
	private String name;
	/** fecha de nacimiento */
	private LocalDate birthDate;

	/** DNI Getter */
	public Integer getDni() {
		return dni;
	}

	/** DNI Setter */
	public void setDni(Integer dni) {
		this.dni = dni;
	}

	/** Name Getter */
	public String getName() {
		return name;
	}

	/** Name Setter */
	public void setName(String name) {
		this.name = name;
	}

	/** Birth Date Getter */
	public String getBirthDate() {
		return this.birthDate.toString();
	}

	/** Birth Date Setter */
	public void setBirthDate(int day, int month, int year) {
		this.birthDate = new LocalDate(year, month, day);
	}

	/** Birth Date Setter */
	public void setBirthDate(LocalDate localDate) {
		this.birthDate = localDate;
	}

	/** Contructor */
	public Person(Integer dni, String name, int day, int month, int year) {
		super();
		this.dni = dni;
		this.name = name;
		this.birthDate = new LocalDate(year, month, day);
	}

	/** Metodo que muestra los datos de la persona */
	public void showDetails() {
		System.out.println(
				"Nombre: " + this.getName() + "\nDNI: " + this.getDni() + "\nFechaNacimiento: " + this.getBirthDate());
	}

}
