package nttdata.javat3;

import nttdata.javat3.business.Person;

public class T3MainVCA {

	public static void main(String[] args) {
		Person person01 = new Person(123456, "Juan", 12, 12, 2003);
		person01.showDetails();
	}
}
