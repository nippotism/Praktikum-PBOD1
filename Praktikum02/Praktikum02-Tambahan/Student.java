/*Nama : Syariful Hanif Setiawan
  NIM : 24060122130095
  Program : Student.java
 
 */




import java.util.List;
import java.util.ArrayList;


public class Student {

    private String name,address,studentID;
    private int age;
    private List<Course> enrolled;


    Student(String name, String address, String studentID, int age) {
        this.name = name;
        this.address = address;
        this.studentID = studentID;
        this.age = age;
        this.enrolled = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getStudentID() {
        return studentID;
    }

    public int getAge() {
        return age;
    }

    public List<Course> getEnrolled(){
        return enrolled;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void getDetail(){
        System.out.println("----------------");
        System.out.println("Nama   : "+name);
        System.out.println("Alamat : "+address);
        System.out.println("NIM    : "+studentID);
        System.out.println("Umur   : "+age);
        System.out.println("----------------");
    }

    public void enrollCourse(Course course){
        
        getEnrolled().addLast(course);
        course.addStudent(this);
    }

    public void viewenrolledCourse(){

        

        System.out.println("--Daftar Course yang diambil oleh "+getName()+" :");

        if(getEnrolled().isEmpty()){
            System.out.println("  Kosong.");
            return;
        }
        for (int i = 0; i < enrolled.size(); i++) {
            System.out.println("  "+(i+1)+". "+enrolled.get(i).getCourseName()+" ("+enrolled.get(i).getCourseCode()+")");
            System.out.println("     Pengajar: "+enrolled.get(i).getLecture().get(0).getName());
        }


    }

    

    
}
