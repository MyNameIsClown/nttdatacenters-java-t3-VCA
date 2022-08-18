package nttdata.javat3.business;

/**
 * Clase que almacena la informacion de un estudiante
 * 
 * @author Victor Carrasco
 *
 */
public class Student extends Person {
	/**
	 * Enum para guardar la modalidad de los alumnos
	 * 
	 * @author Victor Carrasco
	 *
	 */
	public enum Modality {
		DAM, DAW
	};

	
	/** Nombre del Centro Educativo */
	private String school;
	/** Modalidad del alumno */
	private Modality modality;

	
	/**
	 * school getter
	 * @return
	 */
	public String getSchool() {
		return school;
	}

	/**
	 * school setter
	 * @param school
	 */
	public void setSchool(String school) {
		this.school = school;
	}

	/**
	 * modality getter
	 * @return
	 */
	public Modality getModality() {
		return modality;
	}

	/**
	 * modalilty setter
	 * @param modality
	 */
	public void setModality(Modality modality) {
		this.modality = modality;
	}

	/**
	 * Constructor
	 * @param dni
	 * @param name
	 * @param day
	 * @param month
	 * @param year
	 * @param school
	 * @param modality
	 */
	public Student(Integer dni, String name, int day, int month, int year, String school, Modality modality) {
		super(dni, name, day, month, year);
		this.school = school;
		this.modality = modality;
	}

	/**
	 * ShowDetails incluyendo categoria y proyecto
	 */
	@Override
	public String showDetails() {
		String details = " \nINFORMACION";
		//uso la funcion concat porque es mas rapida a la hora de concatenar texto que + o un StringBuilder
		details = details.concat("\n\tdni: ").concat(this.dni.toString()).concat("\n\tname: ").concat(name).concat("\n\tbirth date: ")
				.concat(this.birthDate.toString()).concat("\n\tschool: ").concat(this.school).concat("\n\tmodality: ")
				.concat(this.modality.toString());
		return details;
	}
}
