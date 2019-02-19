package cc.before30.algex.string;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class UniqueEmailAddressTest {

    /**
     * Input: ["test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"]
     * Output: 2
     * Explanation: "testemail@leetcode.com" and "testemail@lee.tcode.com" actually receive mails
     */
    @Test
    public void numUniqueEmails() {
        UniqueEmailAddress uniqueEmailAddress = new UniqueEmailAddress();
        String[] input = {"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"};
        Assert.assertEquals(2, uniqueEmailAddress.numUniqueEmails(input));

    }
}