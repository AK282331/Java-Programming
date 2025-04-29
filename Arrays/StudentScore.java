import java.util.Scanner;
import java.util.Arrays;

class Student{
	int rollNumber;
	String name;
	String Class;
	double[] marks = new double[3]; //array of marks which store 3 subjects marks
	double total_marks = 0; //variable which hold the total marks the student scored.
	
	void add_student(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Write the Roll number of the student");
		this.rollNumber = sc.nextInt();
		System.out.println("Write the Name of the student");
		this.name = sc.next();
		System.out.println("Write the class of the student");
		this.Class = sc.next();	
		System.out.println("Write the Marks of the student for 3 Subjects");
		for (int i = 0; i < 3; i++){
			System.out.println("Write " + (i+1) + " subject marks");
			marks[i] = sc.nextInt();
		}
		
		for(int j = 0; j < 3; j++){
			total_marks = total_marks + marks[j];
		}
	}
	
	
	void display_student(){
		System.out.println(" ");
		System.out.println("Name of the student: " + name);
		System.out.println("Roll Number of the student: " + rollNumber);
		System.out.println("Class of the student: " + Class);
		System.out.println("Total Marks of the student: " + total_marks);
		System.out.println("******************************************");
	}
	
	
	
}


public class StudentScore{
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("For how many students you want to create the system? Should be same as the number of students you want to add");
		int n = sc.nextInt();
		Student[] ArrObjStudents = new Student[n];
		while(true){
			System.out.println("Welcome to student score handling");
			System.out.println("Enter 1 if you want to add a new student");
			System.out.println("Enter 2 to display all the students");
			System.out.println("Enter 3 to display the student with a roll number");
			System.out.println("Enter 4 to display the average of the class");
			System.out.println("Enter 5 if you want to see the name and score of students who failed in the exam");
			System.out.println("Enter 6 if you want to remove details of a student");
			System.out.println("Enter 7 if you want to to display the students in the sorted order of names");
			System.out.println("Enter 8 to display the top Scorers name etc.");
			System.out.println("Enter 9 to exit from the menu");
			
			int choice = sc.nextInt();
			if(choice == 1){
				System.out.println("How many students you want to add?");
				int l = sc.nextInt();
				for(int i = 0; i < l; i++){
					Student objStudent = new Student();
					objStudent.add_student();
					ArrObjStudents[i] = objStudent;
					System.out.println("Student Added Successfully");
				}
			}
			
			else if(choice == 2){
				System.out.println("Below is the list of the students");
				for(int i = 0; i < ArrObjStudents.length; i++){
					
					ArrObjStudents[i].display_student();
				}
			}
			
			else if(choice == 3){
				System.out.println("Write the roll number of the student");
				int rnum = sc.nextInt();
				for (int i = 0; i < n; i++){
					Integer roll = ArrObjStudents[i].rollNumber;
					if (roll != null){
						if(roll == rnum){
							ArrObjStudents[i].display_student();
					}
					}
					else {
						System.out.println("Student doesn't exist");
					}
					
				}
				
			}
			
			else if(choice == 4){
				System.out.println("Write the Class for which you want to calculate the average");
				String avgclass = sc.next();
				double class_total = 0;
				int counter = 0;
				for (int i = 0; i < n; i++){
					String cls = ArrObjStudents[i].Class;
					if (avgclass.equals(cls)){
						counter = counter + 1;
						class_total = ArrObjStudents[i].total_marks + class_total;
					}
				}
				System.out.println("Average marks of " + avgclass + " is " + (class_total / counter));
				
			}
			
			else if(choice == 5){
				System.out.println("Below is the list of the students who are failed got less than 40%");
				for (int i = 0; i < n; i++){
					if(ArrObjStudents[i].total_marks < 40){
						ArrObjStudents[i].display_student();
					}
				}
			}
			
			else if (choice == 6){
				System.out.println("Write the roll number of the student which you want to remove");
				int rnum = sc.nextInt();
				for(int i = 0; i < n; i++){
					if(ArrObjStudents[i].rollNumber == rnum){
							ArrObjStudents[i] = null;
					}
				
				}
				System.out.println("Student removed Successfully");
			}
			
			else if (choice == 7){
				String[] names = new String[n];
				for(int i = 0; i < n; i++){
					names[i] = ArrObjStudents[i].name;
				}
				System.out.println("Sorted Order of names");
				Arrays.sort(names);
				System.out.println(Arrays.toString(names));
				
				
			}
			
			else if (choice == 8){
				double[] smarks = new double[n];
				for(int i = 0; i < n; i++){
					smarks[i] = ArrObjStudents[i].total_marks;
				}
				int pos = 0;
				double high = smarks[0];
				for(int j = 0; j < n; j++){
					if(high < smarks[j]){
						high = smarks[j];
						pos = j;
					}
				}
				ArrObjStudents[pos].display_student();
			}
			
			else if (choice == 9){
				break;
			}
			
			
		}
		
		
		
		
		
	}
}