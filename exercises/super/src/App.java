
class Animal {
    String name;

    // constructor
    public Animal(String name) {
        this.name = name;
    }
}

interface Sound {
    public void makingSound();
}

class Dog extends Animal implements Sound {
    // constructor
    public Dog(String name) {
        super(name); // calls the animal constructor
    }

    public void makingSound() {
        System.out.println("The dog barks.");
    }

    public void printName() {
        System.out.println("The dog's name is " + name);
    }
}

class Cat extends Animal implements Sound {
    // constructor
    public Cat(String name) {
        super(name); // calls the animal constructor
    }

    public void makingSound() {
        System.out.println("The cat meows.");
    }

    public void printName() {
        System.out.println("The cat's name is " + name);
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, Dog!");
        Dog dog = new Dog("Buddy");
        dog.makingSound();
        dog.printName();
        System.out.println("Hello, Cat!");
        Cat cat = new Cat("Whiskers");
        cat.makingSound();
        cat.printName();
        
    }
}
