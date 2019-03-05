package com.stackroute;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Member_VariableTest {
    Member_Variable obj;
    @Before
    public void setUp() throws Exception {
         obj = new Member_Variable("Namita",22,2500.00);
    }

    @After
    public void tearDown() throws Exception {
        obj = null;
    }
@Test
public void testMembers()  {
        assertEquals("Member name : Harry PotterMember age : 30Member salary : 2500.3",obj.printMemberVariable());
}}
