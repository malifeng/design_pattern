package com.mlf.structural.composite;

public class Test {
    public static void main(String[] args) {
        CatalogComponent linuxCourse = new Course("linux", 11);
        CatalogComponent windowCourse = new Course("windows课程", 12);
        CatalogComponent javaCourseCatalog = new CouseCatalog("java课程目录");


        CatalogComponent mmallCouse1 = new Course("java一期",20);
        CatalogComponent mmallCouse2 = new Course("java二期",30);
        CatalogComponent designpattern = new Course("java设计模式",30);

        javaCourseCatalog.add(mmallCouse1);
        javaCourseCatalog.add(mmallCouse2);
        javaCourseCatalog.add(designpattern);

        CatalogComponent mlfCatalog = new CouseCatalog("主目录");
        mlfCatalog.add(linuxCourse);
        mlfCatalog.add(windowCourse);
        mlfCatalog.add(javaCourseCatalog);

        mlfCatalog.print();



    }
}
