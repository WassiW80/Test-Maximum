package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class MaximumTest {
    @Test
    public void givenIntegerFirstNumberGreater_WhenLargest_ShouldReturnTrue() {
      Assert.assertEquals(80, new Maximum(80, 10, 7).getMaximum());
    }

    @Test
    public void givenIntegerSecondNumberGreater_WhenLargest_ShouldReturnTrue() {
        Assert.assertEquals(80, new Maximum(10, 80, 7).getMaximum());
    }

    @Test
    public void givenIntegerThirdNumberGreater_WhenLargest_ShouldReturnTrue() {
        Assert.assertEquals(80, new Maximum(7, 10, 80).getMaximum());
    }

    @Test
    public void givenFloatFirstNumberGreater_WhenLargest_ShouldReturnTrue() {
        Assert.assertEquals(5.1f, new Maximum(5.1f, 3.2f, 1.9f).getMaximum());
    }

    @Test
    public void givenFloatSecondNumberGreater_WhenLargest_ShouldReturnTrue() {
        Assert.assertEquals(9.1f,new Maximum(6.1f, 9.1f, 4.5f).getMaximum());
    }

    @Test
    public void givenFloatThirdNumberGreater_WhenLargest_ShouldReturnTrue() {
        Assert.assertEquals(10.1f, new Maximum(5.7f, 3.4f, 10.1f).getMaximum());
    }

    @Test
    public void givenStringFirstGreater_WhenLargest_ShouldReturnTrue() {
        Assert.assertEquals("Peach", new Maximum("Apple", "Peach", "Banana").getMaximum());
    }

    @Test
    public void givenStringSecondGreater_WhenLargest_ShouldReturnTrue() {
        Assert.assertEquals("Peach", new Maximum("Peach", "Apple", "Banana").getMaximum());
    }

    @Test
    public void givenStringThirdGreater_WhenLargest_ShouldReturnTrue() {
        Assert.assertEquals("Peach", new Maximum("Banana", "Apple", "Peach").getMaximum());
    }
}
