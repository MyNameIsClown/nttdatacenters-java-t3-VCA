package nttdata.javat3.business;

/**
 * Clase que almacena la informacion de un estudiante
 * @author Victor Carrasco
 *
 */
public class Student extends Person{
	/**
	 * Enum para guardar la modalidad de los alumnos
	 * @author okami
	 *
	 */
	enum Modalidad {DAM, DAW};
	/** Nombre del Centro Educativo*/
	private String centroEducativo;
	/** Modalidad del alumno*/
	private Modalidad modalidad;
	
	/** Centro Educativo Getter*/
	public String getCentroEducativo() {
		return centroEducativo;
	}

	/** Centro Educativo Setter*/
	public void setCentroEducativo(String centroEducativo) {
		this.centroEducativo = centroEducativo;
	}

	/** Modalidad Getter*/
	public Modalidad getModalidad() {
		return modalidad;
	}

	/** Modalidad Setter*/
	public void setModalidad(Modalidad modalidad) {
		this.modalidad = modalidad;
	}

	/** Constructor*/
	public Student(Integer dni, String nombreCompleto, int day, int month, int year, String centroEducativo,
			Modalidad modalidad) {
		super(dni, nombreCompleto, day, month, year);
		this.centroEducativo = centroEducativo;
		this.modalidad = modalidad;
	}
	
	/**
	 * ShowDetails incluyendo categoria y proyecto
	 */
	@Override
	public void showDetails() {
		super.showDetails();
		System.out.println("Categoria: " + this.centroEducativo + "\nProyecto: " + this.modalidad);
	}
}
