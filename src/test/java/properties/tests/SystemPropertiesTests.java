package properties.tests;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class SystemPropertiesTests {

    @Test
    void systemPropertiesTest() {
        String browser = System.getProperty("browser");
        System.out.println(browser); // null
    }

    @Test
    void systemProperties2Test() {

        System.setProperty("browser", "chrome");
        String browser = System.getProperty("browser");
        System.out.println(browser); // null
    }

    @Test
    void systemProperties3Test() {

        String browser = System.getProperty("browser", "mozilla");
        System.out.println(browser); // mozilla
    }

    @Test
    @Tag("property")
    void systemProperties4Test() {
        String browser = System.getProperty("browser", "mozilla");

        System.out.println(browser); // mozilla
        // gradle property_test
        // mozilla
        // gradle property_test -Dbrowser=opera
    }

}
