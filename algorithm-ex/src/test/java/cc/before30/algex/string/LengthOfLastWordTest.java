package cc.before30.algex.string;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class LengthOfLastWordTest {

    @Test
    public void lengthOfLastWord() {
        LengthOfLastWord solution = new LengthOfLastWord();

        Assert.assertEquals(5, solution.lengthOfLastWord("Hello World"));
        Assert.assertEquals(3, solution.lengthOfLastWord("Hello World what the"));
        Assert.assertEquals(5, solution.lengthOfLastWord("Hello"));
        Assert.assertEquals(0, solution.lengthOfLastWord(""));
        Assert.assertEquals(10, solution.lengthOfLastWord("Hello World 1234567890"));
    }
}