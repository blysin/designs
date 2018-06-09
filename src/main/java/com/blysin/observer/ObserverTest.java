package com.blysin.observer;

import org.junit.Test;

import java.util.Observable;


/**
 * @author blysin
 * @since 2018/6/10
 */
public class ObserverTest {
    @Test
    public void fun1(){
        Observer observable = new Observer();
        observable.addObserver(new Subscriber("blysin"));
        observable.addObserver(new Subscriber("戴少坤"));
        observable.addObserver(new Subscriber("罗辛恬"));
        observable.addObserver(new Subscriber("柯阿敏"));

        observable.sendMsg("群发消息，哈哈");
        observable.notifyObservers("hello world");

        while (true) {

        }

    }
}
