package com.javainbabysteps.oop.lecture11Ex1;

import java.util.ArrayList;
import java.util.List;

public abstract class Room {
    protected String code;
    protected  int number;
    protected  Hotel hotel;
    protected List<Reservation> reservationList;

    public Room() {
        this.reservationList = new ArrayList<>();
        System.out.println("===> My Parent Constructor was called in Room ");
    }

    public Room(String code, int number, Hotel hotel) {
        this.reservationList = new ArrayList<>();
        this.code = code;
        this.number = number;
        this.hotel = hotel;
    }

    public void addReservation(Reservation r){
        this.reservationList.add(r);
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    public List<Reservation> getReservationList() {
        return reservationList;
    }

    public void setReservationList(List<Reservation> reservationList) {
        this.reservationList = reservationList;
    }


}
