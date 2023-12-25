package com.javainbabysteps.oop.lecture11Ex1;

import java.util.ArrayList;
import java.util.List;

public class Facility {
    private  String name;
    private  String code;
    private  String description;
    private List<Wing> availableInRooms;

    public Facility() {
        this.availableInRooms = new ArrayList<>();
    }

    public Facility(String name, String code, String description) {
        this();
        this.name = name;
        this.code = code;
        this.description = description;
    }

    public void addWing(Wing wing){
        this.availableInRooms.add(wing);
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Wing> getAvailableInRooms() {
        return availableInRooms;
    }

    public void setAvailableInRooms(List<Wing> availableInRooms) {
        this.availableInRooms = availableInRooms;
    }

    @Override
    public String toString() {
        String result =  "Facility{" +
                " name='" + name + '\'' +
                ", code='" + code + '\'' +
                ", description='" + description + '\'' ;
        result += "\n, available in  "+this.availableInRooms.size()+" wing(s) ";
        for(int i=0; i< this.availableInRooms.size(); i++){
            result = result + "\n "+(i+1)+
                    " wing in hotel "+
                    (this.availableInRooms.get(i).getHotel()==null?" not set ":this.availableInRooms.get(i).getHotel().getName())
                    +"  wing number "+this.availableInRooms.get(i).getNumber();
        }
        result += '}';
        return result;
    }
}
