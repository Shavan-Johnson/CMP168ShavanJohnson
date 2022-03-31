
public class PatientException extends Exception {
	public PatientException() {
		super("InvalidPatientException");
	}
	public PatientException(String x) {
		super("InvalidPatientException: " + x);
	}
}
