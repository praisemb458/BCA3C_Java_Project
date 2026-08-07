class Animal {
    String name = "Animal";
    void eat() {
        System.out.println("This animal eats food");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks: Woof! Woof!");
    }
}

class Cat extends Animal {
    void meow() {
        System.out.println("The cat meows: Meow! Meow!");
    }
}

public class hierarchical {
    public static void main (String args[]) {
        Dog myDog = new Dog();
        Cat myCat = new Cat();
        myDog.eat();
        myDog.bark();
        myCat.eat();
        myCat.meow();
    }
}

