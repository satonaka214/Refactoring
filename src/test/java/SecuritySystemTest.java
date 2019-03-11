import org.junit.After;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class SecuritySystemTest {
    @Test
    public void noAlert() throws IOException {
        String[] people = {"Alice", "Bob"};
        SecuritySystem system = new SecuritySystem();

        system.checkSecurity(people);

        Assert.assertEquals(Files.exists(Paths.get("list.txt")), false);
    }

    @Test
    public void alert() throws IOException {
        String[] people = {"Don", "Bob"};
        SecuritySystem system = new SecuritySystem();

        system.checkSecurity(people);

        Assert.assertEquals(Files.exists(Paths.get("list.txt")), true);

        String line = new String(Files.readAllBytes(Paths.get("list.txt")));

        Assert.assertEquals(line, "Don");
    }

    @After
    public void after() throws IOException {
        Files.deleteIfExists(Paths.get("list.txt"));
    }
}
