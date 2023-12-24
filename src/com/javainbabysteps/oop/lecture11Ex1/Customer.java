package com.javainbabysteps.oop.lecture11Ex1;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private String code;
    private List<Reservation> reservations;

    public Customer() {
        this.reservations = new ArrayList<>();
    }

    public Customer(String name, String code) {
        this();
        this.name = name;
        this.code = code;
    }

    public void addReservation(Reservation room){
        this.reservations.add(room);
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

    public List<Reservation> getReservations() {
        return reservations;
    }

    public void setReservations(List<Reservation> reservations) {
        this.reservations = reservations;
    }

    @Override
    public String toString() {
        String result = "Customer{" +
                "name='" + name + '\'' +
                ", code='" + code + '\'' ;
        result += "\n, have "+this.reservations.size()+" reservation(s) ";
        for(int i=0; i< this.reservations.size(); i++){
            result = result + "\n "+(i+1)+
                    " reservation for "+this.reservations.get(i).getRooms().size()+" room(s) "+
                    " from "+this.reservations.get(i).getStartDate() +
                    " to "+this.reservations.get(i).getEndDate();
        }
        result += '}';
        return result;
    }
}
