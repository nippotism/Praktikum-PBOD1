public class Main {
    
    public static void main(String[] args) {
        
        // Create a new course
        Course course1 = new Course("C001", "Pemrorgraman Beroientasi Objek");
        Course course2 = new Course("C002", "Manajemen Basis Data");
        Course course3 = new Course("C003", "Competitive Programming");
        

        Lecture lecturer1 = new Lecture("Musa ", 18, "Jl. Pegansaan Timur 18 ", 1001);
        Lecture lecturer2 = new Lecture("Tretan Msulim", 20, "Jl. Pandan Utara", 1002);
        

        Student student1 = new Student("Budiman Sujatmiko", 53, "Jl. Parang Baris Raya", 2001);
        Student student2 = new Student("Rosi Siandre", 40, "Jl. Genuk Barat 15", 2002);



        course1.addLecture(lecturer1);
        course2.addLecture(lecturer2);
        course3.addLecture(lecturer1);
        

        student1.enrollInCourse(course1);
        student1.enrollInCourse(course2);
        student2.enrollInCourse(course1);
        student2.enrollInCourse(course3);
        

        lecturer1.viewTaughtCourses();
        lecturer2.viewTaughtCourses();
    
        course1.viewEnrolledStudents();
        course2.viewEnrolledStudents();
        course3.viewEnrolledStudents();
        
        student1.viewEnrolledCourses();
        student2.viewEnrolledCourses();
    }
}
