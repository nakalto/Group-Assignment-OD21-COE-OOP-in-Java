// Parent class
class Animal {
  void eat() {
      System.out.println("Animal is eating");
  }

  void sleep() {
      System.out.println("Animal is sleeping");
  }
}

// Child class inheriting from Animal
class Dog extends Animal {
  void bark() {
      System.out.println("Dog is barking");
  }
}

// Main class
public class Main {
  public static void main(String[] args) {
      // Creating an instance of Dog
      Dog myDog = new Dog();

      // Accessing methods from the parent class
      myDog.eat();    // Output: Animal is eating
      myDog.sleep();  // Output: Animal is sleeping

      // Accessing method from the child class
      myDog.bark();   // Output: Dog is barking
  }
}
