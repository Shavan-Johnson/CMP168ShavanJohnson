

public class Course implements Comparable<Course> {
	private boolean isGraduateCourse;
	private int courseNum;
	private String courseDept;
	private int numCredits;
	
	public Course(boolean isGraduateCourse, int courseNum, String courseDept, int numCredits) {
		this.isGraduateCourse = isGraduateCourse;
		this.courseNum = courseNum;
		this.courseDept = courseDept;
		this.numCredits = numCredits;
	}
	public boolean isGraduateCourse() {
		return isGraduateCourse;
	}
	public int getCourseNum() {
		return courseNum;
	}
	public String getCourseDept() {
		return courseDept;
	}
	public int getNumCredits() {
		return numCredits;
	}
	public String getCourseName() {
		if(isGraduateCourse == true) {
			return "G" + getCourseDept() + courseNum;
		}
		else {
			return "U" + getCourseDept() + courseNum;
		}
	}
	@Override
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		if(obj == null) {
			return false;
		}
		if(obj instanceof Course) {
			Course otherCourse = (Course) obj;
			if (isGraduateCourse() == otherCourse.isGraduateCourse() && getCourseNum() == otherCourse.getCourseNum() && getCourseDept().equals(otherCourse.getCourseDept()) && getNumCredits() == otherCourse.getNumCredits() && getCourseName().contentEquals(otherCourse.getCourseName()))	{			
	        	return true;
		}
		}
			return false;
	}
	@Override
	public String toString() {
		String graduate = "";
		if(isGraduateCourse == true) {
			graduate = "Graduate";
		}
		else {
		    graduate = "Undergraduate";	
		}
		String s = "";
		s = String.format("Course: %3s-%3d | Number of Credits: %02d | ",  courseDept, courseNum, numCredits);
		s = s + graduate;
		return s;
	}
	public int compareTo(Course c) {
		return (courseNum < c.courseNum) ? -1 : ((courseNum == c.courseNum)? 0 : 1);
		}
	
}
