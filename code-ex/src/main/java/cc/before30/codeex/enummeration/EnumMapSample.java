package cc.before30.codeex.enummeration;

import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Set;

public class EnumMapSample {
    public static void main(String[] args) {
        EnumMap cars = new EnumMap(Car.class);
        cars.put(Car.BMW, Car.BMW.getPrice());
        cars.put(Car.AUDI, Car.AUDI.getPrice());
        cars.put(Car.MERCEDES, Car.MERCEDES.getPrice());

        Set<Car> carSet = cars.keySet();
        carSet.stream().forEach(c -> System.out.println(c.name() + " " + c.getPrice()));

        System.out.println(cars.size());

        cars.remove(Car.AUDI);
        System.out.println(cars.size());

        EnumSet<Day> week = EnumSet.allOf(Day.class);


        week.forEach(System.out::println);

        for (Day d : week) {
            System.out.println(d.name());
        }

        week.remove(Day.MONDAY);
        week.forEach(System.out::println);
    }
}
