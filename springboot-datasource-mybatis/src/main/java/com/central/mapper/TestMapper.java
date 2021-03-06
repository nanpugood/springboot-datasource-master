package com.central.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.central.entity.Test;

public interface TestMapper {
    /**
     * 获取全部数据
     * @return List<Test>
     */
    List<Test> getAll();

    /**
     * 插入一条数据
     * @param test 数据
     */
    void insertOne(@Param("test") Test test);
}
