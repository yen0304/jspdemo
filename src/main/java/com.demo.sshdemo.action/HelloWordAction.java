package com.demo.sshdemo.action;

public class HelloWordAction {
    public  String helloWord(){
        System.out.println("成功訪問HelloWord  Action");
        System.out.println("呼叫Service");
        return "success";
    }
}
