package com.javainbabysteps.oop.lecture7Ex1;

import java.util.Date;

public class Contract {
    private String telephone;
    private Date startDate;
    private Plan plan;
    private Customer customer;

    public Contract(String telephone, Date startDate, Plan plan, Customer customer) {
        this.telephone = telephone;
        this.startDate = startDate;
        this.plan = plan;
        this.customer = customer;
    }

    public Contract(String telephone, Date startDate) {
        this.telephone = telephone;
        this.startDate = startDate;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Plan getPlan() {
        return plan;
    }

    public void setPlan(Plan plan) {
        this.plan = plan;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "telephone='" + telephone + '\'' +
                ", startDate=" + startDate +
                ", plan " + ((plan == null)?"is null":" name is "+plan.getName()) +
                ", customer " + ((customer == null)?"is null":" name is "+customer.getName()+" and ID "+customer.getNationalId()) +
                '}';
    }
}
