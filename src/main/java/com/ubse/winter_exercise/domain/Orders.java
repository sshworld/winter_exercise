package com.ubse.winter_exercise.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Date;

@Entity(name = "orders")
public class Orders {

    @Id @GeneratedValue
    private int orderSeq;

    @ManyToOne
    @JoinColumn(name = "userId")
    @JsonIgnore
    private Users user;

    @Column
    private String orderAddr;

    @Column
    private String orderPhone;

    @Column
    private String orderCommentBoss;

    @Column
    private String orderCommentRider;

    @Column
    private String orderAmount;

    @Column
    private String orderWay;

    @Column
    private String deliveryYN;

    @Column
    private Date createAt;

    public int getOrderSeq() {
        return orderSeq;
    }

    public void setOrderSeq(int orderSeq) {
        this.orderSeq = orderSeq;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }

    public String getOrderAddr() {
        return orderAddr;
    }

    public void setOrderAddr(String orderAddr) {
        this.orderAddr = orderAddr;
    }

    public String getOrderPhone() {
        return orderPhone;
    }

    public void setOrderPhone(String orderPhone) {
        this.orderPhone = orderPhone;
    }

    public String getOrderCommentBoss() {
        return orderCommentBoss;
    }

    public void setOrderCommentBoss(String orderCommentBoss) {
        this.orderCommentBoss = orderCommentBoss;
    }

    public String getOrderCommentRider() {
        return orderCommentRider;
    }

    public void setOrderCommentRider(String orderCommentRider) {
        this.orderCommentRider = orderCommentRider;
    }

    public String getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(String orderAmount) {
        this.orderAmount = orderAmount;
    }

    public String getOrderWay() {
        return orderWay;
    }

    public void setOrderWay(String orderWay) {
        this.orderWay = orderWay;
    }

    public String getDeliveryYN() {
        return deliveryYN;
    }

    public void setDeliveryYN(String deliveryYN) {
        this.deliveryYN = deliveryYN;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }
}
