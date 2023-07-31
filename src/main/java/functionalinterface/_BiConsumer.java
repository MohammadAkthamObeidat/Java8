package functionalinterface;

import java.util.function.BiConsumer;

/**
 * @author Mohammad Obeidat
 *
 * BiConsumer<T,T> => Represents an operation that accepts two input arguments and returns no result.
 */
public class _BiConsumer {

    record Customer(String name, String phoneNumber){};

    public static void main(String[] args) {

        Customer mohammad = new Customer("Mohammad Obeidat", "0777753111");
        Customer qutada = new Customer("Qutada Al-Rabee", "0777753123");

        greetCustomer.accept(mohammad, true);
        greetCustomer.accept(qutada, false);


    }

    static BiConsumer<Customer, Boolean> greetCustomer = (customer, showPhoneNumber) -> {
        System.out.println("Hello " + customer.name() + " Your Phone Number Is: " + (showPhoneNumber ? customer.phoneNumber() : "***********"));
    };
}
