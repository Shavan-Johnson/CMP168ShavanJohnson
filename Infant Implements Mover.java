
public class Infant extends Person implements Mover {
	public class InfantToy {
		private String infantToyName;
		private int infantToyRating;
		
		public InfantToy(String infantToyName, int infantToyRating) {
		     this.infantToyName = infantToyName;
		     this.infantToyRating = infantToyRating;
		}
		public String toString() {
			String x = "";
			x = x + String.format("InfantToy: Toy Name: %20s | Rating %4d\n", infantToyName, infantToyRating);
			return x;
		}
	}
	private int numInfantToys;
	private InfantToy[] toys;
	
	public Infant() {
		toys = new InfantToy[10];
		numInfantToys = 0;
	}
	public Infant(String name, int birthYear, double weight, double height, char gender, int numCarryOn) {
		super(name, birthYear, weight, height, gender, numCarryOn, 0);
		//this.numInfantToys = numInfantToys;
		toys = new InfantToy[10];
	}
	public void addInfantToy(String name, int rating) {
		InfantToy d = new InfantToy(name, rating);
		if(numInfantToys < 10) {
			toys[numInfantToys] = d;
			numInfantToys++;
		}
		else {
			System.out.print("toys has reached capacity of 10");
		}
	}
	public int getNumInfantToys() {
		return numInfantToys;
	}
	public String getInfantToyName(int index) {
		if(index >= 0 && index < numInfantToys && toys[index] != null) {
			return toys[index].infantToyName;
		}
		else {
			return "invalid index " + index;
		}
	}
	public int getInfantToyRating(int index) {
		if(index >= 0 && index < numInfantToys) {
			return toys[index].infantToyRating;
		}
		else {
			return -1;
		}
	}
	public String getInfantToyAsString(int index) {
		if ((index >= 0) && index < numInfantToys) {
			String s = toys[index].toString();
			return s;
		}
		else {
			return "invalid index " + index;
		}
	}
	public int getHighestInfantToyRating() {
		if(toys.length <= 0) {
			return 0;
		}
		else {
			int max = 0;
			for (int i = 0; i < numInfantToys; i++) {
				if (toys[i].infantToyRating > max) {
					max = toys[i].infantToyRating;
				}
				
			}
			return max;
		}
	}
	@Override
	public double metabolizeAccumulatedCalories() {
		int b = 0;
		double c = 0.0;
		b = super.getCaloriesAccumulator();
		c = (double) b / 1200;
		super.gainWeight(c);
		super.setCaloriesAccumulator(0);
		return 0.0;
	}
	
	@Override
	public String toString() {
    	String s = String.format("Name: %20s | Year of Birth: %4d | Weight: %10.2f | Height: %10.2f | Gender: %c | NumCarryOn: %2d\nPerson: Number of Offspring: %4d\nInfant: Number of Toys: %4d | Infant Toys:\n", getName(), getBirthYear(), getWeight(), getHeight(), getGender(), getNumCarryOn(), 0, numInfantToys);	
    	for(int i = 0; i < numInfantToys; i ++) {
    		s = s + String.format("InfantToy: Toy Name: %20s | Rating %4d\n", toys[i].infantToyName, toys[i].infantToyRating);
    	}
    	return s;
	}
	public void printDetails() {
		System.out.print("Name: %20s" + getName() + " | Weight: %10.2f" + getWeight() + " | Height: %10.2f" + getHeight() + " | Gender: %c" + getGender() + " | NumCarryOn: %2d\n" + getNumCarryOn() + " Person: Number of Offspring: %4d\n" + 0 + "Infant: Number of Toys: %4d " + numInfantToys + "| Infant Toys:\n");
		for(int i = 0; i < numInfantToys; i ++) {
		    System.out.print("InfantToy: Toy Name: %20s " + toys[i].infantToyName + "| Rating %4d\n" + toys[i].infantToyRating);
		}
	}
	@Override
	public String move() {
		return "flail arms and legs";
	}
	@Override
	public String move(int count) {
		String s = "";
		if(count <= 0) {
			return "";
		}
		else {
		for(int i = 0; i < count; i++) {
			s = s + "flail arms and legs\n";
		}
		return s;
	}
	}
	@Override
	public void eat(Food food) {
		int a = food.getCalories();
        super.setCaloriesConsumed(a);
        super.setCaloriesAccumulator(a);
	}
	@Override
	public void eat(Food[] foods) {
		int a = 0;
		int b = 0;
		for (int i = 0; i < foods.length; i++) {
			if (foods[i] != null) {
				a += foods[i].getCalories();
			}
		}
		b = super.getCaloriesConsumed();
		super.setCaloriesConsumed(a + b);
		b = super.getCaloriesAccumulator();
		super.setCaloriesAccumulator(a + b);
	}
}
