package com.blysin.command;

/**
 * Command命令行为调用者和制定者直接解耦的工具，调用者通过命令来间接调用执行者
 *
 * @author blysin
 * @since 2018/6/10
 */
public class ConcreteCommand implements Command {
    private Receiver receiver;

    public ConcreteCommand(Receiver receiver){
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        this.receiver.action();
    }
}
