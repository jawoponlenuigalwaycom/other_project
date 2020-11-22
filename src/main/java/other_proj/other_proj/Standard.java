package other_proj.other_proj;

import org.joda.time.DateTime;

import ct417.ct417.*;

public class Standard {
    
	Course course;
	Module module;
	Student student;
		
	
	public static void main(String args[]) {
		   DateTime date1 = new DateTime("2020-12-07");
		   DateTime date2 = new DateTime("2024-12-07");
		   DateTime date3 = new DateTime("2020-12-04");
		   DateTime date4 = new DateTime("2022-12-04");
		
		 //List of courses
        Course cour = new Course("Science",date1,date2);
		Course cour1 = new Course("Engineering",date3,date4);
		Course cour3 = new Course("Advance Masters",date1,date4);


        //List of modules
        Module mod1 = new Module("maths","CT13");
		Module mod2 = new Module("Magnetics","CT56");
		Module mod3 = new Module ("communications","CT24");
		Module mod4 = new Module ("signal","CT24");
		Module mod5 = new Module ("programming","CT24");

        
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
        
        mod5.setStudent(students6);
        mod5.setStudent(students7);
        
        mod4.setStudent(students3);

		//Adding modules to courses
		cour.setModule(mod1);
		cour.setModule(mod2);
        cour.setModule(mod3);
        
        cour1.setModule(mod1);
        cour1.setModule(mod3);

        cour3.setModule(mod4);
        cour3.setModule(mod5);


        //Print out results
        System.out.println(cour);
        System.out.println(cour.getModule());
        
        System.out.println(cour1);
        System.out.println(cour1.getModule());
        
        System.out.println(cour3);
        System.out.println(cour3.getModule());
  
  
        System.out.println("\nStudent "+ students1+ "\tis registered to the following modules w/ associated students" + students1.getModule());
        System.out.println("\nStudent "+ students2+ "\tis registered to the following modules w/ associated students" + students1.getModule());
        System.out.println("\nStudent "+ students3+ "\tis registered to the following modules w/ associated students" + students1.getModule());
        System.out.println("\nStudent "+ students4+ "\tis registered to the following modules w/ associated students" + students1.getModule());
        System.out.println("\nStudent "+ students6+ "\tis registered to the following modules w/ associated students" + students1.getModule());
        System.out.println("\nStudent "+ students7+ "\tis registered to the following modules w/ associated students" + students1.getModule());



        System.out.println("\nModule "+ mod3.getName()+"is in the following courses\n\t" + mod3.getCourse());
        System.out.println("\nModule "+ mod1.getName()+"is in the following courses\n\t" + mod1.getCourse());
        System.out.println("\nModule "+ mod2.getName()+"is in the following courses\n\t" + mod2.getCourse());
        System.out.println("\nModule "+ mod4.getName()+"is in the following courses\n\t" + mod4.getCourse());

        System.out.println("\nModule "+ mod3.getName()+" has the following students"+ mod3);
        System.out.println("\nModule "+ mod1.getName()+" has the following students"+ mod1);
        System.out.println("\nModule "+ mod2.getName()+" has the following students"+ mod2);
        System.out.println("\nModule "+ mod4.getName()+" has the following students"+ mod4);
	
	  System.out.println("\n"+students4.getName()+"\tenrolled in following courses\n" +students4.getCourse());
      System.out.println("\n"+students2.getName()+"\tenrolled in following courses\n" +students2.getCourse());
      System.out.println("\n"+students3.getName()+"\tenrolled in following courses\n" +students3.getCourse());
      System.out.println("\n"+students7.getName()+"\tenrolled in following courses\n" +students7.getCourse());
	}
}
