package com.snail.memory.gof.command;

/**
 * @program: Invoker
 * @description:
 * @author: wangf-q
 * @date: 2021-04-19 09:47
 **/
public class Invoker {
    private Command command;
    public void setCommand(Command command){
        this.command = command;
    }
    public void action(){
        this.command.execute();
    }
}
