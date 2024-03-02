/*Nama : Syariful Hanif Setiawan
  NIM : 24060122130095
  Program : Main.java
 
 */

public class Main {
    

    public static void main(String[] args) {
        
        Student s1,s2;
        Course matkul1,matkul2;
        Lecture dosen1;



        s1 = new Student("Adian Napitupulu", "DAPIL Jawa Tengah I", "2601295", 19);
        s2 = new Student("Habiburokhman", "DAPIL Jakarta I", "12345", 22);

        dosen1 = new Lecture("Prabowo Subianto", "Hambalang", "12333", 72);
        

        matkul1 = new Course("PAIK1", "Pertahanan Negara",dosen1);
        matkul2 = new Course("PAIK2", "Basis Data", dosen1);
        
        dosen1.teachCourse(matkul1);
        dosen1.teachCourse(matkul2);  

        s2.getDetail();
        s1.getDetail();
        s1.enrollCourse(matkul1);
        s1.enrollCourse(matkul2);
        s2.enrollCourse(matkul2);
        matkul2.addStudent(s1);
        matkul2.addStudent(s2);
        s1.viewenrolledCourse();
        s2.viewenrolledCourse();
        matkul2.viewenrolledStudent();
        dosen1.viewCourse();
    


    }
}
