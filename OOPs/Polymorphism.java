class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    //polymorphism of displayDetails() method
    public void displayDetails() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    // Overloaded method with a different number of parameters
    public void displayDetails(String address) {
        System.out.println("Name: " + name + ", Age: " + age + ", Address: " + address);
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Person person1 = new Person("Monika",20);
        person1.displayDetails();  // Calls the method with no address
        person1.displayDetails("Ahmedabad,gujarat,india,3800015");  // Calls the method with address as parameter
    }
}
