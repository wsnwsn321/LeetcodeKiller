package com.company.peak6;

import java.util.List;

public class closingTime {
    private static int closing_time(List<Integer> queue, double admission, double runningCost){
        if(queue == null || queue.size() == 0){
            return  0;
        }

        double maxProfit = 0;
        double curProfit = 0;
        int time = -1;
        int left = 0;

        for(int i = 0; i < queue.size(); i++){
            int curPeople = queue.get(i) + left;
            if(curPeople <= 4){
                left = 0;
                curProfit += + admission * curPeople - runningCost;
            } else{
                left = curPeople - 4;
                curProfit += admission * 4 - runningCost;
            }
            if(curProfit >= maxProfit){
                maxProfit = curProfit;
                time = i;
            }
        }

        return maxProfit > 0 ? time : -1;
    }
}
