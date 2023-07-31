package optionals;

import java.util.List;
import java.util.Optional;

/**
 * @author Mohammad Obeidat
 * Optional => It's a container that either has somthing in it or doesn't
 */
public class _Optoinal {

    record Cat(String name, int age) {}

    public static void main(String[] args) {

//        System.out.println(findCatByName("Fredd").orElse(new Cat("UnknownCat", 0)));
//        System.out.println(findCatByName("Soso").map(Cat::age).orElse(0));
    }


    /**
     * Imagine the Optional as a box that could contain the requested Object or not
     * @param name
     * @return an Optional that might have a Cat object or null;
     */
    private static Optional<Cat> findCatByName(String name) {

        // Create a list of cats.
        List<Cat> cats = List.of(
                new Cat("Fred", 3),
                new Cat("Soso", 6),
                new Cat("lolo", 2)
        );

        // Filter and get Cat object based on its name then return an Optional of type Cat.
        return cats.stream()
                .filter(cat -> cat.name.equals(name))
                .findAny();
    }
}
