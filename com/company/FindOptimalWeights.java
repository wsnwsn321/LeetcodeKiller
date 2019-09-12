package com.company;

import java.util.*;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;


class Pair
{
	public Pair(Double double1, Double double2) {
		// TODO Auto-generated constructor stub
	}

	// Return a map entry (key-value pair) from the specified values
	public static <T, U> Map.Entry<T, U> of(T first, U second)
	{
		return new AbstractMap.SimpleEntry<>(first, second);
	}
}
public class FindOptimalWeights {
	static Pair OptimalWeights(int numPallets, double maxCapacity, List<Double> wtPallets){
		
		if (wtPallets == null || wtPallets.size() == 0){
			return null;
		}
		int len = wtPallets.size();
		int start = 0;
		int end = len-1;
		
		Pair ret = null;
		double max_result = Integer.MIN_VALUE;
		Collections.sort(wtPallets);
		
		while(start < end){
			double cur = wtPallets.get(start) + wtPallets.get(end);
			if(cur<maxCapacity){
				start++;
				if(max_result < cur){
					max_result = cur;
					ret = new Pair(wtPallets.get(start), wtPallets.get(end));
				}
			}
			else if (cur > maxCapacity){
				end --;
			}
			else {
				return new Pair(wtPallets.get(start), wtPallets.get(end));
			}

		}

		return ret;
		
	}
	
	public static void main(String[] args){
		List<Double> w = new ArrayList<>();
		w.add(19.0);
		w.add(1.0);
		w.add(17.25);
		w.add(3.5);
		w.add(1.5);
	
		System.out.print(OptimalWeights(5, 20.75,w));
	}
}
