package other_proj.other_proj;

import ct417.ct417.Course;
import ct417.ct417.Module;
import ct417.ct417.Student;

public class Standard {
    
    Course course;
    Module module;
    Student student;

	public static void main(String args[]) {

       //List of courses
        Course cour = new Course("Science",null,null);
		Course cour1 = new Course("Engineering",null,null);

        //List of modules
        Module mod1 = new Module("maths","CT13");
		Module mod2 = new Module("Magnetics","CT56");
		Module mod3 = new Module ("communications","CT24");
        
        //List of Students
		Student students1 =  new Student("kelly",19,100);
		Student students2 =  new Student("lilly",20,300);
		Student students3 =  new Student("Adam",21,400);
        Student students4 =  new Student("Sean",20,350);
        Student students6 =  new Student("Ben",20,350);
        Student students7 =  new Student("George",20,350);

        //Adding students to modules
		mod1.setStudent(students1);
        mod1.setStudent(students2);
        mod1.setStudent(students3);
        mod1.setStudent(students4);

        mod2.setStudent(students1);
        mod2.setStudent(students2);

        mod3.setStudent(students6);
        mod3.setStudent(students7);
        mod3.setStudent(students3);


		//Adding modules to courses
		cour.setModule(mod1);
		cour.setModule(mod2);
        cour.setModule(mod3);
        
        cour1.setModule(mod1);
        cour1.setModule(mod3);

        //Print out results
        System.out.println(cour);
        System.out.println(cour1);


	}

}
