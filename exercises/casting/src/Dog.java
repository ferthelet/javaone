public class Dog extends Animal {

    public void growl() {
        System.out.println("Grrrrrr");
    }
    
    @Override
    public void makeNoise() {
        System.out.println("Woof woof");
    }
}
