package functionalinterface;

import java.util.function.BiPredicate;

/**
 * @author Mohammad Obeidat
 *
 * Predicate<T> => Represents a boolean-valued function of two arguments.
 */
public class _BiPredicate {

    public static void main(String[] args) {

        System.out.println(isValidJordanianPhoneNumber.test("+962","0747653111"));
    }

    static BiPredicate<String, String> isValidJordanianPhoneNumber = (countryCode, phoneNumber) -> {
       return countryCode.equals("+962") && (phoneNumber.startsWith("07") && phoneNumber.length() == 10);
    };

}
