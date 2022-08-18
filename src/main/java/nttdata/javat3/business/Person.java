package nttdata.javat3.business;

import org.joda.time.LocalDate;

/**
 * Clase encargada del almacenamiento de la informacion de una persona
 * 
 * @author Victor Carrasco
 *
 */
public abstract  class Person {
	
	/** numero unico encargado de identificar a una persona */
	protected Integer dni;
	/** nombre completo de la persona */
	protected String name;
	/** fecha de nacimiento */
	protected LocalDate birthDate;

	
	/**
	 * dni getter 
	 * @return
	 */
	public Integer getDni() {
		return dni;
	}

	/**
	 * dni setter
	 * @param dni
	 */
	public void setDni(Integer dni) {
		this.dni = dni;
	}

	/**
	 * name getter
	 * @return
	 */
	public String getName() {
		return name;
	}

	/**
	 * name setter
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Birth Date getter
	 * @return
	 */
	public String getBirthDate() {
		return this.birthDate.toString();
	}

	/**
	 * Birth Date Setter usando el dia, mes y año
	 * @param day
	 * @param month
	 * @param year
	 */
	public void setBirthDate(int day, int month, int year) {
		this.birthDate = new LocalDate(year, month, day);
	}

	/**
	 * Birth Date Setter recibiendo un objeto de tipo LocalDate
	 * @param localDate
	 */
	public void setBirthDate(LocalDate localDate) {
		this.birthDate = localDate;
	}

	/**
	 * Constructor
	 * @param dni
	 * @param name
	 * @param day
	 * @param month
	 * @param year
	 */
	protected Person(Integer dni, String name, int day, int month, int year) {
		super();
		this.dni = dni;
		this.name = name;
		this.birthDate = new LocalDate(year, month, day);
	}

	/**
	 * Metodo que muestra los datos de la persona
	 * @return
	 */
	public abstract String showDetails();

}
