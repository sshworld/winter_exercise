package com.ubse.winter_exercise.domain;

import javax.persistence.*;

@Entity(name = "menu")
public class Menu {

    @Id
    @GeneratedValue
    private int menuSeq;

    @ManyToOne
    @JoinColumn(name = "menuGroupSeq")

    private MenuGroup menuGroup;

    @Column
    private String menuTitle;

    @Column
    private String menuSub;

    @Column
    private String menuPrice;

    @Column
    private String mainYN;

    public int getMenuSeq() {
        return menuSeq;
    }

    public void setMenuSeq(int menuSeq) {
        this.menuSeq = menuSeq;
    }

    public MenuGroup getMenuGroup() {
        return menuGroup;
    }

    public void setMenuGroup(MenuGroup menuGroup) {
        this.menuGroup = menuGroup;
    }

    public String getMenuTitle() {
        return menuTitle;
    }

    public void setMenuTitle(String menuTitle) {
        this.menuTitle = menuTitle;
    }

    public String getMenuSub() {
        return menuSub;
    }

    public void setMenuSub(String menuSub) {
        this.menuSub = menuSub;
    }

    public String getMenuPrice() {
        return menuPrice;
    }

    public void setMenuPrice(String menuPrice) {
        this.menuPrice = menuPrice;
    }

    public String getMainYN() {
        return mainYN;
    }

    public void setMainYN(String mainYN) {
        this.mainYN = mainYN;
    }
}
