package com.wan.jl.base;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;
import java.util.Map;
@Mapper
public interface StockHistoryDao {

    List<Map<String,Object>> selectByDay(@Param("startDate") Date startDate,@Param("endDate")Date endDate);
}
