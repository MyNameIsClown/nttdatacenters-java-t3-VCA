package nttdata.javat3.business;

/**
 * Clase que se encarga de almacenar la informacion de un empleado
 * 
 * @author Victor Carrasco
 *
 */
public class Employee extends Person {
	/** Categoria del trabajador */
	private String category;
	/** Proyecto en el que esta designado el empleado */
	private String project;

	/** Category Getter */
	public String getCategory() {
		return category;
	}

	/** Category Setter */
	public void setCategory(String category) {
		this.category = category;
	}

	/** Project Getter */
	public String getProject() {
		return project;
	}

	/** Project Setter */
	public void setProject(String project) {
		this.project = project;
	}

	/** Constructor de empleado, herendando info de Person */
	public Employee(Integer dni, String name, int day, int month, int year, String category, String project) {
		super(dni, name, day, month, year);
		this.category = category;
		this.project = project;
	}

	/**
	 * ShowDetails incluyendo categoria y proyecto
	 */
	@Override
	public void showDetails() {
		super.showDetails();
		System.out.println("Categoria: " + this.category + "\nProyecto: " + this.project);
	}

}
