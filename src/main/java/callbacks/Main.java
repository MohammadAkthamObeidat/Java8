package callbacks;

import java.util.function.Consumer;


/**
 * @author Mohammad Obeidat
 *
 * Notes: -
 *      In Java, callbacks can be useful in several scenarios. Here are some cases where it could be better to use callbacks:
 *          1- Asynchronous Programming: In Java, callbacks are often used in asynchronous programming where some code needs to execute upon the completion of an asynchronous task. This often happens in multithreaded applications.
 *          2- Event Handling: Callbacks are widely used in GUI programming for handling events. When an event takes place (like a button click), a callback method is called.
 *          3- Iterating Over Collections: If you want to perform some operation on each item of a collection, instead of manually looping through the collection, you could use a callback mechanism.
 *          4- Customizing algorithm behavior: Sometimes, we want to change part of an algorithm while keeping the overall structure the same. A good example would be a sort method where the comparison mechanism can be modified by providing a custom callback method for comparison.
 *
 */
public class Main {
    public static void main(String[] args) {


        hello("Mohammad", null, firstName-> {
            System.out.println("the lastName was not provided for " + firstName);
        });

        hello2("Mohammad", null, ()->{
            System.out.println("No lastName provided");
        });
    }

    static void hello(String firstName, String lastName, Consumer<String> callback){
        System.out.println(firstName);

        if(lastName != null){
            System.out.println(lastName);
        }else {
            callback.accept(firstName);
        }
    }

    static void hello2(String firstName, String lastName, Runnable callback){
        System.out.println(firstName);

        if(lastName != null){
            System.out.println(lastName);
        }else {
            callback.run();
        }
    }
}
