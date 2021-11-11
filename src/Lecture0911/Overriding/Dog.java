package Lecture0911.Overriding;

class Dog extends Animal {

    @Override
    public void eat() {
        super.eat();
        System.out.println("I eat dog food");
    }

    public void bark() {
        System.out.println("I can bark ");
    }

    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.type = "mammal";
        dog1.eat();
        dog1.sleep();
        dog1.bark();
    }
}
