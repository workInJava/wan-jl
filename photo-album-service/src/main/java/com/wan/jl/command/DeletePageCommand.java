package com.wan.jl.command;

public class DeletePageCommand extends Command {

    public DeletePageCommand(){
        super(new PageGroup());
    }

    public DeletePageCommand(Group group){
        super(group);
    }

    @Override
    void execute() {
        super.group.find();
        super.group.delete();
        super.group.plan();
    }
}
