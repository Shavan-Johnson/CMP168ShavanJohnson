//package FinalExam;

public class Bicycle extends Vehicle implements Comparable<Bicycle> {
	private double weight;
	static int[] f = {1};

	public Bicycle() {
		super(1, 1);
		weight = 0.0;
	}
	public Bicycle(Person driver) {
		super(driver, f);
		weight = 0.0;
	}
	public Bicycle(Person driver, double weight) {
		super(driver, f);
		if(weight < 0.0) {
			weight = 0.0;
		}
		this.weight = weight;
	}
	public void setWeight(double w) {
		if(w < 0.0) {
			w = 0.0;
		}
		this.weight = w;
	}
	public double getWeight() {
		return weight;
	}
	@Override
	public void setDriver(Person p) throws InvalidDriverException {
		if((p.getAge() < 3)) {
			throw new InvalidDriverException("Person must be older than 3 years in order to drive.");
		}
		else if(p == null){
			throw new InvalidDriverException();
		}
		else {
			personsOnBoard[0][0] = p;
		}
	}
	public String toString() {
		String s = "";
		s = "Bicycle [ rider= " + getDriver().getName() + " | weight= " + weight + " ]";
		return s;
	}
	public boolean equals(Object o) {
		if(this == o) {
			return true;
		}
		if(o == null) {
			return false;
		}
		if(o instanceof Bicycle) {
			Bicycle otherBicycle = (Bicycle) o;
			if((!(getWeight() - otherBicycle.getWeight() > 0.5) && !(getWeight() - otherBicycle.getWeight() < 0.5))) {
				return true;
			}
		}
		return false;
	}
	@Override
	public int compareTo(Bicycle b) {
		if (b != null && b instanceof Bicycle) {
			if ((getWeight() - b.getWeight() > 0.5) && (getWeight() - b.getWeight() > 0.5)) {
				return -1;
			} else if ((getWeight() - b.getWeight() < 0.5) && (getWeight() - b.getWeight() < 0.5)) {
				return 0;
			} else {
				return 1;
			}
		}
		return -1;
	}

	@Override
	public boolean loadPassenger(Person p) {
		return false;
	}

	@Override
	public int loadPassengers(Person[] peeps) {
		return 0;
	}
}
