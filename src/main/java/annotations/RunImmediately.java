package annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author Mohammad Obeidat
 *
 * This is an example of creating annotation that can be applied only on methods.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface RunImmediately {

    // In this way we define the fields in our annotations, it looks like an abstract method, but it is actually a field.

    /**
     * This field to determine how many times our methods that annotated with @RunImmediately annotation will be called.
     * Annotations parameters are not available for any type we want they can be a primitive type like int, a "Class" type, a String, or an array of those types.
     * We can give the field a default values by typing "default <value>" after the field.
     * If we don't specify a default value for the field then we are required to pass value in that parameter when we use this annotation, but if we do have a default value then passing a value for the parameter is optional here.
     */
    int times() default 1;

}
