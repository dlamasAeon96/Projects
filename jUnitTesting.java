import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import static java.lang.System.*;

public class jUnitTesting {
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(TestJunit.class);

        for (Failure failure : result.getFailures()) {
            out.println(failure.toString());
        }

        System.out.println(result.wasSuccessful());
    }
}