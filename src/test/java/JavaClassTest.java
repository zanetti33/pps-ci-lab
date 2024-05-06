import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JavaClassTest {

    @Test
    void javaTest() {
        JavaClass javaClass = new JavaClass();
        assertEquals("Hello", javaClass.getGreeting());
    }

    @Test
    void scalaTest() {
        assertEquals("Hello", ScalaClass.produceGreeting());
    }
}
