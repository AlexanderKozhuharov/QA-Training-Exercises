package Homework1111;

public class Child extends Person {


    Child(String name, String language, String job, String nationality, String country, String egn, String sex, String religion) {

        super(name, language, job, nationality, country, egn, sex, religion);
    }

    @Override
    public void sayHello() {
        switch (language) {
            case "Bulgarian":
                System.out.println("Здрасти!");
                break;
            case "Italian":
                System.out.println("Salve!");
                break;
            default:
                System.out.println("Hi!");
                break;
        }
    }

    @Override
    public void isAdult() {
        System.out.println("This person is a child.");
    }

    @Override
    public void canTakeLoan() {
        System.out.println("This child cannot take loans.");
    }

    public void likesShopskaSalad() {
        if (this.nationality.equals("Bulgarian")) {
            System.out.println("This child likes Shopska Salad.");
        } else {
            System.out.println("This child doesn't like Shopska Salad.");
        }
    }

}

