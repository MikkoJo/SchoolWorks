package week7;

import java.util.ArrayList;
import java.util.Arrays;

public class PersonTable {

	private ArrayList<Person> persons;
	
	public PersonTable() {
		this.persons = new ArrayList<Person>();
	}
	
	public PersonTable(Person person) {
		this.persons = new ArrayList<Person>();
		this.persons.add(person);
	}

	public PersonTable(Person[] persons) {
		this.persons = new ArrayList<Person>();
		this.persons.addAll(Arrays.asList(persons));
	}
	
	public ArrayList<Person> getPersons() {
		return persons;
	}

	public void setPersons(ArrayList<Person> persons) {
		this.persons = persons;
	}

	public Person getPerson(String name) {
		for(Person p: persons) {
			if(p.getName() == name) {
				return p;
			}
		}
		return new Person();
	}

	public void addPerson(Person person) {
		this.persons.add(person);
	}
	
	public boolean removePerson(String name) {
		for(Person p: persons) {
			if(p.getName() == name) {
				persons.remove(p);
				return true;
			}
		}
		return false;
	}
}
