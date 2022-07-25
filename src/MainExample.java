import java.util.Scanner;

public class MainExample {
    public static  void  main(String args[])
    {
        School abc= new School();


        Scanner input=new Scanner(System.in);

        while (true)
        {
            System.out.println("ENTER 1 To ADD A STUDENT IN SCHOOL");
            System.out.println("ENTER 2 To SEARCH A STUDENT IN SCHOOL");
            System.out.println("ENTER 3 To REMOVE A STUDENT IN SCHOOL");

            System.out.println("ENTER 4 To ADD A TEACHER IN SCHOOL");
            System.out.println("ENTER 5 To SEARCH A TEACHER IN SCHOOL");
            System.out.println("ENTER 6 To REMOVE A STUDENT IN SCHOOL");

            System.out.println("ENTER 7 To ADD A CLASSROOM IN SCHOOL");
            System.out.println("ENTER 8 To SEARCH A CLASSROOM IN SCHOOL");
            System.out.println("ENTER 9 To REMOVE A CLASSROOM IN SCHOOL");

            System.out.println("ENTER 10 To PRINT NAMES OF ALL STUDENTS   IN SCHOOL");
            System.out.println("ENTER 11 To PRINT NAMES OF ALL TEACHERS   IN SCHOOL");
            System.out.println("ENTER 12 To PRINT NAMES OF ALL CLASSROOMS IN SCHOOL");
            System.out.println("---ENTER 0 to EXIT THE PROGRAM----");


            int choice=input.nextInt();
             if(choice==0)
            {
                break;
            }

             if(choice==1)
             {
                 //todo add a student
                 Student newStudent=createNewStudent();
                 abc.addStudent(newStudent);

             }

            if(choice==2)
            {
                //todo Search a Student
                System.out.println("Please enter Student name");
                Scanner scan= new Scanner(System.in);
                Student student= abc.searchStudent(scan.nextLine());
               if(student!=null){
                   student.printMyInfo();
               }else {
                   System.out.println("NOT FOUND");
               }

            }
            if(choice==3)
            {
                //todo Remove a student
            }



        }


    }


    public  static  Student createNewStudent()
    {
        Student student= new Student();
        Scanner inputString=new Scanner(System.in);
        Scanner inputInt=new Scanner(System.in);
        System.out.println("Please enter Student ID");
        int id=inputInt.nextInt();
        student.setId(id);
        System.out.println("Please enter Student NAME");
        student.setName(inputString.nextLine());
        System.out.println("Please enter Student COURSE");
        student.setCourse(inputString.nextLine());
        System.out.println("Please enter Student Phone");
         student.setPhone(inputString.nextLine());
         System.out.println("Please enter Student Address");
         student.setAddress(inputString.nextLine());

         return  student;


    }
}
