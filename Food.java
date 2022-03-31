
public class Food {
	private String name;
	private int calories;
	
	public Food(String name, int calories) {
		this.name = name;
		this.calories = calories;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setCalories(int calories) {
		this.calories = calories;
	}
	public int getCalories() {
		return calories;
	}
	@Override
	public String toString() {
		String s = String.format("Food - name: %10s | calories: %4d", name, calories);
		return s;
	}
	@Override
	public boolean equals(Object o) {
		if(this == o) {
			return true;
		}
		if(o == null) {
			return false;
		}
		if(o instanceof Food) {
			Food otherFood = (Food) o;
			if(getName() == otherFood.getName() && getCalories() == otherFood.getCalories()) {
				return true;
			}
		}
	return false;
	}
}
