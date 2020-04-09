package com.mlf.creational.builder;

public class Test {
    public static void main(String[] args) {
        CourseBuilder courseBuilder = new CourseActualBuilder();
        Coach coach = new Coach();
        coach.setCourseBuilder(courseBuilder);

        Course course = coach.makeCourse("java设计模式","java设计模式PPT","java设计模式video","java设计模式手记","java设计模式问答");

        System.out.println(course);
    }
}
