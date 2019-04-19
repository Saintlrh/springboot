package com.leyou.web;

import com.leyou.pojo.User;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;


@Slf4j
@RestController

public class HelloWorldController {

    @GetMapping("hello.do")
    public String sayHello() {
        System.out.println("hello method is running !");
        return " hello spring boot ";
    }
}
