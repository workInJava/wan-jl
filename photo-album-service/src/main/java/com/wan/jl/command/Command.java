package com.wan.jl.command;

public abstract class Command {

//    protected CodeGroup cg = new CodeGroup();
//    protected RequirementGroup rg = new RequirementGroup();
//    protected PageGroup pg = new PageGroup();

    protected final Group group;

    public Command(Group group){
        this.group = group;
    }

    abstract void execute();
}
