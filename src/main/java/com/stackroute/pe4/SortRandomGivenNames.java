package com.stackroute.pe4;

import java.util.*;

public class SortRandomGivenNames {

    public List<String> sortNamesInAscendingOrder(String[] strings){

        if (strings==null){
            return null;
        }
        Set<String> set=new TreeSet<>(Arrays.asList(strings));

        List<String> sortedNames=new ArrayList<>(set);

        return sortedNames;
    }

}
