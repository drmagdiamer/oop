package com.javainbabysteps.oop.lecture7Ex1;

import java.util.ArrayList;

public class Customer {
    private String name;
    private String address;
    private int nationalId;
    private ArrayList<Contract> subscriptionContracts;

    public Customer() {
        this.subscriptionContracts = new ArrayList<>();
    }

    public Customer(String name, String address, int nationalId) {
        this();
        this.name = name;
        this.address = address;
        this.nationalId = nationalId;
    }

    public void addContract(Contract c){
        this.subscriptionContracts.add(c);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNationalId() {
        return nationalId;
    }

    public void setNationalId(int nationalId) {
        this.nationalId = nationalId;
    }

    public ArrayList<Contract> getSubscriptionContracts() {
        return subscriptionContracts;
    }

    public void setSubscriptionContracts(ArrayList<Contract> subscriptionContracts) {
        this.subscriptionContracts = subscriptionContracts;
    }

    @Override
    public String toString() {
        String result =  "Customer{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", nationalId=" + nationalId +
                ", and has "+this.subscriptionContracts.size()+" contract ";
        for(int i =0; i< this.subscriptionContracts.size(); i++){
            result += "\n plan "+(i+1)+" is "+this.subscriptionContracts.get(i).getPlan().getName();
        }
        result +=        '}';
        return result;
    }
}
