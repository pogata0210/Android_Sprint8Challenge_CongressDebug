package com.lambdaschool.congressdata;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class OfficialOverviewTest {


    private OfficialOverview officialOverview;

    private static  final String FIRST_NAME = "firstName";
    private static  final String MIDDLE_NAME = "middleName";
    private static  final String LAST_NAME = "lastName";
    private static  final String PARTY = "party";
    private static  final String STATE = "state";
    private static  final String DISPLAY_NAME = "displayName";
    private static  final String ID = "id";


    @Before
    public void setUp() {
        officialOverview = new OfficialOverview("firstName", "middleName", "lastNamee", "party", "state","id");
    }

    @Test
    public void getDisplayName() {

        String displayName = "firstName";

        assertEquals(DISPLAY_NAME, officialOverview.getDisplayName());
    }
    @Test
    public void buildDisplayName(){
        String fullName = officialOverview.buildDisplayName();

        assertEquals("FIRST_NAME MIDDLE_NAME LAST_NAME", officialOverview.buildDisplayName());
    }
    @Test
    public void getId(){
        String id = "id";

        assertEquals(ID,  officialOverview.getId());
    }

    @Test
    public void getParty(){
        String party = "party";

        assertEquals(PARTY, officialOverview.getParty());
    }

    @Test
    public void getState(){
        String state = "state";

        assertEquals(STATE, officialOverview.getState());
    }



}