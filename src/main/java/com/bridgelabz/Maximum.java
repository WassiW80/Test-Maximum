package com.bridgelabz;

public class Maximum {
    public int getMaximum(Integer num1, Integer num2, Integer num3) {
        Integer max=num1;
        if (num2.compareTo(max)>0)
            max=num2;
        if (num3.compareTo(max)>0)
            max=num3;
        return max;

    }

    public float getMaximum(Float num1, Float num2, Float num3) {
        Float max=num1;
        if (num2.compareTo(max)>0)
            max=num2;
        if (num3.compareTo(max)>0)
            max=num3;
        return max;
    }

    public String getMaximum(String string1, String string2, String string3) {
        String max=string1;
        if (string2.compareTo(max)>0)
            max=string2;
        if (string3.compareTo(max)>0)
            max=string3;
        return max;
    }
}
