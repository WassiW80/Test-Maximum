package com.bridgelabz;

public class Maximum {
    public <E extends Comparable<E>> E getMaximum(E num1, E num2, E num3) {
        E max = num1;
        if (num2.compareTo(max) > 0)
            max = num2;
        if (num3.compareTo(max) > 0)
            max = num3;
        return max;

    }
}
