
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class HelloTest {
    @Test
    public void testAdd() {
        assertEquals(30, Hello.add(10, 20));
    }
}
