import java.util.Calendar;

public class Gerontologist extends Doctor{
	private boolean performsHouseCalls = true;
	private double visitFee = 0.0;
	private Patient[] patients;
	private int numberOfPatients;
	
	public Gerontologist(String name) {
		super(name);
		//patients = new Patient[100];
		//numberOfPatients = 0;
	}
	public Gerontologist(String name, boolean performsHouseCalls, double visitFee) {
		super(name);
		this.performsHouseCalls = performsHouseCalls;
		if(visitFee < 0) {
			visitFee = 0.0;
		}
		this.visitFee = visitFee;
		//patients = new Patient[100];
		//numberOfPatients = 0;
	}
	public boolean performsHouseCalls() {
		return performsHouseCalls;
	}
	public double getVisitFee() {
		return visitFee;
	}
	public void setPerformsHouseCalls(boolean performsHouseCalls) {
		this.performsHouseCalls = performsHouseCalls;
	}
	public void setVisitFee(double visitFee) {
		if(visitFee < 0) {
			visitFee = 0.0;
		}
		this.visitFee = visitFee;
	}
	@Override
	public void addPatient(Patient p) throws PatientException {
		Calendar c = Calendar.getInstance();
		int currYear = c.get(Calendar.YEAR);
		int age = 0;
		if (p != null) {
			age = currYear - p.getBirthYear();
			if (age > 65) {
				super.addPatient(p);
			}
			else {
				throw new PatientException("The patient must be older than 65 years old.");
			}
		}
		 else {
			throw new PatientException("The patient must be older than 65 years old.");
		}

	}
	@Override
	public String toString() {
		String s = "";
		s = String.format(super.toString() + "\nGerontologist: %s | visit fee=%02.3f", (performsHouseCalls ? "performs house calls" : "no house calls"), visitFee);
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
		if(o instanceof Gerontologist) {
			Gerontologist otherg = (Gerontologist) o;
			if (performsHouseCalls() == otherg.performsHouseCalls() && (!(getVisitFee() - otherg.getVisitFee() > 0.5) && !(getVisitFee() - otherg.getVisitFee() < 0.5)))	{			
	        	return true;
		}
		}
			return false;

	}
}
