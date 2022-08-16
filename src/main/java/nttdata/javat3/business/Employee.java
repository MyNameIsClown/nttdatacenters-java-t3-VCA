package nttdata.javat3.business;

/**
 * Clase que se encarga de almacenar la informacion de un empleado
 * 
 * @author Victor Carrasco
 *
 */
public class Employee extends Person {
	/** Categoria del trabajador */
	private String categoria;
	/** Proyecto en el que esta designado el empleado */
	private String proyecto;

	/** Categoria Getter */
	public String getCategoria() {
		return categoria;
	}

	/** Categoria Setter */
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	/** Proyecto Getter */
	public String getProyecto() {
		return proyecto;
	}

	/** Proyecto Setter */
	public void setProyecto(String proyecto) {
		this.proyecto = proyecto;
	}

	/** Constructor de empleado, herendando info de Person */
	public Employee(Integer dni, String nombreCompleto, int day, int month, int year, String categoria,
			String proyecto) {
		super(dni, nombreCompleto, day, month, year);
		this.categoria = categoria;
		this.proyecto = proyecto;
	}

	/**
	 * ShowDetails incluyendo categoria y proyecto
	 */
	@Override
	public void showDetails() {
		super.showDetails();
		System.out.println("Categoria: " + this.categoria + "\nProyecto: " + this.proyecto);
	}

}
