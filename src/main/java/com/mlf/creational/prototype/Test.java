package com.mlf.creational.prototype;

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Mail mail = new Mail();
        mail.setContent("初始化模板");

        for (int i = 0; i < 10; i++) {
            Mail mailTmp = (Mail) mail.clone();
            mailTmp.setName("姓名"+i);
            mailTmp.setEmailAddress("姓名"+i+"@163.com");
            mailTmp.setContent("恭喜您，中奖了");
            Util.sendMail(mail);
        }

        Util.saveOriginMailRecord(mail);
    }
}
