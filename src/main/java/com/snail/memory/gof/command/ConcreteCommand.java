package com.snail.memory.gof.command;

import java.util.Observable;

/**
 * @program: ConcreteCommand
 * @description:
 * @author: wangf-q
 * @date: 2021-04-19 09:36
 **/
public class ConcreteCommand implements Command {
    private Receiver receiver;

    public ConcreteCommand(Receiver receiver) {
        this.receiver = receiver;

    }

    @Override
    public void execute() {
        this.receiver.action();
    }
}
