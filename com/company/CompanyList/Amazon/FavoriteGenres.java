package com.company.CompanyList.Amazon;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FavoriteGenres {
    public static void main(String[] args) {

    }
    public Map<String, List<String>> favoritegenre(Map<String, List<String>> userMap, Map<String, List<String>> genreMap) {
        Map<String,List<String>> res = new HashMap<>();
        Map<String,String> songGenre = new HashMap<>();
        for (String genre:genreMap.keySet()){
            for (String song: genreMap.get(genre)){
                songGenre.put(song,genre);
            }
        }
        Map<String,Integer> GenreCount = new HashMap<>();
        for (String user:userMap.keySet()){
            res.put(user,new ArrayList<>());
            int count=0;
            for (String song:userMap.get(user)){
                String curGenre = songGenre.get(song);
                GenreCount.put(curGenre,GenreCount.getOrDefault(curGenre,0)+1);
                count=Math.max(count,GenreCount.get(curGenre));
            }
            for (String genre:GenreCount.keySet()){
                if (GenreCount.get(genre)==count){
                    res.get(user).add(genre);
                }
            }
        }
        return res;
    }
}
