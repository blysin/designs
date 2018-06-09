package com.blysin.command;

import lombok.Data;

/**
 * 调用者，实际上是调用执行者来完成的
 * @author blysin
 * @since 2018/6/10
 */
public class Invoker {
    private Command command;

    public void action(){
        this.command.execute();
    }

    public Command getCommand() {
        return command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }
}
