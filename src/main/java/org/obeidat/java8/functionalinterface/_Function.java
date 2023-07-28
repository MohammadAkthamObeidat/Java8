package org.obeidat.java8.functionalinterface;

import java.util.function.Function;

/**
 * @author Mohammad Obeidat
 * Function<T,R> => represents a function that accepts one argument and produce a result.
 */
public class _Function {
    public static void main(String[] args) {

        // "Functional" functional interface examples
        System.out.println(incrementByOne(0));

        System.out.println(incrementByOneFunction.apply(0));

        System.out.println(multiplyBy10Function.apply(2));

        System.out.println(incrementBy1AndThenMultiplyBy10.apply(4));

        System.out.println(inc1AndMulti10.apply(4));
    }



    // Imperative Way => This is a simple function that takes one number argument and return it after adding 1 to it.
    static int incrementByOne(int number){
        return number+1;
    }

    // To create the above function in functional way we use the below functional interface.
    static Function<Integer, Integer> incrementByOneFunction = number -> number+1;

    // This is another function that multiply the incoming argument by 10 in functional way
    static Function<Integer, Integer> multiplyBy10Function = number -> number*10;

    // We can combine multiple functional interface by using [".andThen()" || ".compose()"] methods like the following example:
    static Function<Integer, Integer> incrementBy1AndThenMultiplyBy10 = incrementByOneFunction.andThen(multiplyBy10Function);

    static Function<Integer, Integer> inc1AndMulti10 = multiplyBy10Function.compose(incrementByOneFunction);


}
