package tests;

import static org.junit.Assert.*;
import org.junit.*;

public class Loctest {

    @Test
    public void  countLines() {
        String content = "Hello\nHello\n";
        int result = Loc.countLines(content);
        int expected = 2;
        assertEquals( "Not Two Lines", expected, result);
    }

    @Test
    public void notCountBlankLines() {
        String content = "Hello\n\nContent line\nBye";
        int expected = 3;
        int result = Loc.countLines(content);

        assertEquals("Count simple comment line", expected, result);
    }
}
