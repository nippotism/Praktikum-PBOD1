/* 
 * File      : SerializePerson.java    15/05/24
 * Penulis   : Syariful Hanif
 * Deskripsi : Program untuk serialisasi objek Person
 */

import java.io.*;

// class Person
class Person implements Serializable {
    private String name;

    public Person(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }
}

// class SerializePerson
public class SerializePerson {
    public static void main(String[] args) {
        Person person = new Person("Panji");
        try {
            FileOutputStream f = new FileOutputStream("person.ser");
            ObjectOutputStream s = new ObjectOutputStream(f);
            s.writeObject(person);
            System.out.println("selesai menulis objek person");
            s.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}