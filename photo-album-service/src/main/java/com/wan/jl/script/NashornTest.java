package com.wan.jl.script;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class NashornTest {


    private static final ScriptEngine NASHORN_ENGINE = new ScriptEngineManager().getEngineByName("nashorn");


    public static void main(String[] agrs) throws ScriptException {
        NASHORN_ENGINE.eval("print('Hello World!');");
    }
}
