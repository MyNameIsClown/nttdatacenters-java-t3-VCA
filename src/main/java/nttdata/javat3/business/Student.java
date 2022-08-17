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
	enum Modality {
		DAM, DAW
	};

	/** Nombre del Centro Educativo */
	private String school;
	/** Modalidad del alumno */
	private Modality modality;

	/** School Getter */
	public String getSchool() {
		return school;
	}

	/** School Setter */
	public void setSchool(String school) {
		this.school = school;
	}

	/** Modality Getter */
	public Modality getModality() {
		return modality;
	}

	/** Modality Setter */
	public void setModality(Modality modality) {
		this.modality = modality;
	}

	/** Constructor */
	public Student(Integer dni, String name, int day, int month, int year, String school, Modality modality) {
		super(dni, name, day, month, year);
		this.school = school;
		this.modality = modality;
	}

	/**
	 * ShowDetails incluyendo categoria y proyecto
	 */
	@Override
	public void showDetails() {
		super.showDetails();
		System.out.println("Categoria: " + this.school + "\nProyecto: " + this.modality);
	}
}
