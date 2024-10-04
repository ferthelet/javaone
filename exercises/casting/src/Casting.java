public class Casting {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, Casting!");

        // casting directly
        Animal myAnimal = new Dog();
        doAnimalStuff(myAnimal);
    }

    public static void doAnimalStuff(Animal animal) {
        animal.makeNoise();
        // animal.growl(); // won't compile
    }

}
