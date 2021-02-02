package com.ubse.winter_exercise.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity(name = "orderMenu")
public class OrderMenu {

    @Id
    @GeneratedValue
    private int orderMenuSeq;

    @ManyToOne
    @JoinColumn(name = "orderSeq")
    @JsonIgnore
    private Orders order;

    @ManyToOne
    @JoinColumn(name = "menuSeq")
    private Menu menu;

    @Column
    private int orderCount;

    public int getOrderMenuSeq() {
        return orderMenuSeq;
    }

    public void setOrderMenuSeq(int orderMenuSeq) {
        this.orderMenuSeq = orderMenuSeq;
    }

    public Orders getOrder() {
        return order;
    }

    public void setOrder(Orders order) {
        this.order = order;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public int getOrderCount() {
        return orderCount;
    }

    public void setOrderCount(int orderCount) {
        this.orderCount = orderCount;
    }
}
