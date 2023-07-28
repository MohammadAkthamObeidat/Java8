package org.obeidat.java8.imperative;

import java.util.List;

import static org.obeidat.java8.imperative.Gender.FEMALE;
import static org.obeidat.java8.imperative.Gender.MALE;

public class ImperativeVsDeclarativeProgramming {
    public static void main(String[] args) {

        List<Person> people = List.of(
                new Person("Mohammad", MALE),
                new Person("Qutada", MALE),
                new Person("Sofie", FEMALE),
                new Person("Julia", FEMALE),
                new Person("Mila", FEMALE)
        );

        // Imperative approach to filter female persons.
//        for(Person person : people){
//            if (MALE.equals(person.gender)){
//                System.out.println(person.toString());
//            }
//        }

        // Declarative approach to filter female persons.
        people.stream()
                .filter(person -> FEMALE.equals(person.gender))
                .forEach(System.out::println);
    }



     static class Person{
        private final String name;
        private final Gender gender;

        Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

         @Override
         public String toString() {
             return "Person{" +
                     "name='" + name + '\'' +
                     ", gender=" + gender +
                     '}';
         }
     }
}