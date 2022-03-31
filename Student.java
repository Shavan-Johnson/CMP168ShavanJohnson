public class Student extends Person implements Comparable<Person> {
	private static int numStudents = 1;
	private int studentID;
	private Course[] coursesTaken;
	private int numCoursesTaken;
	private boolean isGraduate;
	private String major = "undeclared"; 
	
	public Student() {
		coursesTaken = new Course[50];
		numCoursesTaken = 0;
		isGraduate = false;
		studentID = numStudents++;
	}
	public Student(boolean isGraduate) {
		coursesTaken = new Course[50];
		numCoursesTaken = 0;
		this.isGraduate = isGraduate;
		studentID = numStudents++;
	}
	public Student(String major, boolean isGraduate) {
		this.major = major;
		this.isGraduate = isGraduate;
		studentID = numStudents++;
	}
	public Student(String name, int birthYear, String major, boolean isGraduate) {
		super.setName(name);
		super.setBirthYear(birthYear);
		this.major = major;
		this.isGraduate = isGraduate;
		studentID = numStudents++;
	}
	public boolean isGraduate() {
		return isGraduate;
	}
	public int getNumCoursesTaken() {
		return numCoursesTaken;
	}
	public static int getNumStudents() {
		return numStudents;
	}
	public int getStudentID() {
		return studentID;
	}
	public String getMajor() {
		return major;
	}
	public void setIsGraduate(boolean isGraduate) {
		this.isGraduate = isGraduate;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public void addCourseTaken(Course course) {
		if(numCoursesTaken < 50) {
			coursesTaken[numCoursesTaken] = course;
			numCoursesTaken++;
		}
	}
	public void addCoursesTaken(Course [] course) {
		for(int i = 0; i < course.length; i ++) {
			coursesTaken[numCoursesTaken] = course[i];
			numCoursesTaken++;
		}
	}
	public Course getCourseTaken(int index) {
		if(index > numCoursesTaken || index < 0) {
			return null;
		}
		else {
			return coursesTaken[index];
		}
	}
	public String getCourseTakenAsString(int index) {
		if(index > numCoursesTaken || index < 0) {
			return null;
		}
		else {
			String f = coursesTaken[index].getCourseDept() + "-" + coursesTaken[index].getCourseNum();
			return f;
		}
	}
	public String getAllCoursesTakenAsString() {
		String g = "";
		for(int i = 0; i < numCoursesTaken; i ++) {
		      g = g + getCourseTakenAsString(i) + ", ";	
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
		if(obj instanceof Student) {
			Student otherStudent = (Student) obj;
			if (super.equals(obj) == true && getNumCoursesTaken() == otherStudent.getNumCoursesTaken() && isGraduate() == otherStudent.isGraduate() && getMajor() == otherStudent.getMajor())	{			
	        	return true;
		}
		}
			return false;
	}
	@Override
	public String toString() {
		String s = "";
		s = super.toString() + String.format(" Student: studentID: %04d | Major %20s | %14s | Number of Courses Taken: %3d | Courses Taken: %s", studentID, major, checkIfGraduate(), numCoursesTaken, getAllCoursesTakenAsString());
		return s;
	}
	public String checkIfGraduate() {
		if(isGraduate == true) {
			return "Graduate";
		}
		else {
			return "Undergraduate";
		}
	}
	@Override
	public int compareTo(Person p) {
		int r = 0;
		int y = 0;
		if (p != null) {
			Student x = (Student) p;
			for (int i = 0; i < numCoursesTaken; i++) {
				r = r + coursesTaken[i].getNumCredits();
			}
			for (int i = 0; i < x.numCoursesTaken; i++) {
				y = y + x.coursesTaken[i].getNumCredits();
			}
			if (r == y) {
				return 0;
			} else if (r > y) {
				return 1;
			} else {
				return -1;
			}
		} else {
			return -2;
		}
	}
}
