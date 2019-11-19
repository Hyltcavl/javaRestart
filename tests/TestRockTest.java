import org.junit.*;
import test.TestRock;

//https://www.mkyong.com/java/java-read-a-file-from-resources-folder/
//https://www.jetbrains.com/help/idea/create-tests.html
//https://www.youtube.com/watch?v=Bld3644bIAo

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class TestRockTest {

    @Test
    public void getName() {
        TestRock rocky = new TestRock("Rocky");
        assertEquals("Rocky", rocky.getName());
    }

    @Test
    public void testHappy() throws Exception {
        TestRock rocky = new TestRock("Rocky");
        assertFalse(rocky.isHappy());
    }
}
