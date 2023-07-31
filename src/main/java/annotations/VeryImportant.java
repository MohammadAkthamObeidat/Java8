package annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 *
 * @author Mohammad Obeidat
 * Creating annotation is very simple as creating your class, just type @interface instead of class and boom, your annotation has created.
 *
 */

/**
 * NOTES:
 * In Java, annotations are used to attach meta-data to a program element such as a class, method, instances, etc.
 * Some annotations are used to annotate other annotations.
 * These types of annotations are known as meta-annotations.
 */
/*
 * There are two main annotation that you should add when creat your own annotation
 *
 * 1- @Target:
         * This annotation is used to define the target elements that your own annotation valid to.
         * If you don't put the @Target annotation on your own annotation then this means that your annotation will be available to use on any element type.


 * 2- @Retention:
            * is also a meta-annotation that comes with some retention policies.
            *  These retention policies determine at which point an annotation is discarded.
            * There are three types of retention policies: SOURCE, CLASS, and RUNTIME:
                1- RetentionPolicy.SOURCE: The annotations annotated using the SOURCE retention policy are discarded at runtime.
                2- RetentionPolicy.CLASS: The annotations annotated using the CLASS retention policy are recorded in the .class file but are discarded during runtime. CLASS is the default retention policy in Java.
                3- RetentionPolicy.RUNTIME: The annotations annotated using the RUNTIME retention policy are retained during runtime and can be accessed in our program during runtime.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface VeryImportant {
}

