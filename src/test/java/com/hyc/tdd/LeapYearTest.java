package com.hyc.tdd;


import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

/**
 * Created with IntelliJ IDEA.
 * User: morain
 * Date: 13-8-8
 * Time: 下午9:26
 * To change this template use File | Settings | File Templates.
 */
public class LeapYearTest {
     @Test
     public void year_1999_is_not_a_leap_year() {
         assertFalse(LeapYear.isLeapYear(1999));
     }
    @Test
    public void year_1996_is_a_leap_year() {
         assertTrue(LeapYear.isLeapYear(1996));
    }
    @Test
    public void year_1900_is_not_a_leap_year() {
        assertFalse(LeapYear.isLeapYear(1900));
    }
    @Test
    public void year_2000_is_a_leap_year() {
        assertTrue(LeapYear.isLeapYear(2000));
    }

    @Test
    public void should_return_123_when_input_is_0(){
       assertThat(123,is(123));
    }
}
