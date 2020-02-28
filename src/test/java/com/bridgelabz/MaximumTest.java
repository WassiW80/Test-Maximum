package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class MaximumTest {
    @Test
    public void givenIntegerFirstNumber_WhenLargest_ShouldReturnTrue() {
        Maximum maximum=new Maximum();
        int result = maximum.getMaximum(80, 10, 7);
        Assert.assertEquals(80,result);
    }

    @Test
    public void givenIntegerSecondNumber_WhenLargest_ShouldReturnTrue() {
        Maximum maximum = new Maximum();
        int result = maximum.getMaximum(10, 80, 7);
        Assert.assertEquals(80,result);
    }

    @Test
    public void givenIntegerThirdNumber_WhenLargest_ShouldReturnTrue() {
        Maximum maximum = new Maximum();
        int result = maximum.getMaximum(7, 10, 80);
        Assert.assertEquals(80,result);
    }

    @Test
    public void givenFloatFirstNumber_WhenLargest_ShouldReturnTrue() {
        Maximum maximum = new Maximum();
        float result = maximum.getMaximum(5.1f, 3.2f, 1.9f);
        Assert.assertEquals(5.1f,result,0.1);
    }

    @Test
    public void givenFloatSecondNumber_WhenLargest_ShouldReturnTrue() {
        Maximum maximum = new Maximum();
        float result = maximum.getMaximum(6.1f, 9.1f, 4.5f);
        Assert.assertEquals(9.1f,result,0.1);
    }

    @Test
    public void givenFloatThirdNumber_WhenLargest_ShouldReturnTrue() {
        Maximum maximum = new Maximum();
        float result = maximum.getMaximum(5.7f, 3.4f, 10.1f);
        Assert.assertEquals(10.1f,result,0.1);
    }
}
