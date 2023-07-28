package org.obeidat.java8.functionalinterface;

import java.util.function.Supplier;

/**
 * @author Mohammad Obeidat
 *
 * Supplier<T> => Represents a supplier of results; which means it takes no arguments and return a value.
 */
public class _Supplier {
    public static void main(String[] args) {

    }

    static Supplier<String> getDBConnectionURL = () -> "jdbc://localhost:10000/users";
}
