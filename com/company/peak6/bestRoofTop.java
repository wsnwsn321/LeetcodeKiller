package com.company.peak6;

import java.util.Arrays;
import java.util.List;

public class bestRoofTop {
    private static List<Integer> BestRooftop(List<List<Integer>> grid, double sightR){
        int minX = Integer.MAX_VALUE;
        int minY = Integer.MAX_VALUE;
        int maxX = Integer.MIN_VALUE;
        int maxY = Integer.MIN_VALUE;

        double totalHappiness = 0;
        int totalEventVisited = 0;
        int resX = 0;
        int resY = 0;

        for(List<Integer> point : grid){
            minX = Math.min(minX, point.get(0));
            minY = Math.min(minY, point.get(1));
            maxX = Math.max(maxX, point.get(0));
            maxY = Math.max(maxY, point.get(1));
        }

        for(int x = minX; x <= maxX; x++){
            for(int y = minY; y <= maxY; y++){
                double currHappiness = 0;
                int currEventVisited = 0;
                for(List<Integer> point : grid){
                    double distance = 1 + Math.sqrt((point.get(0) - x) * (point.get(0) - x) + (point.get(1) - y) * (point.get(1) - y));
                    if(distance <= sightR){
                        currHappiness += point.get(2) / distance;
                        currEventVisited++;
                    }
                }
                if(currHappiness > totalHappiness){
                    totalHappiness = currHappiness;
                    totalEventVisited = currEventVisited;
                    resX = x;
                    resY = y;
                } else if(currHappiness == totalHappiness){
                    if(currEventVisited > totalEventVisited){
                        totalEventVisited = currEventVisited;
                        resX = x;
                        resY = y;
                    } else if(currEventVisited == totalEventVisited){
                        if(Math.sqrt(x * x + y * y) < Math.sqrt(resX * resX + resY * resY)){
                            resX = x;
                            resY = y;
                        }
                    }
                }
            }
        }

        return Arrays.asList(resX, resY);
    }
}
