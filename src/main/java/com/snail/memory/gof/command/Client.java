package com.snail.memory.gof.command;

/**
 * @program: Client
 * @description:
 * @author: wangf-q
 * @date: 2021-04-19 09:49
 **/
public class Client {
    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        Command command = new ConcreteCommand(receiver);
        Invoker invoker = new Invoker();
        invoker.setCommand(command);
        invoker.action();
    }
}
