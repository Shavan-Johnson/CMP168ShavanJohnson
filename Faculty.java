public class Faculty extends Employee implements Comparable<Person> {
	private Course[] coursesTaught;
	private int numCoursesTaught;
	private boolean isTenured;
	
	public Faculty() {
		coursesTaught = new Course [100];
		numCoursesTaught = 0;
		isTenured = false;
	}
	public Faculty(boolean isTenured) {
		this.isTenured = isTenured;
		coursesTaught = new Course [100];
		numCoursesTaught = 0;
	}
	public Faculty(String deptName, boolean isTenured) {
		super.setDeptName(deptName);
		this.isTenured = isTenured;
	}
	public Faculty(String name, int birthYear, String deptName, boolean isTenured) {
		super.setName(name);
		super.setBirthYear(birthYear);
		super.setDeptName(deptName);
		this.isTenured = isTenured;
	}
	public boolean isTenured() {
		return isTenured;
	}
	public int getNumCoursesTaught() {
		return numCoursesTaught;
	}
	public void setIsTenured(boolean isTenured) {
		this.isTenured = isTenured;
	}
	public void addCourseTaught(Course course) {
		if(numCoursesTaught < 100) {
			coursesTaught[numCoursesTaught] = course;
			numCoursesTaught++;
		}
	}
	public void addCoursesTaught(Course [] course) {
		for(int i = 0; i < course.length; i ++) {
			coursesTaught[numCoursesTaught] = course[i];
			numCoursesTaught++;
		}
	}
	public Course getCourseTaught(int index) {
		if(index > numCoursesTaught || index < 0) {
			return null;
		}
		else {
			return coursesTaught[index];
		}
	}
	public String getCourseTaughtAsString(int index) {
		if(index > numCoursesTaught || index < 0) {
			return null;
		}
		else {
			String f = coursesTaught[index].getCourseDept() + "-" + coursesTaught[index].getCourseNum();
			return f;
		}
	}
	public String getAllCoursesTaughtAsString() {
		String g = "";
		for(int i = 0; i < numCoursesTaught; i ++) {
		      g = g + getCourseTaughtAsString(i) + ", ";	
		}
		g = g.replaceAll(", $", "");
		return g;
	}
	@Override
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		if(obj == null) {
			return false;
		}
		if(obj instanceof Faculty) {
			Faculty otherFaculty = (Faculty) obj;
			if (super.equals(obj) == true && getNumCoursesTaught() == otherFaculty.getNumCoursesTaught() && isTenured() == otherFaculty.isTenured()) {			
	        	return true;
		}
		}
			return false;
	}
	@Override
	public String toString() {
		String s = "";
		s = super.toString() + String.format(" Faculty: %11s | Number of Courses Taught: %3d | Courses Taught: %s", checkIfTenured(), numCoursesTaught, getAllCoursesTaughtAsString());
		return s;
	}
	public String checkIfTenured() {
		if(isTenured == true) {
			return "Is Tenured";
		}
		else {
			return "Not Tenured";
		}
	}
	public int compareTo(Person p) {
		int f = 0;
		f = super.compareTo(p);
		if (p instanceof Faculty) {
			Faculty x = (Faculty) p;
			if (numCoursesTaught == x.numCoursesTaught) {
				return 0;
			} else if (numCoursesTaught > x.numCoursesTaught) {
				return 1;
			} else {
				return -1;
			}
		}
		else {
		 return f;
	}
	}
}
