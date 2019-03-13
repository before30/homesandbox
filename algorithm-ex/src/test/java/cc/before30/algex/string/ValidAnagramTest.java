package cc.before30.algex.string;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ValidAnagramTest {

    @Test
    public void isAnagram() {
        ValidAnagram anagram = new ValidAnagram();

//        Assert.assertTrue(anagram.isAnagram("anagram", "nagaram"));
//        Assert.assertFalse(anagram.isAnagram("rat", "car"));
        Assert.assertFalse(anagram.isAnagram("aacc", "ccac"));
    }
}