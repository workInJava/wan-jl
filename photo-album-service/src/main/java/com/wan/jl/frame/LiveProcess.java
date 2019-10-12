package com.wan.jl.frame;

/**
 * 生活，
 */
public interface LiveProcess {


    void init();

    <T> T work();


    void note();


    void fallIll();


    void dead();
}
