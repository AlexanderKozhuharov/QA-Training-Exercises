package Homework1111;

public class Italian extends Person {
    Italian(String name, String language, String job, String nationality, String country, String egn, String sex, String religion) {
        super(name, language, job, nationality, country, egn, sex, religion);
    }

    @Override
    public void canTakeLoan(String job) {
        switch (job) {
            case "Barista":
                System.out.println("No.");
                break;
            case "Actor":
                System.out.println("Yes.");
                break;
            case "Painter":
                System.out.println("No.");
                break;
            default:
                System.out.println("No information.");
        }
    }

    public void countryOfResidence(String country) {
        if (country.equalsIgnoreCase("italy") && nationality.equalsIgnoreCase("italian")) {
            System.out.println("This italian lives in their home country.");
        } else {
            System.out.println("This italian does not live in their home country.");
        }
    }

    public void isNameFromTMNT(String name) {
        if (name.equalsIgnoreCase("michelangelo") || name.equalsIgnoreCase("donatello") || name.equalsIgnoreCase("raphael") || name.equalsIgnoreCase("leonardo")) {
            System.out.println("This italian shares a name with one of the teenage mutant ninja turtles.");
        } else {
            System.out.println("This italian's name is boring.");
        }
    }
}
