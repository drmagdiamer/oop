package com.javainbabysteps.oop.lecture11Ex1;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Reservation {
    private String code;
    private Date startDate;
    private Date endDate;
    private List<Room> rooms;
    private Customer customer;

    public Reservation() {
        this.rooms = new ArrayList<>();
    }

    public Reservation(String code, Date startDate, Date endDate, Customer customer) {
        this();
        this.code = code;
        this.startDate = startDate;
        this.endDate = endDate;
        this.customer = customer;
    }

    public void addRoom(Room room){
        this.rooms.add(room);
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public void setRooms(List<Room> rooms) {
        this.rooms = rooms;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        String result =  "Reservation{" +
                "code='" + code + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", customer " + ((this.customer == null)? "is not set": this.customer.getName() +"["+this.customer.getCode()+"]" );
        result += "\n, have "+this.rooms.size()+" room(s) ";
        for(int i=0; i< this.rooms.size(); i++){
            result = result + "\n "+(i+1)+
                    " room in hotel "+(this.rooms.get(i).getHotel()==null?" not set ":this.rooms.get(i).getHotel().getName())
                    +"  room number "+this.rooms.get(i).getNumber();
        }
        result += '}';
        return result;
    }
}
