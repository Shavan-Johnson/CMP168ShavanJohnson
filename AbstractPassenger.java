
public abstract class Passenger implements Eater{
	private String name;
	private int birthYear;
	private double weight;
	private char gender;
	private int numCarryOn;
	private double height;
	private int caloriesConsumed = 0;
	private int caloriesAccumulator = 0;
	
	public Passenger() {
		name = "";
		birthYear = 1900;
		weight = 0.0;
		gender = 'u';
		numCarryOn = 0;
		height = 0.0;
	}
	public Passenger(String name, int birthYear, double weight, double height, char gender, int numCarryOn) {
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
        if (height < 0.0) {
        	height = -1.0;
        	this.height = height;
        }
        else {
        	this.height = height;
        }
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
	public void setHeight(double height) {
		if(height < 0.0) {
			height = -1.0;
			this.height = height;
		}
		else {
			this.height = height;
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
	public void setCaloriesConsumed(int caloriesConsumed) {
		this.caloriesConsumed = caloriesConsumed;
	}
	public void setCaloriesAccumulator(int caloriesAccumulator) {
		this.caloriesAccumulator = caloriesAccumulator;
	}
	public int getCaloriesConsumed() {
		return caloriesConsumed;
	}
	public int getCaloriesAcumulator() {
		return caloriesAccumulator;
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
	public double getHeight() {
		return height;
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
	abstract double metabolizeAccumulatedCalories();
	
	public void printDetails() {
		System.out.print("Name: %20s" + name + " | Weight: %10.2f" + weight + " | Height: %10.2f" + height + " | Gender: %c" + gender + " | NumCarryOn: %2d\n" + numCarryOn);
	}
	@Override
	public String toString() {  
    	return String.format("Name: %20s | Year of Birth: %4d | Weight: %10.2f | Height: %10.2f | Gender: %c | NumCarryOn: %2d", name, birthYear, weight, height, gender, numCarryOn);	
	}
	public double calculateBMI() {
		double BMI = 0.0;
		BMI = (weight * 703) / (Math.pow(height, 2.0));
		return BMI;
	}
	@Override
	public boolean equals(Object o) {
		if(this == o) {
			return true;
		}
		if(o == null ) {
			return false;
		}
		if(o instanceof Passenger) {
			Passenger otherPassenger = (Passenger) o;
			if(getName() == otherPassenger.getName() 
					&& getBirthYear() == otherPassenger.getBirthYear() 
					&& getGender() == otherPassenger.getGender()
					&& (!(getWeight() - otherPassenger.getWeight() > 0.5) && !(getWeight() - otherPassenger.getWeight() < 0.5))
					&& (!(getHeight() - otherPassenger.getHeight() > 0.5) && !(getHeight() - otherPassenger.getHeight() < 0.5)));
			return true;
		}
		else {
		    return false;
		}
	}
}
