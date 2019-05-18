package com.stackroute.pe5;

import org.junit.*;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class FindCountsOfAllStringsTest {

    public static FindCountsOfAllStrings findCountsOfAllStrings;
    @BeforeClass
    public static void setUp() {
        findCountsOfAllStrings=new FindCountsOfAllStrings();
    }

    @AfterClass
    public static void tearDown() {
        findCountsOfAllStrings=null;
    }

    @Test
    public void testNoOfCountsInString_GivenString_ShouldReturnMapWithCountsAndNumber() {
        Map<String,Integer> hashMap=new HashMap<>();
        hashMap.put("one",5);
        hashMap.put("two",2);
        hashMap.put("three",2);
        assertEquals(hashMap,findCountsOfAllStrings.noOfCountsInString("one one -one___two,,three,one @three*one?two"));
    }
    @Test
    public void testNoOfCountsInString_GivenNull_ShouldReturnNull() {
        assertEquals(null,findCountsOfAllStrings.noOfCountsInString(null));
    }

}