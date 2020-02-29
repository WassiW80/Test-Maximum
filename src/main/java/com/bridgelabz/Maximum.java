package com.bridgelabz;

public class Maximum<E extends Comparable<E>> {
    E firstValue;
    E secondValue;
    E thirdValue;
    E[] extraParamaters;

    public Maximum(E firstValue, E secondValue, E thirdValue, E... extraParamaters) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
        this.thirdValue = thirdValue;
        this.extraParamaters = extraParamaters;
    }

    private static <E extends Comparable<E>> E getMaximum(E firstValue, E secondValue, E thirdValue, E... extraParamaters) {
        E max = firstValue;
        if (secondValue.compareTo(max) > 0)
            max = secondValue;
        if (thirdValue.compareTo(max) > 0)
            max = thirdValue;
        if (extraParamaters.length != 0) {
            for (E extraParamater :
                    extraParamaters) {
                if (extraParamater.compareTo(max) > 0) {
                    max = extraParamater;
                }
            }
        }
        return max;
    }

    public <E extends Comparable<E>> E getMaximum() {
        E max = (E) getMaximum(firstValue, secondValue, thirdValue, extraParamaters);
        printMax(max);
        return max;
    }

    private <E extends Comparable<E>> void printMax(E max) {
        System.out.println("Maximum Value " + max);
    }

}
