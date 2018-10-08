package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution690 {
    static class Employee {
        // It's the unique id of each node;
        // unique id of this employee
        public int id;
        // the importance value of this employee
        public int importance;
        // the id of direct subordinates
        public List<Integer> subordinates;
    };
    public static void main(String[] args) {

    }
    public int getImportance(List<Employee> employees, int id) {
        Map<Integer, Integer> position = new HashMap<>();
        for(int i = 0; i < employees.size(); i++){
            position.put(employees.get(i).id, i);
        }

        return totalImportance(position, employees, id);
    }

    private int totalImportance(Map<Integer, Integer> position, List<Employee> employees, int id){
        if(employees.get(position.get(id)).subordinates.size() == 0) return employees.get(position.get(id)).importance;
        int totalImp = employees.get(position.get(id)).importance;
        for(int i : employees.get(position.get(id)).subordinates){
            totalImp += totalImportance(position, employees, i);
        }
        return totalImp;
    }
}
