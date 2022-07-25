import java.util.ArrayList;
import java.util.Locale;

public class School {
    String  schoolName;
    Teacher principal;
    ArrayList<Student>  students= new ArrayList<>();

    ArrayList<Teacher>   teachers= new ArrayList<>();

    ArrayList<Classroom> classrooms= new ArrayList<>();


    public  void  addStudent(Student student)
    {


        students.add(student);
    }

    public Student searchStudent(String studentName){
        Student student=null;

        for(int i=0;i<students.size();i++)
        {
            if(studentName.toLowerCase(Locale.ROOT).equals(students.get(i).getName().toLowerCase()))
            {
                student=students.get(i);

                break;
            }
        }

        return  student;


    }

    public  void  removeStudent(int studentID)
    {

       boolean flag=false;

        for(int i=0;i<students.size();i++)
        {
            if(students.get(i).getId()==studentID)
            {
                students.remove(i);
                flag=true;
                break;
            }
        }

        if(flag==false)
        {
            System.out.println("NO STUDENT FOUND WITH THE GIVEN ID");
        }

    }

    public  void addTeacher(Teacher teacher){
        teachers.add(teacher);

    }


    public  Teacher  searchTeacher(String empCode){

        return  null;
    }

    public  void  removeTeacher(String empCode){

    }

    //todo need to create same methods for classroom



}
