package Collection;

import java.io.Closeable;

public class ExceptionTest {
    public static void main(String[] args) throws Exception {
        //exampleMethod();

        try (Demo demo = new Demo() ){
            demo.show();
            int x = 10 / 0;

        }
        catch (ArithmeticException e) {
            System.out.println(e);
        }
    }
    public static void exampleMethod() throws Exception {
        try {
            // code that throws an exception
            throw new Exception("Exception thrown in try block");
        }
        catch(Exception e) {
            System.out.println("try");
        }
        finally {
            // code that throws another exception
            throw new Exception("Exception thrown in finally block");
        }
    }
}

class Demo implements Closeable {
    void show() { System.out.println("inside show"); }
    public void close() {
        System.out.println("close from demo");

        try {
            throw new Exception("Exception thrown in demo block");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}


// custom resource 1
