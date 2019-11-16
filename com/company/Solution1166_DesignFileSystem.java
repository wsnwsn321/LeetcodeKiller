package com.company;

import java.util.HashMap;
import java.util.Map;

public class Solution1166_DesignFileSystem {
    class FileSystem {

        Map<String, Integer> map;

        public FileSystem() {
            map = new HashMap<>();
            map.put("", 0);
        }

        public boolean createPath(String path, int value) {
            int lastSlash = path.lastIndexOf("/");
            String parentPath = path.substring(0, lastSlash);
            if (!map.containsKey(parentPath) || map.containsKey(path)) {
                return false;
            }
            map.put(path, value);
            return true;
        }

        public int get(String path) {
            if (!map.containsKey(path)) {
                return -1;
            }
            return map.get(path);
        }
    }
}
