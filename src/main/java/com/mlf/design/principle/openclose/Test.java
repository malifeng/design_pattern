package com.mlf.design.principle.openclose;

import java.sql.SQLOutput;

public class Test {
    public static void main(String[] args) {
        ICourse course = new JavaDiscountCourse(86, "javascript", 11.2);
        System.out.println(course);
    }
}
