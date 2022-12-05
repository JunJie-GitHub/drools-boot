package com.honma.droolsspringboot.entity;

/**
 * @Author: lijunjie
 * @Date: 2022/12/4
 */
public class Order {

    private Long amount;

    private Integer score;

    @Override
    public String toString() {
        return "Order{" +
                "amount=" + amount +
                ", score=" + score +
                '}';
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }
}
