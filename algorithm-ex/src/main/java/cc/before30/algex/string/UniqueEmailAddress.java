package cc.before30.algex.string;

import java.util.HashSet;

public class UniqueEmailAddress {

    public int numUniqueEmails(String[] emails) {

        HashSet<String> uniqEmails = new HashSet<>();
        for (int i = 0; i < emails.length; i++) {
            String[] name = emails[i].split("@");
            if (name.length != 2) {
                continue;
            }

            String localName = name[0].split("\\+")[0].replace(".", "");
            String domainName = name[1];

            uniqEmails.add(localName + "@" + domainName);
        }
        return uniqEmails.size();
    }
}
