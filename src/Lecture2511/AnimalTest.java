package Lecture2511;

public class AnimalTest {
    public static void main(String[] args) {
        Animal cat = new Cat();
        cat.greet();

        Animal dog = new Dog();
        dog.greet();

        Animal bigDog = new GermanShepherd();
        bigDog.greet();

//        Animal animal = new Animal() - not possible
        Dog dog2 = (Dog)dog;
        Dog dog3 = (Dog)bigDog;
        GermanShepherd dog4 = (GermanShepherd) new Dog();

    }
}
