package Lecture0411;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class ArrayLists {
    public static void main(String[] args) {
        LinkedList<String> cars = new LinkedList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        cars.set(1, "Peugeot");

//        System.out.println(cars);
//        System.out.println(cars.get(0));
//        for (String car : cars) {
//            System.out.println(car);
//        }
//        Collections.sort(cars);
//        for (String car : cars) {
//            System.out.println(car);
//        }
        System.out.println(cars);
    }
}
