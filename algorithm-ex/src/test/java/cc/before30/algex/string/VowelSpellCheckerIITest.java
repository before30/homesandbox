package cc.before30.algex.string;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class VowelSpellCheckerIITest {

    @Test
    public void exectMatch() {
        VowelSpellCheckerII spellchecker = new VowelSpellCheckerII();

        String[] wordlist = {"hello", "world"};
        String[] query = {"world", "hello"};
        String[] output = {"world", "hello"};

        Assert.assertTrue(isSameArray(output, spellchecker.spellchecker(wordlist, query)));

    }

    @Test
    public void capitalizationMatch() {
        VowelSpellCheckerII spellchecker = new VowelSpellCheckerII();

        String[] wordlist2 = {"yellow"};
        String[] query2 = {"YellOw"};
        String[] output2 = {"yellow"};

        String[] wordlist3 = {"yellow"};
        String[] query3 = {"YellOw"};
        String[] output3 = {"yellow"};

        String[] wordlist4 = {"yellow"};
        String[] query4 = {"YellOw"};
        String[] output4 = {"yellow"};

        Assert.assertTrue(isSameArray(output2, spellchecker.spellchecker(wordlist2, query2)));
        Assert.assertTrue(isSameArray(output3, spellchecker.spellchecker(wordlist3, query3)));
        Assert.assertTrue(isSameArray(output4, spellchecker.spellchecker(wordlist4, query4)));
    }

    @Test
    public void vowelErrorsMatch() {
        VowelSpellCheckerII spellchecker = new VowelSpellCheckerII();

        String[] wordlist5 = {"yellow"};
        String[] query5 = {"YellOw"};
        String[] output5 = {"yellow"};

        String[] wordlist6 = {"yellow"};
        String[] query6 = {"YellOw"};
        String[] output6 = {"yellow"};

        String[] wordlist7 = {"yellow"};
        String[] query7 = {"YellOw"};
        String[] output7 = {"yellow"};

        Assert.assertTrue(isSameArray(output5, spellchecker.spellchecker(wordlist5, query5)));
        Assert.assertTrue(isSameArray(output6, spellchecker.spellchecker(wordlist6, query6)));
        Assert.assertTrue(isSameArray(output7, spellchecker.spellchecker(wordlist7, query7)));
    }

    @Test
    public void spellchecker() {
        VowelSpellCheckerII spellchecker = new VowelSpellCheckerII();

        String[] wordlist1 = {"KiTe","kite","hare","Hare"};
        String[] queries1 = {"kite","Kite","KiTe","Hare","HARE","Hear","hear","keti","keet","keto"};
        String[] output1 = {"kite","KiTe","KiTe","Hare","hare","","","KiTe","","KiTe"};


        String[] wordlist2 = {"yellow"};
        String[] query2 = {"YellOw"};
        String[] output2 = {"yellow"};

        String[] wordlist3 = {"yellow"};
        String[] query3 = {"YellOw"};
        String[] output3 = {"yellow"};

        String[] wordlist4 = {"yellow"};
        String[] query4 = {"YellOw"};
        String[] output4 = {"yellow"};

        String[] wordlist5 = {"yellow"};
        String[] query5 = {"YellOw"};
        String[] output5 = {"yellow"};

        String[] wordlist6 = {"yellow"};
        String[] query6 = {"YellOw"};
        String[] output6 = {"yellow"};

        String[] wordlist7 = {"yellow"};
        String[] query7 = {"YellOw"};
        String[] output7 = {"yellow"};


        Assert.assertTrue(isSameArray(output1, spellchecker.spellchecker(wordlist1, queries1)));

        Assert.assertTrue(isSameArray(output2, spellchecker.spellchecker(wordlist2, query2)));
        Assert.assertTrue(isSameArray(output3, spellchecker.spellchecker(wordlist3, query3)));
        Assert.assertTrue(isSameArray(output4, spellchecker.spellchecker(wordlist4, query4)));
        Assert.assertTrue(isSameArray(output5, spellchecker.spellchecker(wordlist5, query5)));
        Assert.assertTrue(isSameArray(output6, spellchecker.spellchecker(wordlist6, query6)));
        Assert.assertTrue(isSameArray(output7, spellchecker.spellchecker(wordlist7, query7)));


    }

    public boolean isSameArray(String[] expected, String[] actual) {
        if (expected.length != actual.length) {
            return false;
        }

        for (int i = 0; i < actual.length; i++) {
            if (expected[i] != actual[i]) {
                return false;
            }
        }

        return true;
    }
}