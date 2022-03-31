public class Employee extends Person implements Comparable<Person>{
	private String deptName;
	private static int numEmployees = 1;
	private int employeeID;
	
	public Employee() {
		deptName = "";
		employeeID = numEmployees++;
	}
	public Employee(String deptName) {
		this.deptName = deptName;
		employeeID = numEmployees++;
	}
	public Employee(String name, int birthYear, String deptName) {
		this.deptName = deptName;
		super.setName(name);
		super.setBirthYear(birthYear);
		employeeID = numEmployees++;
	}
	public String getDeptName() {
		return deptName;
	}
	public static int getNumEmployees() {
		return numEmployees;
	}
	public int getEmployeeID() {
		return this.employeeID;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	@Override
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		if(obj == null) {
			return false;
		}
		if(obj instanceof Employee) {
			Employee otherEmployee = (Employee) obj;
			if (super.equals(obj) == true && getDeptName() == otherEmployee.getDeptName() && getEmployeeID() == otherEmployee.getEmployeeID())	{			
	        	return true;
		}
		}
			return false;
	}
	@Override
	public String toString() {
		String s = "";
		s = String.format(" Employee: Department: %20s | Employee Number: %3d", deptName, employeeID);
		return super.toString() + s;
	}
	public int compareTo(Person p) {
		int f = super.compareTo(p);
		if (p instanceof Employee) {
			Employee x = (Employee) p;
		if(getEmployeeID() == x.getEmployeeID()) {
			f = 0;
		}
		else if(getEmployeeID() > x.getEmployeeID()) {
			f = 1;
		}
		else {
			f = -1;
		}
		}
		return f;
	}
}
