package com.analyse;

import java.util.ArrayList;
import java.util.List;

public class Logger {
    List<String> records;

    public Logger() {
        records = new ArrayList<>();
    }

    public void log(String string) {
        records.add(string);
    }

    public void printLog() {
        for (String s : records) {
            System.out.println(s);
        }
    }
}
