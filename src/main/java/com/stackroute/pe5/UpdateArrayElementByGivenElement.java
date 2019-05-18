package com.stackroute.pe5;

import java.util.ArrayList;

public class UpdateArrayElementByGivenElement {

    /*given a string Array List, strings array  to be replaced and string aray to be replaced with
    * method will replaces the stringArrayList with items in replaceWith array
    * */
    public  String updateSpecificArrayElementByGivenElement(
            ArrayList<String> stringArrayList, String[] originals, String[] replaceWith){

        /*check if stringArrayList if is null or originals array is null or replaceWith array is null
        * if any one of them is null return null*/

        if (stringArrayList==null || originals==null || replaceWith==null){
            return null;
        }
            /* traverse through the originals and replaceWith arrays
            to check if originals array element, and replaceWith element is null
            * if any one of them is null return null */

            int index=0;
            while (index<originals.length){
                if (originals[index]==null || replaceWith[index]==null){
                    return null;
                }
                stringArrayList.add(stringArrayList.indexOf(originals[index]),replaceWith[index]);
                stringArrayList.remove(originals[index]);
                index++;
            }

        String result=stringArrayList.toString();
        stringArrayList.clear();
        result+="\nArray list after removing all elements "+stringArrayList.toString();
        return result;
    }
}
