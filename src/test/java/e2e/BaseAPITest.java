package e2e;

import com.intuit.karate.junit4.Karate;
import org.junit.runner.RunWith;

/**
 * @author sgnaneshwar
 */

@RunWith(Karate.class)
public abstract class BaseAPITest {

//    private static ServerStart

    public static void init() {
        startServer();
    }

    private static void startServer() {

    }
}
