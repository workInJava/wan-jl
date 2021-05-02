package com.wan.jl;

import com.alibaba.fastjson.JSONObject;
import com.wan.jl.aop.TestWebLog;
import com.wan.jl.base.StockHistoryDao;
import com.wan.jl.util.DateUtil;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;

public class TestWebLogTest extends BaseTest {

    @Autowired
    public TestWebLog testWebLog;
    @Autowired
    public StockHistoryDao stockHistoryDao;

    @Test
    public void test01()throws Exception{
       List<Map<String,Object>> k = stockHistoryDao.selectByDay(DateUtil.StringToDate("2020-07-31","yyyy-MM-dd"),DateUtil.StringToDate("2020-03-13","yyyy-MM-dd"));
        System.out.println(JSONObject.toJSONString(k));
    }
}
