package com.mlf.behavioral.templatemethod;

public class DesignPatternCourse extends ACourse {
    @Override
    void packageCourse() {
        System.out.println("提供java源代码");
    }

    @Override
    protected boolean neewWriteArticle() {
        return true;
    }
}
