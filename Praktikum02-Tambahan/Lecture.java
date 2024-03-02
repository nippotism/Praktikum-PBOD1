/*Nama : Syariful Hanif Setiawan
  NIM : 24060122130095
  Program : Lecture.java
 
 */


import java.util.List;
import java.util.ArrayList;


public class Lecture {

    private String name,address,EmployeeID;
    private int age;
    private List<Course> courseTaught;


    Lecture(String name, String address, String EmployeeID, int age) {
        this.name = name;
        this.address = address;
        this.EmployeeID = EmployeeID;
        this.age = age;
        courseTaught = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getEmployeeID() {
        return EmployeeID;
    }

    public int getAge() {
        return age;
    }

    public List<Course> getCourses(){
        return courseTaught;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setEmployeeID(String EmployeeID) {
        this.EmployeeID = EmployeeID;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void getDetail(){
        System.out.println("Nama   : "+getName());
        System.out.println("Alamat : "+getAddress());
        System.out.println("NIP    : "+getEmployeeID());
        System.out.println("Umur   : "+getAge());
    }
   

    public void teachCourse(Course C){
        
        courseTaught.addLast(C);
    }

    public void viewCourse(){

        

        System.out.println("--Daftar Course yang diajar oleh "+getName()+" :");

        if(getCourses().isEmpty()){
            System.out.println("  Kosong.");
            return;
        }
        for (int i = 0; i < getCourses().size(); i++) {
            System.out.println("  "+(i+1)+". "+getCourses().get(i).getCourseCode()+" : "+getCourses().get(i).getCourseName());
        }


    }
    
}
