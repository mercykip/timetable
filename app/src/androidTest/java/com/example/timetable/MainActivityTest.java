package com.example.timetable;

import android.view.View;

import androidx.test.rule.ActivityTestRule;

import org.junit.After;
import org.junit.*;

import static org.junit.Assert.assertNotNull;


public class MainActivityTest {
    @Rule
    public ActivityTestRule<MainActivity> mainActivityActivityTestRule=new ActivityTestRule<MainActivity>(MainActivity.class);
    private MainActivity mainActivity = null;


    @Before
   public void setUp() {
        mainActivity=mainActivityActivityTestRule.getActivity();
    }
    @Test
    public void testLaunch(){
     View view=mainActivity.findViewById(R.id.timetable_id);
     assertNotNull(view);


    }

    @After
    public void tearDown() {
        mainActivity=null;
    }
}