package UtilityTUnitesting;

import UtilityTUnitesting.MathUtility.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("This is the main method.");
        System.out.println(add(1,1));
        System.out.println(MathUtility.add(1, 1));
        System.out.println(MathUtility.subtract(4, 2));
    }

    public static int add(int intNumber1, int intNumber2) {
        return intNumber1 + intNumber2;
    }




}