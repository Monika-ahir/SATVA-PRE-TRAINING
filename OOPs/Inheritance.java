class Person {
    public String name;
    public int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age > 0) {
            this.age = age;
        } else {
            System.out.println("Age must be positive.");
        }
    }

    public void displayDetails() {
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
    }
}

class Student extends Person {
    private String course;

    public Student(String name, int age, String course) {
        super(name, age);
        this.course = course;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void displayDetails() {
        super.displayDetails();
        System.out.println("Course: " + getCourse());
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Student student1 = new Student("Monika", 20, "IT");
        student1.displayDetails();
    }
}
