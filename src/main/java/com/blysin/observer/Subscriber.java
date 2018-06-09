package com.blysin.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * 观察者(订阅者)
 * @author blysin
 * @since 2018/6/10
 */
public class Subscriber implements Observer {
    private String name;
    private String message;
    public Subscriber(String name){
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        this.message = (String) arg;
        read();
    }

    public void read(){
        System.out.println(name +"接收数据："+message);
    }
}
