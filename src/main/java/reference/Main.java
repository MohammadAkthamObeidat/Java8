package reference;

/**
 * @author Mohammad Obeidat
 */
public class Main {

    /**
     * In Java, all arguments (primitive types and references) are passed by value.
     * When we pass primitive types to a function, an actual copy of them is made, and that copy gets passed. Therefore,
     * any changes we make in the copies inside the function don't affect the value of the original variable.
     * If we pass a reference type to a function, an actual bit-by-bit copy of the reference itself is made and gets passed.
     * The copied reference and the original reference both are pointing to the same object in memory. Therefore,
     * if we modify the object through one of the references, it is reflected when we access the object using the other
     * reference since both references are pointing to the same object. Here is a basic example to illustrate this
     */

    static void update(int value, StringBuffer bufferObj) {
        value = 30;
        bufferObj.append("world");
    }

    public static void main(String[] args) {
        int value = 20;
        StringBuffer bufferObj = new StringBuffer("Hello ");

        update(value, bufferObj);

        System.out.println(value);        // Output: 20
        System.out.println(bufferObj);    // Output: Hello world
    }
}
