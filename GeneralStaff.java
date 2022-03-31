public class GeneralStaff extends Employee {
	private String duty;
	
	public GeneralStaff() {
		duty = "";
	}
	public GeneralStaff(String duty) {
		this.duty = duty;
	}
	public GeneralStaff(String deptName, String duty) {
		super.setDeptName(deptName);
		this.duty = duty;
	}
	public GeneralStaff(String name, int birthYear, String deptName, String duty) {
		super.setName(name);
		super.setBirthYear(birthYear);
		super.setDeptName(deptName);
		this.duty = duty;
	}
	public String getDuty() {
		return duty;
	}
	@Override
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		if(obj == null) {
			return false;
		}
		if(obj instanceof GeneralStaff) {
			GeneralStaff otherGeneralStaff = (GeneralStaff) obj;
			if (super.equals(obj) == true && getDuty() == otherGeneralStaff.getDuty())	{			
	        	return true;
		}
		}
			return false;
	}
	@Override
	public String toString() {
		String s = "";
		s = super.toString() + String.format(" GeneralStaff: Duty: %10s", duty);
		return s;
	}
}
