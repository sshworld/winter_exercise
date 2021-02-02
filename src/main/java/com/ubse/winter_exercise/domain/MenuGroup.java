package com.ubse.winter_exercise.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity(name = "menuGroup")
public class MenuGroup {

    @Id
    @GeneratedValue
    private int menuGroupSeq;

    @ManyToOne
    @JoinColumn(name = "storeSeq")
    @JsonIgnore
    private Stores store;

    @Column
    private String groupNm;

    @Column
    private String groupExplain;

    public int getMenuGroupSeq() {
        return menuGroupSeq;
    }

    public void setMenuGroupSeq(int menuGroupSeq) {
        this.menuGroupSeq = menuGroupSeq;
    }

    public Stores getStore() {
        return store;
    }

    public void setStore(Stores store) {
        this.store = store;
    }

    public String getGroupNm() {
        return groupNm;
    }

    public void setGroupNm(String groupNm) {
        this.groupNm = groupNm;
    }

    public String getGroupExplain() {
        return groupExplain;
    }

    public void setGroupExplain(String groupExplain) {
        this.groupExplain = groupExplain;
    }
}
