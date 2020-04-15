package com.mlf.structural.bridge;

public class ABCBank extends Bank {
    public ABCBank(Account account){
        super(account);
    }

    @Override
    Account openAccount() {
        System.out.println("打开中国农业银行账号");
        account.openAccount();
        return account;
    }
}
