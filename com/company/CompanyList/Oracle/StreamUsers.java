package com.company.CompanyList.Oracle;

import java.util.*;

public class StreamUsers {
    public static void main(String[] args) {

    }
    class Stream{
        int userId;
        int startTime;
        int endTime;
        int streamSessionId;
        int videoId;
    }

    List<Integer> getMutiplyVideoWatched(List<Stream> streams){
        Map<Integer, List<int[]>> users = new HashMap<>();
        List<Integer> res = new ArrayList<>();
        for (Stream x: streams){
            if (users.containsKey(x.userId)){
                users.get(x.userId).add(new int[]{x.startTime,x.endTime});
            }
            else {
                List<int[]> times = new ArrayList<>();
                times.add(new int[]{x.startTime,x.endTime});
                users.put(x.userId,times);
            }
        }
        for (int u:users.keySet()){
            List<int[]> times = users.get(u);
           Collections.sort(times,(a,b)->(a[0]-b[0]));
            for (int i=1;i<times.size();++i){
                if (times.get(i)[0]< times.get(i-1)[1])
                    res.add(u);
            }
        }
        return res;

    }


}
