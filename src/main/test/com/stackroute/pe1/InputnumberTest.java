package com.stackroute.pe1;

import static org.junit.Assert.*;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

    public class InputnumberTest {
        //object reference is created
        Inputnumber ob;
        @Before
        public void setUp() throws Exception {
            ob=new Inputnumber();
        }
        //object reference is nullified
        @After
        public void tearDown() throws Exception {
            ob=null;
        }
        // test cases
        
        @Test
        public void checknumfound()
        {
            String result=ob.numberinputcheck("1 2 3 4 5 6");
            assertEquals("sum 21",result);
        }
        
        //failure test cases
        @Test
        public void checkspecialcharfound()
        {
            String result=ob.numberinputcheck("1 2 3 4 5 #");
            assertEquals("special character",result);
        }
        @Test
        public void checkcharfound()
        {
            String result=ob.numberinputcheck("1 2 3 4 5 a");
            assertEquals("character found",result);
        }
    }

