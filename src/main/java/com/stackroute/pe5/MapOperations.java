package com.stackroute.pe5;

import java.util.*;

public class MapOperations {
    public Map<String,String> mapModifications(Map<String,String> map){

        List<String> listOfKeys =new ArrayList<>(map.keySet());
        map.replace(listOfKeys.get(1),map.get(listOfKeys.get(0)));
        map.replace(listOfKeys.get(0)," ");

        return map;
    }
}
