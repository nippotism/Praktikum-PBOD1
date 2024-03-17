public class Person {
    
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void getDetails() {
        System.out.println("Name\t: " + name);
        System.out.println("Age\t: " + age);
    }
}
