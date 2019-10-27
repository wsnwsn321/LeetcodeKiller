package com.company.Viagogo;

import java.util.*;

public class buyTickets {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String lines;
        int size=0;
        List<List<Integer>> events = new ArrayList<>();
        List<List<Integer>> buyers = new ArrayList<>();
        while (!(lines = in.nextLine()).isEmpty()){
            size = Integer.parseInt(lines);
            int eventsNum =Integer.parseInt(in.nextLine());
            for (int i=0;i<eventsNum;++i){
                events.add(new ArrayList<>());
                String[] line = in.nextLine().split("\\s+");
                for (String x:line){
                    if (!x.equals(""))
                        events.get(i).add(Integer.parseInt(x));
                }
            }
            int buyerNum = Integer.parseInt(in.nextLine());
            for (int i=0;i<buyerNum;++i){
                buyers.add(new ArrayList<>());
                String[] line = in.nextLine().split("\\s+");
                for (String x:line){
                    if (!x.equals(""))
                        buyers.get(i).add(Integer.parseInt(x));
                }
            }
        }
        Collections.sort(events,(a,b)->a.get(0)-b.get(0));
        int[][] grid = new int[size][size];
        Map<Integer,List<Integer>> prices = new HashMap<>();
        for (List<Integer> event:events){
            for (int i=3;i<event.size();++i){
                if (!prices.containsKey(event.get(0)))
                    prices.put(event.get(0),new ArrayList<>());
                prices.get(event.get(0)).add(event.get(i));
            }
            Collections.sort(prices.get(event.get(0)));
        }
        List<String> res = new ArrayList<>();
        for (List<Integer> buyer:buyers){
            int event_id =events.size(), ticket_price=Integer.MAX_VALUE;
            int minDis =Integer.MAX_VALUE;
            for (List<Integer> event:events){
                int distance = (int)Math.pow(Math.abs(event.get(1)-buyer.get(0)),2)+(int)Math.pow(Math.abs(event.get(2)-buyer.get(1)),2);
                if (minDis>distance&&prices.get(event.get(0)).size()>0){
                    event_id = event.get(0);
                    ticket_price = prices.get(event_id).get(0);
                    minDis = distance;
                }
            }
            prices.get(event_id).remove(0);
            String place = event_id+" "+ticket_price;
            res.add(place);
        }
        for (String x:res){
            System.out.println(x);
        }
    }

}
