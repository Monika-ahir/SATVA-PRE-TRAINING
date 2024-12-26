// Person class
class Person {
  // Properties
  private String name;
  private int age;

  // Constructor
  public Person(String name, int age) {
      this.name = name;
      this.age = age;
  }

  // Method to display details
  public void displayDetails() {
      System.out.println("Name: " + this.name);
      System.out.println("Age: " + this.age);
  }
}

// Main class to test the Person class
public class Intro {
  public static void main(String[] args) {
      // Create an object
      Person person1 = new Person("Monika", 20);

      // Call the method
      person1.displayDetails();
  }
}
