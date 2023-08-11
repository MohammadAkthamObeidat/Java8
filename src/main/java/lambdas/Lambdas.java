package lambdas;

import java.util.function.Function;

public class Lambdas {


    public static void main(String[] args) {


        /**
         * In the below function the Lambda is this part: [[ name -> ]]
         */
        Function<String, String> upperCaseName = name -> name.toUpperCase();

        /**
         * This Function is the same as the one above, we use this structure when we have some logic to do before return the final result.
         */
        Function<String, String> upperCaseName2 = name -> {
            if (name.isBlank()) throw new IllegalArgumentException("The provided name is blank");
            return name.toUpperCase();
        };
    }
}
