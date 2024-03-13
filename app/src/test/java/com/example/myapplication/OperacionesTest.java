package com.example.myapplication;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class OperacionesTest {

    private  operaciones nOper;

    @Before
    public void setUp(){
        nOper = new operaciones();
    }
    @Test
    public void NotNUll(){
        assertNotNull(nOper);
    }

    @Test
    public void suma() {
        assertEquals("7",nOper.suma("4","3"));
    }

    @Test
    public void resta() {
        assertEquals("1",nOper.resta("3","3"));
    }
}