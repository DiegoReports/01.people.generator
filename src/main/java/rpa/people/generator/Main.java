package rpa.people.generator;

import java.util.ArrayList;
import java.util.List;

import rpa.people.generator.model.Person;

public class Main {
	public static void main(String[] args) {
		Person person = new Person();
		person.setFullName("Diego");
		person.setEmail("Diego@admin.com");
		
		Person person2 = new Person();
		person2.setFullName("Gustavo");
		person2.setEmail("Gustavo@admin.com");
		
		List<Person> personList = new ArrayList<Person>();
		personList.add(person);
		personList.add(person2);
		
		for(Person currentPerson: personList) {
			System.out.println(currentPerson.toString());
		}
	}
}
