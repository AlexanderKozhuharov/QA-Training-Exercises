package Homework1111;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Person {
    protected String name;
    protected String language;
    protected String job;
    protected String nationality;
    protected String country;
    private LocalDate dateOfBirth;
    protected final String egn;
    protected final String sex;
    protected final String religion;
    protected int age;

    Person(String name, String language, String job, String nationality, String country, String egn, String sex, String religion) {
        this.name = name;
        this.language = language;
        this.job = job;
        this.nationality = nationality;
        this.country = country;
        this.egn = egn;
        this.sex = sex;
        this.religion = religion;
    }

    public void setDateOfBirthAndAge(String egn) {
        if (Integer.parseInt(egn.substring(0, 2)) > 21) {
            String tempDate = "19" + egn.substring(0, 6);
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd");
            this.dateOfBirth = LocalDate.parse(tempDate, formatter);
            Period newP = Period.between(dateOfBirth, LocalDate.now());
            this.age = newP.getYears();
        } else {
            String tempDate = "20" + egn.substring(0, 6);
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd");
            this.dateOfBirth = LocalDate.parse(tempDate, formatter);
            Period newP = Period.between(dateOfBirth, LocalDate.now());
            this.age = newP.getYears();
        }
    }

    public LocalDate getDateOfBirthAndAge() {
        return this.dateOfBirth;
    }

    public static void main(String[] args) {


        Person person = new Person("John", "English", "Engineer", "American", "Canada", "7004053456", "male", "Buddhism");
        person.setDateOfBirthAndAge(person.egn);
        person.canTakeLoan();
        person.celebrateEaster();
        person.isAdult();
        person.sayHello();
        System.out.println(person.getDateOfBirthAndAge());
        System.out.println(person.age);
        System.out.println();

        Child newChild = new Child("Марти", "Bulgarian", "No", "Italian", "Bulgaria", "1111154567", "male", "Christianity");
        newChild.setDateOfBirthAndAge(newChild.egn);
        System.out.println(newChild.getDateOfBirthAndAge());
        newChild.sayHello();
        newChild.isAdult();
        newChild.canTakeLoan();
        newChild.likesShopskaSalad();
        System.out.println();

        Bulgarian bulgarian = new Bulgarian("Стоян", "Bulgarian", "Майстор", "Bulgarian", "Bulgaria", "6512125465", "мъж", "Евреин");
        bulgarian.sayHello();
        bulgarian.canTakeLoan();
        bulgarian.isMaleOrFemale();
        bulgarian.setDateOfBirthAndAge(bulgarian.egn);
        System.out.println(bulgarian.getDateOfBirthAndAge());
        bulgarian.isAdult();
        bulgarian.celebrateEaster();
        System.out.println();

        Italian italian = new Italian("Leonardo", "Italian", "Barista", "Italian", "Italy", "8709091234", "male", "judaism");
        italian.sayHello();
        italian.canTakeLoan();
        italian.isNameFromTMNT();
        italian.countryOfResidence();
        italian.setDateOfBirthAndAge(italian.egn);
        System.out.println(italian.getDateOfBirthAndAge());
        italian.isAdult();
        System.out.println("This person's age is: " + italian.age);
        italian.celebrateEaster();

    }

    public void sayHello() {
        switch (language) {
            case "Bulgarian":
                System.out.println("Здравей!");
                break;
            case "Italian":
                System.out.println("Ciao!");
                break;
            default:
                System.out.println("Hello");
        }
    }

    public void celebrateEaster() {
        switch (religion) {
            case "Christianity":
                System.out.println("Yes.");
                break;
            case "Judaism":
                System.out.println("Yes.");
                break;
            case "Islam":
                System.out.println("No.");
                break;
            case "Buddhism":
                System.out.println("No.");
                break;
        }
    }

    public void isAdult() {
        if (age >= 18) {
            System.out.println("This person is an adult.");
        } else {
            System.out.println("This person is not an adult.");
        }
    }

    public void canTakeLoan() {
        switch (job) {
            case "Engineer":
                System.out.println("Yes.");
                break;
            case "Doctor":
                System.out.println("Yes.");
                break;
            case "Waiter":
                System.out.println("No.");
                break;
            default:
                System.out.println("No information.");
        }
    }
}
