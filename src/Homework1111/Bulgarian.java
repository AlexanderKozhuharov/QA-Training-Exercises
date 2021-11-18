package Homework1111;

public class Bulgarian extends Person {
    Bulgarian(String name, String language, String job, String nationality, String country, String egn, String sex, String religion) {
        super(name, language, job, nationality, country, egn, sex, religion);
    }

    @Override
    public void canTakeLoan() {
        switch (job) {
            case "Майстор":
                System.out.println("Не може да вземе заем.");
                break;
            case "Лекар":
                System.out.println("Да, може да вземе заем.");
                break;
            case "Сервитьор":
                System.out.println("Не може да вземе заем.");
                break;
            default:
                System.out.println("Няма информация");
        }
    }

    @Override
    public void isAdult() {
        if (age >= 18) {
            System.out.println("Този човек е пълнолетен.");
        } else {
            System.out.println("Този човек е непълнолетен.");
        }
    }

    @Override
    public void celebrateEaster() {
        switch (religion) {
            case "Християнин":
                System.out.println("Да, празнува Великден.");
                break;
            case "Евреин":
                System.out.println("Да, празнува Великден.");
                break;
            case "Мюсюлманин":
                System.out.println("Не празнува Великден.");
                break;
            case "Будист":
                System.out.println("Не празнува Великден.");
                break;
            default:
                System.out.println("Няма информация.");
        }
    }

    public void isMaleOrFemale() {
        if (sex.equalsIgnoreCase("мъж")) {
            System.out.println("Този българин е от мъжки пол.");
        } else if (sex.equalsIgnoreCase("жена")) {
            System.out.println("Тази българка е от женски пол.");
        }
    }
}
