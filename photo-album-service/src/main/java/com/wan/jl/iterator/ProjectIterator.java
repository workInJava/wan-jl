package com.wan.jl.iterator;

import java.util.ArrayList;

public class ProjectIterator implements IProjectIterator {

    private ArrayList<IProject> projectArrayList = new ArrayList<>();
    private int currentItem = 0;

    public ProjectIterator(ArrayList<IProject> projectArrayList){
        this.projectArrayList = projectArrayList;
    }

    @Override
    public boolean hasNext() {
        boolean b = true;
        if(this.currentItem>=projectArrayList.size()||this.projectArrayList.size()==0){
            b = false;
        }
        return b;
    }

    @Override
    public IProject next() {
        return (IProject)this.projectArrayList.get(this.currentItem++);
    }

    public void remove(){

    }
}
