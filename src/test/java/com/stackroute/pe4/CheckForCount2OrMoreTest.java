package com.stackroute.pe4;

import org.junit.*;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class CheckForCount2OrMoreTest {

    public static CheckForCount2OrMore checkForCount2OrMore;
    @BeforeClass
    public static void setUp() {
        checkForCount2OrMore=new CheckForCount2OrMore();
    }

    @AfterClass
    public static void tearDown() {
        checkForCount2OrMore=null;
    }

    @Test
    public void testIsCount2OrMore_GivenString_ShouldReturnMap() {
        Map<String,Boolean> stringBooleanMap=new HashMap<>();
        stringBooleanMap.put("a",true);
        stringBooleanMap.put("b",false);
        stringBooleanMap.put("c",true);
        stringBooleanMap.put("d",false);
        assertEquals(stringBooleanMap,checkForCount2OrMore.isCount2OrMore(new String[]{"a","b","c","d","a","c","c"}));
    }
    @Test
    public void testIsCount2OrMore_GivenArrayElementAsNull_ShouldReturnNull() {

        assertEquals(null,checkForCount2OrMore.isCount2OrMore(new String[]{"a","b",null,"d","a","c","c"}));
    }
    @Test
    public void testIsCount2OrMore_GivenArrayAsNull_ShouldReturnNull() {

        assertEquals(null,checkForCount2OrMore.isCount2OrMore(null));
    }

}