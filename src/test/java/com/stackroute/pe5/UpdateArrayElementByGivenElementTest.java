package com.stackroute.pe5;

import org.junit.*;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class UpdateArrayElementByGivenElementTest {

    public static UpdateArrayElementByGivenElement updateArrayElementByGivenElement;
    @BeforeClass
    public static void setUp()   {
        updateArrayElementByGivenElement=new UpdateArrayElementByGivenElement();
    }

    @AfterClass
    public static void tearDown()   {
        updateArrayElementByGivenElement=null;
    }

    @Test
    public void updateSpecificArrayElementByGivenElement_GivenArrayListStringArrays_ShouldReturnNewString() {
        assertEquals(new String("[Kiwi, Grape, Melon, Berry]\n" +
                        "Array list after removing all elements []"),
                updateArrayElementByGivenElement.updateSpecificArrayElementByGivenElement(
                        new ArrayList<String>(Arrays.asList("Apple","Grape","Melon","Berry")),new String[]{"Apple"},new String[]{"Kiwi"}));
    }
    @Test
    public void updateSpecificArrayElementByGivenElement_GivenArrayListAndNull_ShouldReturnNull() {
        assertEquals(null,
                updateArrayElementByGivenElement.updateSpecificArrayElementByGivenElement(
                        new ArrayList<String>(Arrays.asList("Apple","Grape","Melon","Berry")),null,new String[]{"Kiwi"}));
    }
}