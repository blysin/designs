package com.blysin.observer;

import java.util.Observable;

/**
 * 事件源（被观察者）
 * @author blysin
 * @since 2018/6/10
 */
public class Observer extends Observable {

    //触发事件，并修改状态为onchange
    public void sendMsg(String msg) {
        System.out.println("模拟发送了一条信息："+msg);
        setChanged();
    }
}
