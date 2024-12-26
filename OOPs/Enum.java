enum Role {
    STUDENT,
    EMPLOYEE,
    RETIRED
}

class Person {
    private String name;
    private int age;
    private Role role; 

    public Person(String name, int age, Role role) {
        this.name = name;
        this.age = age;
        this.role = role;
    }

    public void displayDetails() {
        System.out.println("Name: " + name + ", Age: " + age + ", Role: " + role);
    }
}

public class Enum {
    public static void main(String[] args) {
        Person person1 = new Person("John", 30, Role.EMPLOYEE);
        Person person2 = new Person("Alice", 22, Role.STUDENT);
        Person person3 = new Person("Bob", 65, Role.RETIRED);

        person1.displayDetails();
        person2.displayDetails();
        person3.displayDetails();
    }
}
