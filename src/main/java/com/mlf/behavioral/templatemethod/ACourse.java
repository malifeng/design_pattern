package com.mlf.behavioral.templatemethod;

import java.sql.SQLOutput;

public abstract class ACourse {
    protected final void makeCourse(){
        this.makePPT();
        this.makeVideo();
        if(neewWriteArticle()){
            this.writeArticle();
        }
        this.packageCourse();
    }

    final void makePPT(){
        System.out.println("制作ppt");
    }

    final void makeVideo(){
        System.out.println("制作视频");
    }

    final void writeArticle(){
        System.out.println("编写手记");
    }

    // 钩子方法
    protected boolean neewWriteArticle(){
        return false;
    }

    abstract void packageCourse();

}
