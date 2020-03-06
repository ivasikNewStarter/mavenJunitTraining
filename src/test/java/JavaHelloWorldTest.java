import static org.junit.Assert.*;

/**
 * Created by u0139221 on 3/6/2020.
 */
public class JavaHelloWorldTest {
    @org.junit.Test
    public void hello() throws Exception {
        JavaHelloWorld javaHelloWorld = new JavaHelloWorld();
        assert ("Hello test".equals(javaHelloWorld.hello()));

    }

}