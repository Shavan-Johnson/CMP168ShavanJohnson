
public class Person extends Passenger {
	private int numOffspring;
	
	public Person() {
		numOffspring = 0;
	}
	public Person(int numOffspring) {
		if (numOffspring < 0) {
			numOffspring = 0;
			this.numOffspring = numOffspring;
		}
		else {
			this.numOffspring = numOffspring;
		}
	}
	public Person(String name, int birthYear, double weight, double height, char gender, int numCarryOn, int numOffspring) {
		super(name, birthYear, weight, height, gender, numCarryOn);
		if(numOffspring < 0) {
			numOffspring = 0;
			this.numOffspring = numOffspring;
		}
		else {
			this.numOffspring = numOffspring;
		}
	}
	public void setNumOffspring(int num) {
		if(num < 0) {
			num = 0;
			this.numOffspring = num;
		}
		else {
			this.numOffspring = num;
		}
	}
	public int getNumOffspring() {
		return numOffspring;
	}
	@Override
	public String toString() {
    	return String.format("Name: %20s | Year of Birth: %4d | Weight: %10.2f | Height: %10.2f | Gender: %c | NumCarryOn: %2d\nPerson: Number of Offspring: %4d\n", getName(), getBirthYear(), getWeight(), getHeight(), getGender(), getNumCarryOn(), numOffspring);	
	}
	@Override
	public boolean equals(Object o) {
		if(this == o) {
			return true;
		}
		if(o == null) {
			return false;
		}
		if(o instanceof Person) {
			Person otherPerson = (Person) o;
			if (super.equals(o) == true && getNumOffspring() == otherPerson.getNumOffspring())	{			
	        	return true;
		}
		}
			return false;
	}
	public void printDetails() {
		System.out.print("Name: %20s" + getName() + " | Weight: %10.2f" + getWeight() + " | Height: %10.2f" + getHeight() + " | Gender: %c" + getGender() + " | NumCarryOn: %2d\n" + getNumCarryOn() + " Person: Number of Offspring: %4d\n" + numOffspring);

	}
}
