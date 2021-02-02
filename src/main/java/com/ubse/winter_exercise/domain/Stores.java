package com.ubse.winter_exercise.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity(name = "stores")
public class Stores {

    @Id
    @GeneratedValue
    private int storeSeq;

    @ManyToOne
    @JoinColumn(name = "categorySeq")
    @JsonIgnore
    private Category category;

    @Column
    private String storeTitle;

    @Column
    private String mimAmount;

    @Column
    private String payMethod;

    @Column
    private String deliveryTime;

    @Column
    private String deliveryTip;

    @Column
    private String image;

    public int getStoreSeq() {
        return storeSeq;
    }

    public void setStoreSeq(int storeSeq) {
        this.storeSeq = storeSeq;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getStoreTitle() {
        return storeTitle;
    }

    public void setStoreTitle(String storeTitle) {
        this.storeTitle = storeTitle;
    }

    public String getMimAmount() {
        return mimAmount;
    }

    public void setMimAmount(String mimAmount) {
        this.mimAmount = mimAmount;
    }

    public String getPayMethod() {
        return payMethod;
    }

    public void setPayMethod(String payMethod) {
        this.payMethod = payMethod;
    }

    public String getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(String deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    public String getDeliveryTip() {
        return deliveryTip;
    }

    public void setDeliveryTip(String deliveryTip) {
        this.deliveryTip = deliveryTip;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
