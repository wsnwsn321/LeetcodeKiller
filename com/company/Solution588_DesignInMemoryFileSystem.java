package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Solution588_DesignInMemoryFileSystem {
    class FileSystem {
        class File {
            boolean isfile = false;
            //string is the path of the file/directory
            HashMap< String, File > files = new HashMap < > ();
            String content = "";
        }
        File root;
        public FileSystem() {
            File root = new File();
        }

        public List<String> ls(String path) {
            return null;
        }

        //creating directories
        public void mkdir(String path) {
            File node = root;
            String[] ds = path.split("/");
            for (String d:ds){
                if (!node.files.containsKey(d))
                    node.files.put(d,new File());
                node = node.files.get(d);
            }
        }

        public void addContentToFile(String filePath, String content) {
            File node = root;
            String[] ds = filePath.split("/");
            for (int i=1;i<ds.length-1;++i){
                node = node.files.get(ds[i]);
            }
            if (node.files.containsKey(ds[ds.length-1])){
                node.files.get(ds[ds.length-1]).content+=content;
            }
            else {
                node.files.put(ds[ds.length-1],new File());
                node = node.files.get(ds[ds.length-1]);
                node.isfile = true;
                node.content = content;
            }

        }

        public String readContentFromFile(String filePath) {
            File node = root;
            String[] ds = filePath.split("/");
            for (int i=1;i<filePath.length();++i){
                node = node.files.get(ds[i]);
            }
            return node.content;
        }
    }

/**
 * Your FileSystem object will be instantiated and called as such:
 * FileSystem obj = new FileSystem();
 * List<String> param_1 = obj.ls(path);
 * obj.mkdir(path);
 * obj.addContentToFile(filePath,content);
 * String param_4 = obj.readContentFromFile(filePath);
 */
}
