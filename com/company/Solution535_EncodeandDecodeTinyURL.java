package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Solution535_EncodeandDecodeTinyURL {
    public class Codec {
        String alphabet = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        Map<String, String> map = new HashMap<>();
        Random rand = new Random();

        // Encodes a URL to a shortened URL.
        public String encode(String longUrl) {
            String key = getRand();
            while (map.containsKey(key))
                key = getRand();
            map.put(key, longUrl);
            return "http://tinyurl.com/" + key;
        }

        // Decodes a shortened URL to its original URL.
        public String decode(String shortUrl) {
            shortUrl = shortUrl.replace("http://tinyurl.com/", "");
            return map.get(shortUrl);
        }

        public String getRand() {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 6; ++i) {
                sb.append(alphabet.charAt(rand.nextInt(alphabet.length())));
            }
            return sb.toString();
        }

    }

}
