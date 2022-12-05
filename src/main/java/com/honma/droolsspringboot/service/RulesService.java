package com.honma.droolsspringboot.service;

import com.honma.droolsspringboot.entity.Order;
import org.kie.api.KieBase;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * beta
 * @Author: lijunjie
 * @Date: 2022/12/4
 */
//@Service
public class RulesService {
    @Autowired
    private KieBase kieBase;
    /**
     * 执⾏订单⾦额积分规则
     */
    public Order executeOrderRule(Order order){
        KieSession kieSession = kieBase.newKieSession();
        kieSession.insert(order);
        kieSession.fireAllRules();
        kieSession.dispose();
        return order;
    }
}
