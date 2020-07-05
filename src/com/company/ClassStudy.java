package com.company;

import java.util.Date;

public class ClassStudy {
    static int s;
    static {
        s = ClassStudy.i;
        System.out.println(s);
    }
    static int i = 10;

    public static void main(String[] args) {
        System.out.println(ClassStudy.i);
    }
}
