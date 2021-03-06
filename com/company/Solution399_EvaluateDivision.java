package com.company;

import java.util.*;

public class Solution399_EvaluateDivision {

    public static void main(String[] args) {

    }
    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        HashMap<String, ArrayList<String>> pairs = new HashMap<>();
        HashMap<String, ArrayList<Double>> valuesPair = new HashMap<>();
        for (int i = 0; i < equations.size(); i++) {
            List<String> equation = equations.get(i);
            if (!pairs.containsKey(equation.get(0))) {
                pairs.put(equation.get(0), new ArrayList<>());
                valuesPair.put(equation.get(0), new ArrayList<>());
            }
            if (!pairs.containsKey(equation.get(1))) {
                pairs.put(equation.get(1), new ArrayList<>());
                valuesPair.put(equation.get(1), new ArrayList<>());
            }
            pairs.get(equation.get(0)).add(equation.get(1));
            pairs.get(equation.get(1)).add(equation.get(0));
            valuesPair.get(equation.get(0)).add(values[i]);
            valuesPair.get(equation.get(1)).add(1/values[i]);
        }

        double[] result = new double[queries.size()];
        for (int i = 0; i < queries.size(); i++) {
           List<String> query = queries.get(i);
            result[i] = dfs(query.get(0), query.get(1), pairs, valuesPair, new HashSet<>(), 1.0);
        }
        return result;
    }

    private double dfs(String start, String end, HashMap<String, ArrayList<String>> pairs, HashMap<String, ArrayList<Double>> values, HashSet<String> visited, double value) {
        if (visited.contains(start)||!pairs.containsKey(start)) return -1;
        if (start.equals(end))
            return value;
        visited.add(start);
        for (int i=0;i<pairs.get(start).size();++i) {
            double temp =dfs(pairs.get(start).get(i), end, pairs, values, visited, value * values.get(start).get(i));
            if (temp!=-1)
                 return temp;
        }
        return -1;
    }

}
