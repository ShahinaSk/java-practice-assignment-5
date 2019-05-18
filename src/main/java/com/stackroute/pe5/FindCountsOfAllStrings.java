package com.stackroute.pe5;

import java.util.*;

public class FindCountsOfAllStrings {

    public  Map<String,Integer> noOfCountsInString(String string){
        /*if string is null return null*/
        if (string==null){
            return null;
        }
        /*declare an ArrayList with counts*/
        List<String> counts=new ArrayList<String>(Arrays.asList("zero","one","two","three","four","five","six","seven","eight","nine"));
        /*create a HashMap to store result */
        Map<String,Integer> result= new HashMap<>();
        result.clear();
        /*split string into string array */
        String[] strings=string.split("[\\s+\\-,@\\*\\?_]");
        int index=0;
        /*traverse through the array if HashMap contains key then increment value by 1
        * else put count as 1*/
        while (index<strings.length){
            if (counts.contains(strings[index])){
                if (!result.containsKey(strings[index])){
                    result.put(strings[index],1);
                }else{
                    result.put(strings[index],result.get(strings[index])+1);
                }
            }
            index++;
        }
        return result;
    }
}
