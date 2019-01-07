package com.analyse;

import java.util.List;

public class Analyser {
    List<Integer> unsorted;
    Logger logger;

    public Analyser(Logger logger) {
        this.logger = logger;
    }

    public void AnalyseList() {
        for (int i = 1; i < 10000; i++) {
            double startTime = System.currentTimeMillis();

            Comparable[] unsortedArray = Generator.generateList(i);
            Comparable[] sortedArray = Sorter.quickSort(unsortedArray, 0, unsortedArray.length - 1);

            double stopTime = System.currentTimeMillis();
            double elapsedTime = stopTime - startTime;
            logger.log(i + " items : gesorteerd in " + (elapsedTime / 1000) + " seconden");
        }
    }
}
