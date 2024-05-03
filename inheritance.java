public class Mammal{
  public void move(){
    System.out.println("All Mammals can move;");
}
public class Dog extends Mammal{
  public void sound(){
    System.out.println("Dogs bark");
  }
}

public class Main{
public static void main(String args[]){
Dog dog = new Dog();
  dog.sound();
  dog.move();
}
}

