package com.example.SpringIOC;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {
    private int eid;
    private String ename;
    private String eadress;

    public Employee(){

    }

    @Override
    public String toString() {
        return "Employee{" +
                "eid=" + eid +
                ", ename='" + ename + '\'' +
                ", eadress='" + eadress + '\'' +
                '}';
    }

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getEadress() {
        return eadress;
    }

    public void setEadress(String eadress) {
        this.eadress = eadress;
    }
}
