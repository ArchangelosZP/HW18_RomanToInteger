import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.*;
import java.util.stream.Stream;

public class MTest {
    private ByteArrayOutputStream output = new ByteArrayOutputStream();
    public RomanToInteger rtl;

    @Before
    public void setUp() {
        RomanToInteger rtl = new RomanToInteger();
        System.setOut(new PrintStream(output));
    }

    @Test
    public void convertRomanToIntTest() {
        rtl.convertRomanToInt("XXX");
        Assert.assertEquals("Integer value is: 30\r\n", output.toString());
    }
}