package cc.before30.algex.string;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * VerifyingAlienDictionaryTest
 *
 * @author before30
 * @since 2019-06-12
 */
public class VerifyingAlienDictionaryTest {

    @Test
    public void isAlienSorted() {
        VerifyingAlienDictionary dictionary = new VerifyingAlienDictionary();
        Assert.assertTrue(dictionary.isAlienSorted(new String[]{"hello", "leetcode"}, "hlabcdefgijkmnopqrstuvwxyz"));
        Assert.assertFalse(dictionary.isAlienSorted(new String[]{"word","world","row"}, "worldabcefghijkmnpqstuvxyz"));
        Assert.assertFalse(dictionary.isAlienSorted(new String[]{"apple","app"}, "abcdefghijklmnopqrstuvwxyz"));

    }
}