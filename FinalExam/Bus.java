//package FinalExam;

public class Bus extends Car{
	public Bus(int[] numSeatsPerRow) {
		super(2, ((2 * numSeatsPerRow.length) - 1), numSeatsPerRow);
		numSeatsPerRow[0] = 1;
	}
	public Bus(Person driver, int[] numSeatsPerRow) {
		super(2, ((2 * numSeatsPerRow.length) - 1), driver, numSeatsPerRow);
		numSeatsPerRow[0] = 1;
	}
	public boolean canOpenDoor(Person p) {
		return false;
	}
	public boolean canOpenWindow(Person p) {
		return false;
	}
	public String toString() {
		String s = "Bus is an extension of ";
		s = s + super.toString();
		return s;
	}
	@Override
	public boolean loadPassenger(Person p) {
		for(int i = 0; i < numberOfRows; i++) {
			for(int j = 0; j < numSeatsPerRow.length; j++) {
				if((p.getAge() < 5) || (p.getHeight() < 36) && i == 0) {
					if(personsOnBoard[i + 1][j] == null) {
						personsOnBoard[i + 1][j] = p;
						return true;
					}
				}
				else {
					if(personsOnBoard[i][j] == null) {
						personsOnBoard[i][j] = p;
						return true;
					}
				}
			}
		}
		return false;
	}

	@Override
	public int loadPassengers(Person[] peeps) {
		int count = 0;
		for(int i = 0; i < numberOfRows; i++) {
			for(int j = 0; j < numSeatsPerRow.length; j++) {
				if((peeps[i].getAge() < 5) || (peeps[i].getHeight() < 36) && i == 0) {
					if(personsOnBoard[i + 1][j] == null) {
						personsOnBoard[i + 1][j] = peeps[i];
						count++;
					}
				}
				else {
					if(personsOnBoard[i][j] == null) {
						personsOnBoard[i][j] = peeps[i];
						count++;
					}
				}
			}
		}
		
		return count;
	}
	@Override
	public String departure() {
		String s = super.departure() + "The Bus\n";
		return s;
	}

	@Override
	public String arrival() {
		String s = super.arrival() + "The Bus\n";
		return s;
	}

	@Override
	public String doNotDisturbTheDriver() {
		String s = super.doNotDisturbTheDriver() + "On The Bus\n";
		return s;
	}
}
