interface Worker {
    void work();
}

interface Learner {
    void study();
}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayDetails() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

class Employee extends Person implements Worker {
    public Employee(String name, int age) {
        super(name, age);
    }

    @Override
    public void work() {
        System.out.println("Employee is working");
    }
}

class Student extends Person implements Learner {
    public Student(String name, int age) {
        super(name, age);
    }

    @Override
    public void study() {
        System.out.println("Student is studying");
    }
}

public class InterFace {
    public static void main(String[] args) {
        Person person1 = new Employee("Monika", 20);
        Person person2 = new Student("Nisha", 15);

        person1.displayDetails();
        ((Employee) person1).work();

        person2.displayDetails();
        ((Student) person2).study();
    }
}
