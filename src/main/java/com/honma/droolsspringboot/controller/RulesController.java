package com.honma.droolsspringboot.controller;

import com.honma.droolsspringboot.entity.Order;
import com.honma.droolsspringboot.service.RulesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * dev mofified
 * @Author: lijunjie
 * @Date: 2022/12/4
 */
@RestController
@RequestMapping("/rule")
public class RulesController {

    @Autowired
    private RulesService ruleService;


    @GetMapping("/saveOrder")
    public Order saveOrder(Order order){
        System.out.println("hello,world");
        return ruleService.executeOrderRule(order);
    }
}
