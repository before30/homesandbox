package cc.before30.algex.string;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class UniqueMorseCodeWordsTest {

    @Test
    public void uniqueMorseRepresentations() {

        UniqueMorseCodeWords morse = new UniqueMorseCodeWords();
        String[] words = {"gin", "zen", "gig", "msg"};

        Assert.assertEquals(2, morse.uniqueMorseRepresentations(words));
    }
}