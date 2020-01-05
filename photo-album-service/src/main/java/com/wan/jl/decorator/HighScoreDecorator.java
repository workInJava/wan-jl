package com.wan.jl.decorator;

public class HighScoreDecorator extends Decorator {


    public HighScoreDecorator(SchoolReport schoolReport) {
        super(schoolReport);
    }

    private void reportHighScore(){
        System.out.println("这次考试语文最高分75，数学最高分是78，自然是80");
    }

    public void report(){
        this.reportHighScore();
        super.report();
    }
}
