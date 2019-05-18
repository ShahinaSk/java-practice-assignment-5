package com.stackroute.pe4;

import org.junit.*;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class SortRandomGivenNamesTest {

    public static SortRandomGivenNames sortRandomGivenNames;
    @BeforeClass
    public static void setUp() {
        sortRandomGivenNames=new SortRandomGivenNames();
    }

    @AfterClass
    public static void tearDown() {
        sortRandomGivenNames=null;
    }

    @Test
    public void testSortNamesInAscendingOrder_GivenStringArrayOfNames_ShouldReturnArrayListOfSortedNames() {
        assertEquals(new ArrayList<String>(Arrays.asList("Alice", "Bluto", "Eugene", "Harry", "Olive")),
                sortRandomGivenNames.sortNamesInAscendingOrder(new String[]{"Harry","Bluto","Olive","Alice","Eugene"}));
    }

    @Test
    public void testSortNamesInAscendingOrder_GivenNullAsString_ShouldReturnNull() {
        assertEquals(null,
                sortRandomGivenNames.sortNamesInAscendingOrder(null));
    }
}