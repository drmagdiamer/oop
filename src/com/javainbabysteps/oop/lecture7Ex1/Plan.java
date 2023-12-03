package com.javainbabysteps.oop.lecture7Ex1;

import java.util.ArrayList;

public class Plan {
    private String name;
    private String code;
    private float monthlyFee;
    private float perMinute;
    private ArrayList<Contract> contractList;

    public Plan() {
        this.contractList = new ArrayList<>();
    }

    public Plan(String name, String code, float monthlyFee, float perMinute) {
        this();
        this.name = name;
        this.code = code;
        this.monthlyFee = monthlyFee;
        this.perMinute = perMinute;
    }

    public void addContract(Contract c){
        this.contractList.add(c);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public float getMonthlyFee() {
        return monthlyFee;
    }

    public void setMonthlyFee(float monthlyFee) {
        this.monthlyFee = monthlyFee;
    }

    public float getPerMinute() {
        return perMinute;
    }

    public void setPerMinute(float perMinute) {
        this.perMinute = perMinute;
    }

    public ArrayList<Contract> getContractList() {
        return contractList;
    }

    public void setContractList(ArrayList<Contract> contractList) {
        this.contractList = contractList;
    }

    @Override
    public String toString() {
        String result =  "Plan{" +
                "name='" + name + '\'' +
                ", code='" + code + '\'' +
                ", monthlyFee=" + monthlyFee +
                ", perMinute=" + perMinute +
                ", and has "+this.contractList.size()+" customer(s) ";

        for(Contract c: this.contractList){
            result += "\n Customer is "+c.getCustomer().getName();
        }
                //", contractList=" + contractList +
        result +=        '}';
        return result;
    }
}
