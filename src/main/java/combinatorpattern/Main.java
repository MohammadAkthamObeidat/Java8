package combinatorpattern;

import java.time.LocalDate;

import static combinatorpattern.CustomerRegistrationValidator.*;
import static combinatorpattern.ValidationResult.SUCCESS;

public class Main {

    public static void main(String[] args) {
        Customer customer = new Customer(
                "Alice",
                "alice@mail.com",
                "73223332",
                LocalDate.of(2000, 5, 9)
        );

        // Using combinator pattern to validate the customer
        ValidationResult result = isEmailValid()
                .and(isAdult())
                .and(isPhoneNumberValid())
                .apply(customer);

        System.out.println(result);

        if(result != SUCCESS){
            throw new IllegalStateException(result.name());
        }
    }
}
