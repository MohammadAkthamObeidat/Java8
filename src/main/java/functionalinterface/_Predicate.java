package functionalinterface;

import java.util.function.Predicate;

/**
 * @author Mohammad Obeidat
 *
 * Predicate<T> => Represents a boolean-valued function of one argument.
 */
public class _Predicate {

    public static void main(String[] args) {
        System.out.println(isValidPhoneNumber.test("0747653111"));
        System.out.println(isValidPhoneNumber.test("0747653111"));
        System.out.println(isValidPhoneNumber.test("0747653111"));

        // We can combine more than one Predicate function using [ ".and()" || ".or()" ] methods to make a combined conditions.
        System.out.println(isValidPhoneNumber.and(containsNumber3).test("0644353111"));
        System.out.println(isValidPhoneNumber.or(containsNumber3).test("0644353111"));
    }

    static Predicate<String> isValidPhoneNumber = phoneNumber -> phoneNumber.startsWith("07") && phoneNumber.length() == 10;

    static Predicate<String> containsNumber3 = phoneNumber -> phoneNumber.contains("3");
}
