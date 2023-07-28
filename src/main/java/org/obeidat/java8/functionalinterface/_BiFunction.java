package org.obeidat.java8.functionalinterface;

import java.util.function.BiFunction;

/**
 * @author Mohammad Obeidat
 *
 * BiFunction<T,T,R> => represents a function that accepts two arguments and produce a result.
 */
public class _BiFunction {

    public static void main(String[] args) {

        // "BiFunctional" functional interface examples
        System.out.println(incrementByOneAndMultiply.apply(9,10));
    }

    // region "BiFunction"
    // This is a simple method that takes two number arguments, the first one is our input number that we want to increment and the second is to multiply by.
    static int incrementByOneAndMultiply(int number, int multiplyBy){
        return (number + 1) * multiplyBy;
    }

    static BiFunction<Integer, Integer, Integer> incrementByOneAndMultiply = (number, multiplyBy) -> (number + 1) * multiplyBy;
    // endregion
}
