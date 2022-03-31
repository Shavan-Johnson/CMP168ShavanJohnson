

public class Person implements Comparable<Person>{
	private String name;
	private int birthYear;
	
	public Person() {
		name = "";
		birthYear = 0;
	}
	public Person(String name, int birthYear) {
		this.name = name;
		this.birthYear = birthYear;
	}
	public String getName() {
		return name;
	}
	public int getBirthYear() {
		return birthYear;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}
	@Override
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		if(obj == null) {
			return false;
		}
		if(obj instanceof Person) {
			Person otherPerson = (Person) obj;
			if (getName() == otherPerson.getName() && getBirthYear() == otherPerson.getBirthYear())	{			
	        	return true;
		}
		}
			return false;
	}
	@Override
	public String toString() {
		String s = "";
		s = String.format("Person: Name: %30s | Birth Year: %4d", name, birthYear);
		return s;
	}
	@Override
	public int compareTo(Person p) {
		if(birthYear == p.birthYear) {
			return 0;
		}
		else if(birthYear > p.birthYear) {
			return 1;
		}
		else {
			return -1;
		}
		}
}
