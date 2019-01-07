package com.analyse;

import java.util.Random;

public class Generator {
    private static Random rnd = new Random();

    public static Double[] generateList(int length){
        Double[] list =  new Double[length];
        for (int i = 0; i < list.length; i++) {
            list[i] = (rnd.nextDouble());
        }
        return list;
    }
}
