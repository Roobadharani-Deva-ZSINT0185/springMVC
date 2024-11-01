package com.SpringMVC.PracticeSpringMVC;

public class Alien {
    private int aid;
    public Alien(){}

    @Override
    public String toString() {
        return "Alien{" +
                "aid=" + aid +
                ", aname='" + aname + '\'' +
                '}';
    }

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    public Alien(int aid, String aname) {
        this.aid = aid;
        this.aname = aname;
    }

    private String aname;
}
