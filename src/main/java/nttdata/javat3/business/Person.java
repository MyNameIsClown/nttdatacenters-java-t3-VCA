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
	private String nombreCompleto;
	/** fecha de nacimiento */
	private LocalDate fechaNacimiento;

	/** DNI Getter */
	public Integer getDni() {
		return dni;
	}

	/** DNI Setter */
	public void setDni(Integer dNI) {
		dni = dNI;
	}

	/** Nombre Completo Getter */
	public String getNombreCompleto() {
		return nombreCompleto;
	}

	/** Nombre Completo Setter */
	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}

	/** Fecha Nacimiento Getter */
	public String getFechaNacimiento() {
		return this.fechaNacimiento.toString();
	}

	/** Fecha Nacimiento Setter */
	public void setFechaNacimiento(int day, int month, int year) {
		this.fechaNacimiento = new LocalDate(year, month, day);
	}

	/** Fecha Nacimiento Setter */
	public void setFechaNacimiento(LocalDate localDate) {
		this.fechaNacimiento = localDate;
	}

	/** Contructor */
	public Person(Integer dni, String nombreCompleto, int day, int month, int year) {
		super();
		this.dni = dni;
		this.nombreCompleto = nombreCompleto;
		this.fechaNacimiento = new LocalDate(year, month, day);
	}

	/** Metodo que muestra los datos de la persona */
	public void showDetails() {
		System.out.println("Nombre: " + this.getNombreCompleto() + "\nDNI: " + this.getDni() + "\nFechaNacimiento: "
				+ this.getFechaNacimiento());
	}

}
