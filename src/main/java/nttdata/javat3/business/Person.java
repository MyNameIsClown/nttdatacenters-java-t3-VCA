package nttdata.javat3.business;

/**
 * Clase encargada del almacenamiento de la informacion de una persona
 * @author Victor Carrasco
 *
 */
public class Person {
	/** numero unico encargado de identificar a una persona*/
	public Integer DNI;
	/** nombre completo de la persona*/
	public String nombreCompleto;
	/** Array fecha de nacimiento (day/month/year)*/
	public Integer fechaNacimiento[];
	
	/** DNI Getter*/
	public Integer getDNI() {
		return DNI;
	}

	/** DNI Setter*/
	public void setDNI(Integer dNI) {
		DNI = dNI;
	}

	/** Nombre Completo Getter*/
	public String getNombreCompleto() {
		return nombreCompleto;
	}

	/** Nombre Completo Setter*/
	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}

	/** Fecha Nacimiento Getter*/
	public String getFechaNacimiento() {
		return this.fechaNacimiento[0]+"/"+this.fechaNacimiento[1]+"/"+this.fechaNacimiento[2];
	}

	/** Fecha Nacimiento Setter*/
	public void setFechaNacimiento(int day, int month, int year) {
		Integer fechaTemporal[] = null;
		if((day>=1&&day<=31)&&(month>=1&&month<=12)&&(year<2023)) {
			fechaTemporal = new Integer[] {day, month, year};
			this.fechaNacimiento = fechaTemporal;
			System.out.println("fecha Introducida con exito");
		}else {
			System.out.println("Incorrect Date");
		}
	}


	/**Contructor*/
	public Person(Integer dni, String nombreCompleto, int day, int month, int year) {
		super();
		this.DNI = dni;
		this.nombreCompleto = nombreCompleto;
		setFechaNacimiento(day, month, year);
	}
	
	/**Metodo que muestra los datos de la persona*/
	public void showDetails() {
		System.out.println("Nombre: " + this.getNombreCompleto() + "\nDNI: " 
				+ this.getDNI() + "\nFechaNacimiento: " + this.getFechaNacimiento());
	}
	
}
