package com.mlf.creational.builder.v2;

import com.google.common.collect.ImmutableSet;

import java.util.Set;

public class Test {
    public static void main(String[] args) {
        Course course = new Course.CourseBuilder().buildCourseName("JAVA设计模式精讲").buildCourseArticle("JAVA设计模式文章").buildCoursePPT("JAVA设计模式精讲PPT").buildCourseQA("JAVA设计模式精讲问题").buildCourseVideo("JAVA设计模式精讲视频").build();
        System.out.println(course);

        Set<String> set = ImmutableSet.<String>builder().add("a").add("b").add("c").build();
        System.out.println(set);

    }
}
