package com.wan.jl.hello;

import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.*;

@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/greeting")
    public Greeting greeting(@RequestBody Map<String,String> param) {
        return new Greeting(counter.incrementAndGet(),
                            String.format(template, param));
    }

    @PutMapping("/greeting/{w}")
    public Greeting greetingPut(@PathVariable(name="w") String a,@RequestBody Map<String,String> param) {
        return new Greeting(counter.incrementAndGet(),
                String.format(template, param));
    }

    @PostMapping("/greeting/{a}")
    public Greeting greetingPost(@PathVariable(name="a") String a, @RequestBody Map<String,String> param) {
        return new Greeting(counter.incrementAndGet(),
                String.format(template, param));
    }







}