package com.wan.jl.command;

public class Client {

    public static void main(String[] args){
        Invoker invoker = new Invoker();
        Command command = new AddRequirementCommand();
        invoker.setCommand(command);
        invoker.action();
    }
}
