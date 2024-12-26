class Person {
    private String name;
    private int age;

    public Person(){}
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

public class Encapsulation {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setName("Monika");
        person1.setAge(20);
        person1.displayDetails();
        person1.setAge(-5);
    }
}
