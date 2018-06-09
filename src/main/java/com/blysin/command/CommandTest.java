package com.blysin.command;

import org.junit.Test;

/**
 * @author blysin
 * @since 2018/6/10
 */
public class CommandTest {
    @Test
    public void fun1(){
        //接受者，业务逻辑的具体实现类
        Receiver receiver = new Receiver();
        //Command命令接口，内部每个接口都对应着一个命令参数，然后控制receiver执行一系列操作，例如execute,undo,redo等，
        Command command = new ConcreteCommand(receiver);
        //调用者，持有一个Command对象，可以通过command提供的命令完成具体的业务操作
        Invoker invoker = new Invoker();
        invoker.setCommand(command);
        invoker.action();
    }
}
