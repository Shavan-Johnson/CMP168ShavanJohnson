import java.util.Calendar;

public class Pediatrician extends Doctor{
	private boolean hasPrivatePractice = false;
	private String hospitalName = "";
	private Patient[] patients;
	private int numberOfPatients;
	public Pediatrician(String name) {
		super(name);
		//patients = new Patient[100];
		//numberOfPatients = 0;
	}
	public Pediatrician(String name, boolean hasPrivatePractice, String hospitalName) {
		super(name);
		this.hasPrivatePractice = hasPrivatePractice;
		this.hospitalName = hospitalName;
		//patients = new Patient[100];
		//numberOfPatients = 0;
	}
	public boolean hasPrivatePractice() {
		return hasPrivatePractice;
	}
	public String getHospitalName() {
		return hospitalName;
	}
	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}
	@Override
	public void addPatient(Patient p) throws PatientException{
		Calendar c = Calendar.getInstance();
		int currYear = c.get(Calendar.YEAR);
		int age = 0;
		if (p != null) {
			age = Math.abs(currYear - p.getBirthYear());
			if (age < 18 && age >= 0) {
				super.addPatient(p);
			}
			else {
				throw new PatientException("The patient must be less than 18 years old.");
			}
		}
		 else {
			throw new PatientException("The patient must be less than 18 years old.");
		}
	}
	@Override
	public String toString() {
		String s = "";
		s = String.format(super.toString() + "\nPediatrician: | hosptal name=%15s,", (hasPrivatePractice ? "has private practice" : "does not have pactice practice"), hospitalName);
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
		if(o instanceof Pediatrician) {
			Pediatrician otherp = (Pediatrician) o;
			if (getHospitalName() == otherp.getHospitalName() && hasPrivatePractice() == otherp.hasPrivatePractice())	{			
	        	return true;
		}
		}
			return false;
	}
}
