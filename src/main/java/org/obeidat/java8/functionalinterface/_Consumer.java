package org.obeidat.java8.functionalinterface;

import java.util.function.Consumer;

/**
 * @author Mohammad Obeidat
 * Consumer<T> => Represents an operation that accepts a single input argument and returns no result.
 */
public class _Consumer {

    record Customer(String name, String phoneNumber){};

    public static void main(String[] args) {

        Customer mohammad = new Customer("Mohammad Obeidat", "0777753111");
        Customer qutada = new Customer("Qutada Al-Rabee", "0777753123");

        greetCustomer.accept(mohammad);
        greetCustomer.accept(qutada);


    }

    static Consumer<Customer> greetCustomer = customer -> System.out.println("Hello " + customer.name() + " Your Phone Number Is: " + customer.phoneNumber());
}
