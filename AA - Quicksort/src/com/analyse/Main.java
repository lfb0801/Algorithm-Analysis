package com.analyse;

public class Main {

    public static void main(String[] args) {
	// write your code here
    Logger logger = new Logger();
    Analyser analyser = new Analyser(logger);
    analyser.AnalyseList();
    logger.printLog();
    }
}
