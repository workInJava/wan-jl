package com.wan.jl.hello;

import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

import com.wan.jl.base.StockHistoryDao;
import com.wan.jl.util.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();
    @Autowired
    public StockHistoryDao stockHistoryDao;

        @GetMapping("/greeting")
    public Greeting greeting(HttpServletRequest request) {
        return new Greeting(counter.incrementAndGet(),
                            String.format(template, request.getRemoteHost()));
    }

    @PutMapping("/greeting/{w}")
    public Greeting greetingPut(@PathVariable(name="w") String a,@RequestBody Map<String,String> param) {
        return new Greeting(counter.incrementAndGet(),
                String.format(template, param));
    }

    @PostMapping("/greeting/post")
    public Greeting greetingPost(@PathVariable(name="a") String a, @RequestBody Map<String,String> param) {

        stockHistoryDao.selectByDay(DateUtil.StringToDate("2020-07-01","yyyy-MM-dd"),DateUtil.StringToDate("2020-07-31","yyyy-MM-dd"));
        return new Greeting(counter.incrementAndGet(),
            String.format(template, param));
    }







}