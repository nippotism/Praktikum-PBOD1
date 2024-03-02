/*Nama : Syariful Hanif Setiawan
  NIM : 24060122130095
  Program : Course.java
 
 */



import java.util.List;
import java.util.ArrayList;


public class Course {
    
    private String courseCode,courseName;
    private Lecture lecture;
    private List<Student> studentsEnrolled;


    Course(String courseCode, String courseName, Lecture lecture) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.lecture = lecture;
        studentsEnrolled = new ArrayList<>();
    }

    public String getCourseCode() {
        return courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public Lecture getLecture() {
        return lecture;
    }

    public List<Student> getstudentEnrolled(){
        return studentsEnrolled;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setLecture(Lecture lecture) {
    
        this.lecture = lecture;
        
    }

    public void addStudent(Student S){

        studentsEnrolled.addLast(S);
    }

    public void removeStudent(Student S){

        studentsEnrolled.remove(S);
    }

    public void viewenrolledStudent(){

        System.out.println("--Daftar Mahasiswa yang mengambil Mata Kuliah "+getCourseName()+" :");

        for(int i = 0;i<studentsEnrolled.size();i++){
    
            System.out.println("  "+(i+1)+". "+getstudentEnrolled().get(i).getName());
        }
    }



}
