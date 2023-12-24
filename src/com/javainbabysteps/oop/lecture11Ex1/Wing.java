package com.javainbabysteps.oop.lecture11Ex1;

import java.util.ArrayList;
import java.util.List;

public class Wing extends Room{
    private List<Facility> facilityList;

    public Wing() {
        this.facilityList = new ArrayList<>();
    }

    public Wing(String code, int number, Hotel hotel) {
        super(code, number, hotel);
        this.facilityList = new ArrayList<>();
    }

    public void addFacility(Facility f){
        this.facilityList.add(f);
    }

    @Override
    public String toString() {
        String result =  "Wing{" +
                "code='" + code + '\'' +
                ", number=" + number +
                ", hotel is " + (this.hotel == null ? " not set ": this.hotel.getName()) ;
        result += "\n, have "+this.reservationList.size()+" reservation(s) ";
        for(int i=0; i< this.reservationList.size(); i++){
            result = result + "\n "+(i+1)+
                    " from "+this.reservationList.get(i).getStartDate() +
                    " to "+this.reservationList.get(i).getEndDate();
        }
        result += "\n, have "+this.facilityList.size()+" facility(ies) ";
        for(int i=0; i< this.facilityList.size(); i++){
            result = result + "\n "+(i+1)+
                    " facility for "+this.facilityList.get(i).getName();
        }
        result += '}';
        return result;
    }
}
