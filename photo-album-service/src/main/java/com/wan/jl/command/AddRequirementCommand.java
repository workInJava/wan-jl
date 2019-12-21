package com.wan.jl.command;

public class AddRequirementCommand extends Command {

    public AddRequirementCommand(){
        super(new RequirementGroup());
    }

    public AddRequirementCommand(Group group){
        super(group);
    }

    @Override
    void execute() {
        super.group.find();
        super.group.add();
        super.group.plan();
    }
}
