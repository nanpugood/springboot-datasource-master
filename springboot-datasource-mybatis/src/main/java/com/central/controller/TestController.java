package com.central.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.central.service.TestService;

@RestController
public class TestController {

    private final TestService testService;

    @Autowired
    public TestController(TestService testService) {
        this.testService = testService;
    }

    @GetMapping("/getAll")
    public Object getAll(){
        return testService.getAll();
    }

    @GetMapping("insertOne")
    public void insertOne(){
        testService.insertOne();
    }

    @GetMapping("readAndWrite")
    public void readAndWrite(){
        testService.testReadAndWrite();
    }

    @GetMapping("transInsert")
    public void transInsert(){
        testService.transInsert();
    }

}
