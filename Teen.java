
public class Teen extends Person  implements Mover {
	@Override
	public double metabolizeAccumulatedCalories() {
		int b = 0;
		double c = 0.0;
		b = super.getCaloriesAccumulator();
		c = (double) b / 5000;
		super.gainWeight(c);
		super.setCaloriesAccumulator(0);
		return 0.0;
	}
	@Override
	public String move() {
		return "run fast and jump";
	}
	@Override
	public String move(int count) {
		String s = "";
		if(count <= 0) {
			return "";
		}
		else {
		for(int i = 0; i < count; i++) {
			s = s + "run fast and jump\n";
		}
		s = s.trim();
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
