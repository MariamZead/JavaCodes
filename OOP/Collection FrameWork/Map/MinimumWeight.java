package com.example.demo;

import java.util.HashMap;

public class MinimumWeight {
    public static void main(String[] args) {
        HashMap <String,Double> people = new HashMap<>();
        people.put("Mariam" , 53.3);
        people.put("Omar", 60.8);
        people.put("Mai" , 65.2);
        minimumWeight(people);

    }
    public static void minimumWeight(HashMap <String,Double> list){
        double minimumWeight = list.get("Mai");
        String str = list.toString();
        for (String name : list.keySet()){
            if (list.get(name) < minimumWeight){
                minimumWeight = list.get(name);
                str = name;
            }
        }
        System.out.println(str + " has the minimum weight\nweight : " + minimumWeight);
    }
}
