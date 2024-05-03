// Parent class
class Animal {
    public void makeSound() {
        System.out.println("Animal is making a sound");
    }
}

// Child class 1
class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog is barking");
    }
}

// Child class 2
class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Cat is meowing");
    }
}

public class Mainpoly {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        myAnimal.makeSound(); // Output: Animal is making a sound
        myDog.makeSound();    // Output: Dog is barking
        myCat.makeSound();    // Output: Cat is meowing
    }
}
