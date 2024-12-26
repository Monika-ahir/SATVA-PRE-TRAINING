//person class
class Person {
  constructor(name, age) {
    //properties
    this.name = name;
    this.age = age;
  }
  //method
  displayDetails() {
    console.log("Name:" + this.name + "\n" + "Age:" + this.age);
  }
}
//object
const person1 = new Person("monika", 20);

person1.displayDetails();
