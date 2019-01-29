package com.example.rumpilstilstkin.lesson4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SuperTest {

    private MegaClassForTest testObject;

    @Before
    public void setUp() {
        testObject = new MegaClassForTest();
    }

    @Test
    public void testNumberFunWhenOContains(){
        assertEquals(3, testObject.someWithNumber("gfhogjhgj"));
    }

    @Test
    public void testNumberFunWhenONotContains(){
        assertEquals(-1, testObject.someWithNumber("gfhgjhgj"));
    }

    @Test
    public void testMinForStringTestEx(){
        testObject.someWithString(-1);
    }

    @Test
    public void testMinForStringTest(){
        assertEquals("ooo", testObject.someWithString(3));
    }

    @Test
    public void testMinForStringTestEmpty(){
        assertEquals("", testObject.someWithString(0));
    }

    @After
    public void after(){
        testObject = null;
    }
}
