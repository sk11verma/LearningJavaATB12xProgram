package Inheritance.Task9July25;

public class Cat extends Animal {
    public static void main(String[] args) {

        Cat C= new Cat();
        C.makeSound();
        C.meow();


     }
     void meow()
     {
         System.out.println("Cat sound meow");
     }
    }


