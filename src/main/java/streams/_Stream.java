package streams;

import imperative.Gender;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import static imperative.Gender.FEMALE;
import static imperative.Gender.MALE;

public class _Stream {

    record Person(String name, Gender gender) {
    }

    public static void main(String[] args) {

        List<Person> people = List.of(
                new Person("Mohammad", MALE),
                new Person("Qutada", MALE),
                new Person("Fatma", FEMALE),
                new Person("Batool", FEMALE),
                new Person("Mahmood", MALE)
        );

        // Print out the available genders in for the person.
        people.stream().map(person -> person.gender)
                .collect(Collectors.toSet())
                .forEach(System.out::println);

        // Print out the length of each person name.
        people.stream().map(person -> person.name)
                .mapToInt(String::length)
                .forEach(System.out::println);

        System.out.println(people.stream()
                .allMatch(person -> FEMALE.equals(person.gender)));

        System.out.println(people.stream()
                .anyMatch(person -> MALE.equals(person.gender)));

        System.out.println(people.stream()
                .noneMatch(person -> FEMALE.equals(person.gender)));

        System.out.println(people.stream()
                .filter(person -> person.gender.equals(MALE))
                .count());

        people.stream()
                .sorted(Comparator.comparing(Person::name).reversed())
                .forEach(System.out::println);


    }
}
