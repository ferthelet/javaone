
class Animal {
    protected String name;

    // constructor
    public Animal(String name) {
        this.name = name;
    }
}

interface Sound {
    public String makingSound();
}

class Dog extends Animal implements Sound {
    // constructor
    public Dog(String name) {
        super(name); // calls the animal constructor
    }

    public String makingSound() {
       return("The dog's barking.");
    }

    public String printName() {
        return("The dog's name is " + name);
    }
}

class Cat extends Animal implements Sound {
    // constructor
    public Cat(String name) {
        super(name); // calls the animal constructor
    }

    public String makingSound() {
        return("The cat's meowing.");
    }

    public String printName() {
        return("The cat's name is " + name);
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        Dog dog = new Dog("Buddy");
        System.out.println("Hello " + dog.printName());
        System.out.println(dog.makingSound());
        Cat cat = new Cat("Whiskers");
        System.out.println("Hello " + cat.printName());
        System.out.println(cat.makingSound());
                
    }
}
