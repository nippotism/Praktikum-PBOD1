/* 
 * File      : Lecture.java 28/02/24
 * Penulis   : Arifin Nurmuhammad Haris
 * Deskripsi : File Kelas Lecture
 */

 import java.util.List;
 import java.util.ArrayList;
 
 public class Lecture extends Person{
     private String address;
     private int employeeID;
     private List<Course> coursesTaught;
     static List<Lecture> lecturers = new ArrayList<>();
 
     public Lecture(String name, int age, String address, int employeeID) {
         
         super(name, age);
         this.address = address;
         this.employeeID = employeeID;
         this.coursesTaught = new ArrayList<>();
         lecturers.add(this);
     }

     public String getNameLecture(){

        return super.getName();
     }

    public int getAgeLecture(){
    
        return super.getAge();
    }
 
    
 
     public String getAddress() {
         return address;
     }
 
     public int getEmployeeID() {
         return employeeID;
     }

     public void setAddress(String address) {
         this.address = address;
     }
 
     public void setEmployeeID(int employeeID) {
         this.employeeID = employeeID;
     }
 
     public void getDetails() {
         super.getDetails();
         System.out.println("Lecturer Address: " + getAddress());
         System.out.println("Lecturer ID\t: " + getEmployeeID());
     }
 
     public void teachCourse(Course course) {
         if (!coursesTaught.contains(course)) {
             coursesTaught.add(course);
             course.addLecture(this);
         }
     }
 
     public void viewTaughtCourses() {
         System.out.println("Courses taught by " + getNameLecture() + ":");
         for (int i = 0; i < coursesTaught.size(); i++) {
             System.out.println((i + 1) + ".");
             coursesTaught.get(i).getDetails();
         }
     }
 }