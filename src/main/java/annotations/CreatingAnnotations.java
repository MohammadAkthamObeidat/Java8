package annotations;

import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

public class CreatingAnnotations {

    public static void main(String[] args) {
        Cat myCat = new Cat("Stella");

        // Here's a quick example of how our own annotation can be used, here we checked if the class has @VeryImportant on it then we can do a specific logic to deal with it.
        if (myCat.getClass().isAnnotationPresent(VeryImportant.class)) {
            System.out.println("This thing is very important");
        } else {
            System.out.println("This thing is not very important");
        }


        // Using our @RunImmediately annotation by looping on the methods in our Class and then invoke the method that has been annotated with @RunImmediately annotation.
        // Here I used streams to loop through all methods in Cat class to invoke only the method that annotated with @RunImmediately annotation
        Arrays.stream(myCat.getClass().getDeclaredMethods())
                .forEach(method -> {
                    if (method.isAnnotationPresent(RunImmediately.class)) {
                        try {
                            // This is how we can return a specific annotation from any method
                            RunImmediately annotation = method.getAnnotation(RunImmediately.class);

                            // Loop through the times variable value and invoke our method based on it.
                            for (int i = 0; i < annotation.times(); i++) {

                                // Invoke the method by calling .invoke() on our method with passing the object that holds the method like the following line of code.
                                method.invoke(myCat);
                            }
                        } catch (IllegalAccessException | InvocationTargetException e) {
                            throw new RuntimeException(e.getMessage() + " " + e.getCause());
                        }
                    }
                });

        // An example of how we use the only field annotation @ImportantString by looping through all fields of our class and do some logic on the field that has been annotated with @ImportantString.
        Arrays.stream(myCat.getClass().getDeclaredFields())
                .forEach(field -> {
                    if (field.isAnnotationPresent(ImportantString.class)) {
                        try {
                            // Get the filed for our object that containing the field.
                            Object object = field.get(myCat);

                            // Safely cast the object to String by checking it using "instanceof".
                            // In new Java it is not necessary to explicitly cast our variable when we check using "instanceof," we can simply put a new name of our variable after checking, and it will be cast automatically like the following we named it [ stringValue ].
                            if(object instanceof String stringValue){
                                System.out.println(stringValue.toUpperCase());
                            }
                        } catch (IllegalAccessException e) {
                            throw new RuntimeException(e);
                        }
                    }
                });
    }
}
