package com.example.demo;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Value;

@Component
public class HpPrinter implements Printer {
    @Value("${print.name:Unknown}")
    private String name;
    @Value("${printer.count}")
    private int count;

    @Override
    public void print(String meessage) {
        System.out.println(name +  " 印表機 : " + meessage);
        System.out.println("剩餘使用次數 : " + --count);
    }
}