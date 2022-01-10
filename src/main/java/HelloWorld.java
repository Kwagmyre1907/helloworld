import org.apache.commons.lang3.*;

/**
 * Created by jt on 2018-11-26.
 */
public class HelloWorld {

    public static void main(String[] args) {
        System.out.println("Hello World!!!! ");
        sayHello();
    }

    private static void sayHello() {
        String hello = "hello new world!";
        hello = StringUtils.capitalize(hello);
        System.out.println(hello);
    }
}
