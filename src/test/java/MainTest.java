import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest extends Main {
    Main d_main;
    @Before
    public void setUp() throws Exception {
        d_main = new Main();
    }

    @After
    public void tearDown() throws Exception {
        d_main = null;
    }

    @Test
    public void testMain() {
        d_main.main();
        assert d_main.name.equals("changed");
    }

    @Test
    public void testMain1() {
        assert d_main.name.equals("hello");
    }
}