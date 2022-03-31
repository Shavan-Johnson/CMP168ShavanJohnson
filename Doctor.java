
public class Doctor implements SeesPatients, Comparable<Doctor>{
	private static int numDoctors = 0;
	private String name;
	private int licenseNumber;
	private Patient[] patients;
	private int numberOfPatients;
	
	public Doctor(String name) {
		this.name = name;
		licenseNumber = numDoctors++;
		patients = new Patient[100];
		numberOfPatients = 0;
	}
	public static int getNumDoctors() {
		return numDoctors;
	}
	public int getLicenseNumber() {
		return licenseNumber;
	}
	public String getName() {
		return name;
	}
	public int getNumberOfPatients() {
		return numberOfPatients;
	}
	public String getPatientsAsString() {
	String s = "patients= ";
	for(int i = 0; i < numberOfPatients; i++) {
			if (patients[i] != null) {
				s = s + patients[i].toString();
				if (numberOfPatients - i > 1) {
					s = s + ", ";
				}
		}
	}
	return s;
	}
	public void addPatient(Patient p) throws PatientException {
		if(numberOfPatients == 100) {
			throw new PatientException("We cannot take any more patients.");
		}
		else if(p == null) {
			throw new PatientException();
		}
		else {
			patients[numberOfPatients] = p;
			numberOfPatients++;
		}
	}
	@Override
	public String toString() {
		String s = "";
		s = String.format("Doctor: name= %20s | license number= %06d | ", name, licenseNumber);
		s = s + getPatientsAsString();
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
		if(o instanceof Doctor) {
			Doctor otherDoctor = (Doctor) o;
			if (getName() == otherDoctor.getName() && getNumberOfPatients() == otherDoctor.getNumberOfPatients())	{			
	        	return true;
		}
		}
			return false;
	}
	@Override
	public int compareTo(Doctor d) {
		if (d != null && d instanceof Doctor) {
			if (numberOfPatients < d.numberOfPatients) {
				return -1;
			} else if (numberOfPatients == d.numberOfPatients) {
				return 0;
			} else {
				return 1;
			}
		}
		return -1;
	}
	public Patient[] getPatients() {
		if(patients == null) {
			return null;
		}
		else {
		return patients;
	}
	}
	public boolean isPatient(Patient p) {
		for(int i = 0; i < numberOfPatients; i++) {
			if(patients[i].equals(p)) {
				return true;
			}
		}
		if(p == null){
		return false;
		}
		return false;
	}
}
