package com.stackroute.pe4;

import org.junit.*;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class MapOperationsTest {

    public static MapOperations mapOperations;
    @BeforeClass
    public static void setUp()   {
        mapOperations=new MapOperations();
    }

    @AfterClass
    public static void tearDown()   {
        mapOperations=null;
    }

    @Test
    public void testMapModifications_GivenMap_ShouldReturnModifedMap() {
        Map<String,String> stringMap=new HashMap<String, String>();
        stringMap.put("key1","val1");
        stringMap.put("key2","val2");
        Map<String,String> resultMap=new HashMap<String, String>();
        resultMap.put("key1"," ");
        resultMap.put("key2","val1");

        assertEquals(resultMap,mapOperations.mapModifications(stringMap));
    }

    @Test
    public void testMapModifications_GivenHashMap_ShouldReturnModifedMap() {
        Map<String,String> stringMap=new HashMap<String, String>();
        stringMap.put("key1","java");
        stringMap.put("key2","c++");
        Map<String,String> resultMap=new HashMap<String, String>();
        resultMap.put("key1"," ");
        resultMap.put("key2","java");

        assertEquals(resultMap,mapOperations.mapModifications(stringMap));
    }
}