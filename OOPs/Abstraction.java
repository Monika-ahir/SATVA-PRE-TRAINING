abstract class Person {
  public String name;
  public int age;

  public Person(String name, int age) {
      this.name = name;
      this.age = age;
  }

  public abstract void displayDetails();

  public String getName(){
    return name;
  }
  public int getAge(){
    return age;
  }
}

class Student extends Person{
    private String course;

    public Student(String name,int age,String course){
        super(name,age);
        this.course=course;
    }

    public void displayDetails(){
        System.out.println("Name:"+this.name);
        System.out.println("Age:"+this.age);
        System.out.println("Course:"+this.course);
    }
}
public class Abstraction {
  public static void main(String[] args) {
      // Create an object
      Student std1 = new Student("Monika", 20,"IT");

      // Call the method
      std1.displayDetails();
  }
}
