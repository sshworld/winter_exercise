package com.ubse.winter_exercise.domain;

import javax.persistence.*;

@Entity(name = "addr")
public class Addr {

    @Id
    @GeneratedValue
    private int addrSeq;

    @ManyToOne
    @JoinColumn(name = "userId")
    private Users user;

    @Column
    private String addrShip;

    @Column
    private String addrBasic;

    @Column
    private String addrDetail;

    public int getAddrSeq() {
        return addrSeq;
    }

    public void setAddrSeq(int addrSeq) {
        this.addrSeq = addrSeq;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }

    public String getAddrShip() {
        return addrShip;
    }

    public void setAddrShip(String addrShip) {
        this.addrShip = addrShip;
    }

    public String getAddrBasic() {
        return addrBasic;
    }

    public void setAddrBasic(String addrBasic) {
        this.addrBasic = addrBasic;
    }

    public String getAddrDetail() {
        return addrDetail;
    }

    public void setAddrDetail(String addrDetail) {
        this.addrDetail = addrDetail;
    }
}
