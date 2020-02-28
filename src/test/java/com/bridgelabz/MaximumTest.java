package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class MaximumTest {
    @Test
    public void givenFirstNumber_WhenLargest_ShouldReturnTrue() {
        Maximum maximum=new Maximum();
        int result = maximum.getMaximum(80, 10, 7);
        Assert.assertEquals(80,result);
    }

    @Test
    public void givenSecondNumber_WhenLargest_ShouldReturnTrue() {
        Maximum maximum = new Maximum();
        int result = maximum.getMaximum(10, 80, 7);
        Assert.assertEquals(80,result);
    }

    @Test
    public void givenThirdNumber_WhenLargest_ShouldReturnTrue() {
        Maximum maximum = new Maximum();
        int result = maximum.getMaximum(7, 10, 80);
        Assert.assertEquals(80,result);
    }
}
