
public class Passenger {
	private String name;
	private int birthYear;
	private double weight;
	private char gender;
	private int numCarryOn;
	
	public Passenger() {
		name = "";
		birthYear = 1900;
		weight = 0.0;
		gender = 'u';
		numCarryOn = 0;
	}
	public Passenger(String name, int birthYear, double weight, char gender, int numCarryOn) {
		this.name = name;
		this.birthYear = birthYear;
        if(weight < 0.0) {
        	weight = -1.0;
        	this.weight = weight;
        }
        this.weight = weight;
        if(gender != 'm' && gender != 'f' && gender != 'u') {
        	gender = 'u';
        	this.gender = gender;
        }
        else {
        this.gender = gender;
        }
        if(numCarryOn < 0) {
        	numCarryOn = 0;
        	this.numCarryOn = numCarryOn;
        }
        else if(numCarryOn > 2) {
        	numCarryOn = 2;
        	this.numCarryOn = numCarryOn;
        }
        this.numCarryOn = numCarryOn;
	}
	public void setGender(char gender) {
		if(gender != 'm' && gender != 'f' && gender != 'u') {
        	gender = 'u';
        	this.gender = gender;
        } else {
			this.gender = gender;
	}
	}
	public void setName (String name) {
		this.name = name;
	}
	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}
	public void setWeight(double weight) {
		if(weight < 0) {
			weight = -1.0;
			this.weight = weight;
		}
		else {
		    this.weight = weight;
		}
	}
	public void setNumCarryOn(int numCarryOn) {
		if(numCarryOn < 0) {
			numCarryOn = 0;
		}
		else if (numCarryOn > 2) {
			numCarryOn = 2;
		}
		else {
		    this.numCarryOn = numCarryOn;
		}
	}
	public int getBirthYear() {
		return birthYear;
	}
	public char getGender() {
		return gender;
	}
	public String getName() {
		return name;
	}
	public double getWeight() {
		return weight;
	}
	public int getNumCarryOn() {
		return numCarryOn;
	}
	public boolean isFemale() {
		if(gender == 'f') {
			return true;
		}
		else {
			return false;
		}
	}
	public boolean isMale() {
		if(gender == 'm') {
			return true;
		}
		else {
			return false;
		}
	}
	public int calculateAge(int currentYear) {
		if (currentYear < birthYear) {
			return -1;
		}
		else {
		    int age = currentYear - birthYear;
		    return age;
		}
	}
	public void gainWeight() {
		weight = weight + 1;
	}
	public void gainWeight(double addWeight) {
		weight = weight + addWeight;
		if(weight < 0.0) {
			weight = 1;
		}
	}
	public void loseWeight() {
		weight = weight - 1;
		if(weight < 0.0) {
			weight = 0;
		}
	}
	public void loseWeight(double loseWeight) {
		weight = weight - loseWeight;
		if(weight < 0.0) {
			weight = 0;
		}
	}
	public void printDetails() {
		System.out.print("Name: %20s" + name + " | Weight: %10.2f" + weight + " | Gender: %c" + gender + " | NumCarryOn: %2d\n" + numCarryOn);
	}
}
