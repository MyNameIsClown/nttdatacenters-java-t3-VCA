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

	/**
	 * category getter
	 * @return
	 */
	public String getCategory() {
		return category;
	}

	/**
	 * category setter
	 * @param category
	 */
	public void setCategory(String category) {
		this.category = category;
	}

	/**
	 * project getter
	 * @return
	 */
	public String getProject() {
		return project;
	}

	/**
	 * project setter
	 * @param project
	 */
	public void setProject(String project) {
		this.project = project;
	}

	/**
	 * Constructor
	 * @param dni
	 * @param name
	 * @param day
	 * @param month
	 * @param year
	 * @param category
	 * @param project
	 */
	public Employee(Integer dni, String name, int day, int month, int year, String category, String project) {
		super(dni, name, day, month, year);
		this.category = category;
		this.project = project;
	}

	/**
	 * ShowDetails incluyendo categoria y proyecto
	 */
	public String showDetails() {
		String details = "\nINFORMACION";
		details = details.concat("\n\tdni: ").concat(this.dni.toString()).concat("\n\tname: ").concat(name).concat("\n\tbirth date: ")
				.concat(this.birthDate.toString()).concat("\n\tcategory: ").concat(this.category).concat("\n\tproject: ")
				.concat(this.project);
		return details;
	}

}
