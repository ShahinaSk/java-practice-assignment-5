package com.stackroute.pe4;

import java.util.HashMap;
import java.util.Map;

public class CheckForCount2OrMore {

    public Map<String,Boolean> isCount2OrMore(String[] strings){
        /*if string is null return null*/
        if (strings==null){
            return null;
        }
        int index=0;
        Map<String,Boolean> stringBooleanMap=new HashMap<>();

        /*traverse through the string array check if element is null,
        * if null return null else continue*/
        while (index<strings.length){
            if (strings[index]==null){
                return null;
            }
            /*if map contains key then make value true or make value false */
            if (stringBooleanMap.containsKey(strings[index])){
                stringBooleanMap.put(strings[index],true);
            }else {
                stringBooleanMap.put(strings[index],false);
            }
            index++;
        }
        /*return modified map*/
        return stringBooleanMap;
    }
}
