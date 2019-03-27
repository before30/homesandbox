package cc.before30.algex.string;

import java.util.HashMap;
import java.util.Map;

public class EncodeDecodeTinyUrl {
    Map<Integer, String>  map = new HashMap<>();

    public String encode(String longUrl) {
        int idx = map.size() + 1;
        map.put(idx, longUrl);

        return String.valueOf(idx);
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        return map.get(Integer.valueOf(shortUrl));
    }
}
