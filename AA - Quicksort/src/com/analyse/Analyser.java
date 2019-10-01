package com.analyse;

import java.util.List;

public class Analyser {
    Logger logger;

    public Analyser(Logger logger) {
        this.logger = logger;
    }

    public void AnalyseList() {
        for (int i = 100000; i < 10000001; i+=100000) {
            Comparable[] unsortedArray = Generator.generateList(i);

            double startTime = System.currentTimeMillis();

            Comparable[] sortedArray = Sorter.quickSort(unsortedArray, 0, unsortedArray.length - 1);

            double stopTime = System.currentTimeMillis();
            double elapsedTime = stopTime - startTime;
            logger.log(Double.toString(elapsedTime));
        }
    }
}
