
import java.util.Scanner;
//https://youtu.be/QoMX-fRlgVs
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
public class Driver_SchoolDB {
	private static String name = "";
	private static Course c1;
	private static Course c2;
	private static Course c3;
	private static Faculty f1;
    private static Faculty f2;
	private static Faculty f3;
	private static GeneralStaff g1;
	private static GeneralStaff g2;
	private static GeneralStaff g3;
	private static Student s1;
	private static Student s2;
	private static Student s3;
	private static int numCourses = 0;
	private static int numFaculty = 0;
    private static int numStaff = 0;
	private static int numStudents = 0;
	private static boolean isGrad1;
	private static int course1Num;
	private static String course1Dept;
	private static int course1Credits;
	private static boolean isGrad2;
	private static int course2Num;
	private static String course2Dept;
	private static int course2Credits;
	private static boolean isGrad3;
	private static int course3Num;
	private static String course3Dept;
	private static int course3Credits;
	private static boolean isTenured1;
	private static String faculty1Name;
	private static String faculty1Dept;
	private static int faculty1BirthYear;
	private static boolean isTenured2;
	private static String faculty2Name;
	private static String faculty2Dept;
	private static int faculty2BirthYear;
	private static boolean isTenured3;
	private static String faculty3Name;
	private static String faculty3Dept;
	private static int faculty3BirthYear;
	private static String gs1Name;
	private static String gs1Dept;
	private static int gs1BirthYear;
	private static String gs1Duty;
	private static String gs2Name;
	private static String gs2Dept;
	private static int gs2BirthYear;
	private static String gs2Duty;
	private static String gs3Name;
	private static String gs3Dept;
	private static int gs3BirthYear;
	private static String gs3Duty;
	private static boolean isUG1;
	private static String s1Name;
	private static String s1Major;
	private static int s1BirthYear;
	private static boolean isUG2;
	private static String s2Name;
	private static String s2Major;
	private static int s2BirthYear;
	private static boolean isUG3;
    private static String s3Name;
	private static String s3Major;
	private static int s3BirthYear;
	static Scanner scnr = new Scanner(System.in);
	
	
	public static void main(String[] args) throws IOException {
//		
//		System.out.println("Please enter your name:");
//		name = scnr.nextLine();
//		if(name.equalsIgnoreCase("exit")) {
//			System.out.println("Thank you for using the school database.\nExiting...");
//			System.exit(0);
//		}
//		else {
//			Driver_SchoolDB.MainMenu();
//		}
//	}
//	public static void MainMenu() throws IOException {
//		System.out.println("Welcome to the school database " + name + ". Please enter a number to select a area.");
//		System.out.println("1 - Courses\n2 - General Staff\n3 - Faculty\n4 - Students\n5 - Print Information\n6 - Exit Database");
//		int choice = scnr.nextInt();
//		
//		switch (choice) {
//	    case 1:
//			Courses();
//			break;
//		case 2:
//			GeneralStaff();
//			break;
//		case 3:
//			Faculty();
//			break;
//		case 4:
//			Students();
//			break;
//	      case 5:
//			PrintInfo();
//			break;
//		case 6:
//			System.out.println("Thank you for using the school database.\nExiting...");
//			System.exit(0);
//		default:
//			System.out.println("Incorrect choice. Try again.");
//			MainMenu();
//		}
//	}
//	
//	public static void Courses() throws IOException {
//		System.out.println("Welcome to the course section " + name + ". Please enter a number to select a action.");
//		System.out.println("1 - Create a new course\n2 - View course information\n5 - Exit Database");
//		int choice = scnr.nextInt();
//		switch (choice) {
//		
//		case 1:
//			if(numCourses == 0) {
//		System.out.println("Enter in the info in this order: Grad/Undergrad, Course number, Course dept, Number of credits.");
//			isGrad1 = scnr.nextBoolean();
//			course1Num = scnr.nextInt();
//			course1Dept = scnr.next();
//			course1Credits = scnr.nextInt();
//			
//			c1 = new Course(isGrad1, course1Num, course1Dept, course1Credits);
//			numCourses++;
//			Courses();
//			}
//		if(numCourses == 1) {
//				System.out.println("Enter in the info in this order: Grad/Undergrad, Course number, Course dept, Number of credits.");
//				isGrad2 = scnr.nextBoolean();
//			    course2Num = scnr.nextInt();
//				course2Dept = scnr.next();
//				course2Credits = scnr.nextInt();
//				
//				c2 = new Course(isGrad2, course2Num, course2Dept, course2Credits);
//				numCourses++;
//				Courses();
//			}
//		if(numCourses == 2) {
//				System.out.println("Enter in the info in this order: Grad/Undergrad, Course number, Course dept, Number of credits.");
//				isGrad3 = scnr.nextBoolean();
//				course3Num = scnr.nextInt();
//				course3Dept = scnr.next();
//				course3Credits = scnr.nextInt();
//				
//				c3 = new Course(isGrad3, course3Num, course3Dept, course3Credits);
//				numCourses++;
//				Courses();
//			}
//			if(numCourses == 3) {
//				System.out.println("You can only add 3 courses. Please choose another option.");
//				Courses();
//			}
//		    case 2:
//		    if(numCourses == 1) {
//		         System.out.println(c1.toString());
//		    }
//		    else if (numCourses == 2) {
//			     System.out.println(c1.toString() + "\n" + c2.toString());
//		    }
//		    else if(numCourses == 3) {
//			     System.out.println(c1.toString() + "\n" + c2.toString() + "\n" + c3.toString());
//		}
//		Courses();
//			case 5:
//				MainMenu();
//			    break;
//			
//			
//		}
//	}
//	public static void Faculty() throws IOException {
//		System.out.println("Welcome to the faculty section " + name + ". Please enter a number to select a action.");
//				System.out.println("1 - Create a new Faculty\n2 - Print Information\n3 - Add a course\n5 - Exit Database");
//				int choice = scnr.nextInt();
//				switch (choice) {
//				
//				case 1:
//					if(numFaculty == 0) {
//					System.out.println("Enter in the info in this order: Name, Birth Year, Dept name, Is/Is not tenured.");
//					faculty1Name = scnr.next();
//					faculty1BirthYear = scnr.nextInt();
//					faculty1Dept = scnr.next();
//			    	isTenured1 = scnr.nextBoolean();
//					
//					f1 = new Faculty(faculty1Name, faculty1BirthYear, faculty1Dept, isTenured1);
//					numFaculty++;
//					Faculty();
//					}
//					if(numFaculty == 1) {
//						System.out.println("Enter in the info in this order: Name, Birth Year, Dept name, Is/Is not tenured.");
//						faculty2Name = scnr.next();
//						faculty2BirthYear = scnr.nextInt();
//						faculty2Dept = scnr.next();
//						isTenured2 = scnr.nextBoolean();
//						
//						f2 = new Faculty(faculty2Name, faculty2BirthYear, faculty2Dept, isTenured2);
//						numFaculty++;
//						Faculty();
//					}
//					if(numFaculty == 2) {
//						System.out.println("Enter in the info in this order: Name, Birth Year, Dept name, Is/Is not tenured.");
//						faculty3Name = scnr.next();
//						faculty3BirthYear = scnr.nextInt();
//						faculty3Dept = scnr.next();
//						isTenured3 = scnr.nextBoolean();
//						
//						f3 = new Faculty(faculty3Name, faculty3BirthYear, faculty3Dept, isTenured3);
//						numFaculty++;
//						Faculty();
//					}
//					if(numFaculty == 3) {
//						System.out.println("You can only add 3 Faculty. Please choose another option.");
//						Faculty();
//						}
//		        case 2:
//		            if(numFaculty == 1) {
//		                System.out.println(f1.toString());
//	                    }
//	               else if (numFaculty == 2) {
//	                    System.out.println(f1.toString() + "\n" + f2.toString());
//	                    }
//	                else if (numFaculty == 3) {
//		                System.out.println(f1.toString() + "\n" + f2.toString() + "\n" + f3.toString());
//	                    }
//		                Faculty();
//		        case 3:
//		        	if(numCourses == 0) {
//		        		System.out.println("Please create a course before chossing this option.");
//		        	    Faculty();
//		        	}
//		        	if(numFaculty == 0) {
//		        		System.out.println("Please create a Faculty before chooosing this option.");
//		        		Faculty();
//		        	}
//		        	System.out.println("Enter the number of the course to add and Faculty to add to");
//		        	int courseToAdd = scnr.nextInt();
//		        	int fac = scnr.nextInt();
//		        	if(courseToAdd > numCourses || courseToAdd < 1) {
//		        		System.out.println("Invalid choice");
//		        	}
//		        	else {
//		        		switch (fac) {
//		        		case 1:
//		        			if(courseToAdd == 1) {
//		        				f1.addCourseTaught(c1);
//		        				Faculty();
//		        			}
//		        			else if (courseToAdd == 2) {
//		        				f1.addCourseTaught(c2);
//		        			}
//		        			else {
//		        				f1.addCourseTaught(c3);
//		        			}
//		        			Faculty();
//		        		case 2:
//		        			if(courseToAdd == 1) {
//		        				f2.addCourseTaught(c1);
//		        			}
//		        			else if (courseToAdd == 2) {
//		        				f2.addCourseTaught(c2);
//		        			}
//		        			else {
//		        				f2.addCourseTaught(c3);
//		        			}
//		        			Faculty();
//		        		case 3:
//		        			if(courseToAdd == 1) {
//		        				f3.addCourseTaught(c1);
//		        			}
//		        			else if (courseToAdd == 2) {
//		        				f3.addCourseTaught(c2);
//		        			}
//		        			else {
//		        				f3.addCourseTaught(c3);
//		        			}
//		        			Faculty();
//		        		}	
//		        	}
//				case 5:
//					MainMenu();
//					break;
//					
//					
//				}
//	}
//	public static void GeneralStaff() throws IOException {
//		System.out.println("Welcome to the Staff section " + name + ". Please enter a number to select a action.");
//		System.out.println("1 - Create a new Faculty\n2-Print Info\n5 - Exit Database");
//		int choice = scnr.nextInt();
//		switch (choice) {
//		
//		case 1:
//			if(numStaff == 0) {
//			System.out.println("Enter in the info in this order: Name, Birth Year, Dept name, Duty.");
//			gs1Name = scnr.next();
//     		gs1BirthYear = scnr.nextInt();
//			gs1Dept = scnr.next();
//			gs1Duty = scnr.next();
//			
//			g1 = new GeneralStaff(gs1Name, gs1BirthYear, gs1Dept, gs1Duty);
//			numStaff++;
//			GeneralStaff();
//			}
//			if(numStaff == 1) {
//				System.out.println("Enter in the info in this order: Name, Birth Year, Dept name, Duty.");
//				gs2Name = scnr.next();
//				gs2BirthYear = scnr.nextInt();
//			    gs2Dept = scnr.next();
//				gs2Duty = scnr.next();
//				
//				g2 = new GeneralStaff(gs2Name, gs2BirthYear, gs2Dept, gs2Duty);
//				numStaff++;
//				GeneralStaff();
//			}
//			if(numStaff == 2) {
//				System.out.println("Enter in the info in this order: Name, Birth Year, Dept name, Duty.");
//				gs3Name = scnr.next();
//				gs3BirthYear = scnr.nextInt();
//				gs3Dept = scnr.next();
//				gs3Duty = scnr.next();
//				
//				g3 = new GeneralStaff(gs3Name, gs3BirthYear, gs3Dept, gs3Duty);
//				numStaff++;
//				GeneralStaff();
//			}
//			if(numStaff == 3) {
//				System.out.println("You can only add 3 Faculty. Please choose another option.");
//				GeneralStaff();
//			}
//		case 2:
//		if(numStaff == 1) {
//			System.out.println(g1.toString());
//		}
//		else if (numStaff == 2) {
//			System.out.println(g1.toString() + "\n" + g2.toString());
//		}
//		else if(numStaff == 3) {
//			System.out.println(g1.toString() + "\n" + g2.toString() + "\n" + g3.toString());
//		    GeneralStaff();
//		}
//		case 5:
//			MainMenu();
//			break;
//			
//			
//		}
//		
//	}
//	public static void Students() throws IOException {
//		System.out.println("Welcome to the Student section " + name + ". Please enter a number to select a action.");
//		System.out.println("1 - Create a new Student\n2 - Add course\n3- Print Information\n5 - Exit Database");
//		int choice = scnr.nextInt();
//		switch (choice) {
//		case 1:
//			if(numStudents == 0) {
//			System.out.println("Enter in the info in this order: Name, Birth Year, Major, Grad/Undergrad.");
//			s1Name = scnr.next();
//			s1BirthYear = scnr.nextInt();
//			s1Major = scnr.next();
//			isUG1 = scnr.nextBoolean();
//			
//			s1 = new Student(s1Name, s1BirthYear, s1Major, isUG1);
//			numStudents++;
//			Students();
//			}
//			if(numStudents == 1) {
//				System.out.println("Enter in the info in this order: Name, Birth Year, Major, Grad/Undergrad.");
//    			s2Name = scnr.next();
//				s2BirthYear = scnr.nextInt();
//				s2Major = scnr.next();
//				isUG2 = scnr.nextBoolean();
//				
//				s2 = new Student(s2Name, s2BirthYear, s2Major, isUG2);
//			    numStudents++;
//			    Students();
//			}
//			if(numStudents == 2) {
//				System.out.println("Enter in the info in this order: Name, Birth Year, Major, Grad/Undergrad.");
//				s3Name = scnr.next();
//				s3BirthYear = scnr.nextInt();
//				s3Major = scnr.next();
//      			isUG3 = scnr.nextBoolean();
//				
//				s3 = new Student(s3Name, s3BirthYear, s3Major, isUG3);
//				numStudents++;
//				Students();
//			}
//			if(numStudents == 3) {
//				System.out.println("You can only add 3 Students. Please choose another option.");
//				Students();
//			}
//		case 2:
//			if(numCourses == 0) {
//        		System.out.println("Please create a course before chossing this option.");
//        	    Faculty();
//        	}
//        	if(numStudents == 0) {
//        		System.out.println("Please create a Student before chooosing this option.");
//        		Faculty();
//        	}
//        	System.out.println("Enter the number of the course to add and Student to add to");
//        	int courseToAdd = scnr.nextInt();
//        	int stu = scnr.nextInt();
//        	if(courseToAdd > numCourses || courseToAdd < 1) {
//        		System.out.println("Invalid choice");
//        	}
//        	else {
//        		switch (stu) {
//        		case 1:
//        			if(courseToAdd == 1) {
//        				s1.addCourseTaken(c1);
//        				Students();
//        			}
//        			else if (courseToAdd == 2) {
//        				s1.addCourseTaken(c2);
//        				Students();
//        			}
//        			else {
//        				s1.addCourseTaken(c3);
//        			}
//        			Students();
//        		case 2:
//        			if(courseToAdd == 1) {
//        				s2.addCourseTaken(c1);
//        			}
//        			else if (courseToAdd == 2) {
//        				s2.addCourseTaken(c2);
//        			}
//        			else {
//        				s2.addCourseTaken(c3);
//        			}
//        			Faculty();
//        		case 3:
//        			if(courseToAdd == 1) {
//        				s3.addCourseTaken(c1);
//        			}
//        			else if (courseToAdd == 2) {
//        				s3.addCourseTaken(c2);
//        			}
//        			else {
//        				s3.addCourseTaken(c3);
//        			}
//        			Faculty();
//        		}	
//        	}
//		case 3:
//		if(numStudents == 1) {
//		System.out.println(s1.toString());
//	}
//     else if (numStudents == 2) {
//		System.out.println(s1.toString() + "\n" + s2.toString());
//	}
//	else if (numStudents == 3) {
//		System.out.println(s1.toString() + "\n" + s2.toString() + "\n" + s3.toString());
//	}
//		Students();
//		case 5:
//			MainMenu();
//			break;
//			}
//		}
//       public static void PrintInfo() throws IOException {
		Scanner scnr = new Scanner(System.in);
		Scanner scanner = new Scanner(System.in);
        FileInputStream  x = null;
	    String fileName = "SchoolDB_Initial.txt";
    	File f = null;

		// System.out.println("What is the name of your file?");
		// fileName = scnr.nextLine();
		f = new File(fileName);
		x = new FileInputStream(fileName);
		scanner = new Scanner(x);
		while (scanner.hasNextLine()) {
			System.out.println(scanner.nextLine());
		}
		Course c = new Course(true, 771, "MAT", 4);
		Course d = new Course(true, 777, "CMP", 4);
		Course e = new Course(true, 711, "CMP", 4);
		Course g = new Course(true, 723, "MAT", 4);
		Course h = new Course(false, 168, "CMP", 4);
		Course i = new Course(false, 338, "CMP", 4);
		System.out.println("");
		System.out.println("**************************************************************");
     	System.out.println("SCHOOL DATABASE INFO:");
     	System.out.println("");
		System.out.println("************************************************");
		System.out.println("COURSES:");
		System.out.println(c.toString() + "\n" + d.toString() + "\n" + e.toString() + "\n" + g.toString() + "\n" + h.toString() + "\n" + i.toString());
		if(numCourses == 1) {
		    System.out.println(c1.toString());
		}
		else if (numCourses == 2) {
			System.out.println(c1.toString() + "\n" + c2.toString());
		}
		else if(numCourses == 3) {
			System.out.println(c1.toString() + "\n" + c2.toString() + "\n" + c3.toString());
		}
		System.out.println("************************************************");
		System.out.println("************************************************");
		System.out.println("PERSONS:");
		System.out.println("************************************************");
		System.out.println("************************************************");
		System.out.println("EMPLOYEES:");
		System.out.println("************************************************");
		System.out.println("************************************************");
		System.out.println("GENERAL STAFF:");
		
		Faculty m = new Faculty();
		Faculty n = new Faculty(true);
		Faculty o = new Faculty("MAT", false);
		Faculty p = new Faculty("Superman",  1938, "PHY", true);
		
		GeneralStaff j = new GeneralStaff();
		GeneralStaff k = new GeneralStaff("advise students");
		GeneralStaff z = new GeneralStaff("Sanitation", "clean");
		GeneralStaff l = new GeneralStaff("Flash Gordon", 1934, "Security", "safety");
		
		System.out.println(j.toString() + "\n" + k.toString() + "\n" + z.toString() + "\n" + l.toString());
		if(numStaff == 1) {
			System.out.println(g1.toString());
		}
		else if (numStaff == 2) {
			System.out.println(g1.toString() + "\n" + g2.toString());
		}
		else if(numStaff == 3) {
			System.out.println(g1.toString() + "\n" + g2.toString() + "\n" + g3.toString());
		}
		System.out.println("************************************************");
		System.out.println("************************************************");
		System.out.println("FACULTY:");
		
		System.out.println(m.toString() + "\n" + n.toString() + "\n" + o.toString() + "\n" + p.toString());
		if(numFaculty == 1) {
			System.out.println(f1.toString());
		}
		else if (numFaculty == 2) {
		System.out.println(f1.toString() + "\n" + f2.toString());
		}
		else if (numFaculty == 3) {
			System.out.println(f1.toString() + "\n" + f2.toString() + "\n" + f3.toString());
		}
		System.out.println("************************************************");
		System.out.println("************************************************");
		System.out.println("STUDENTS:");
		
		Student q = new Student();
		Student r = new Student(false);
		Student s = new Student("Math", false);
		Student t = new Student("Wonderwoman", 1941, "JST", true);
		
		System.out.println(q.toString() + "\n" + r.toString() + "\n" + s.toString() + "\n" + t.toString());
		if(numStudents == 1) {
			System.out.println(s1.toString());
		}
	      else if (numStudents == 2) {
			System.out.println(s1.toString() + "\n" + s2.toString());
		}
		else if (numStudents == 3) {
			System.out.println(s1.toString() + "\n" + s2.toString() + "\n" + s3.toString());
		}
		System.out.println("************************************************");
		System.out.println("**************************************************************");
		System.out.println("");
		scanner.close();
		x.close();
	}
}


