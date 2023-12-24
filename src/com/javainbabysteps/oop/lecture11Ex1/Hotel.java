package com.javainbabysteps.oop.lecture11Ex1;

import java.util.ArrayList;
import java.util.List;

public class Hotel {
    protected String name;
    protected String code;
    protected List<Room> rooms;

    public Hotel() {
        this.rooms = new ArrayList<>();
    }

    public Hotel(String name, String code) {
        this();
        this.name = name;
        this.code = code;
    }

    public void addRoom(Room room){
        this.rooms.add(room);
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

    public List<Room> getRooms() {
        return rooms;
    }

    public void setRooms(List<Room> rooms) {
        this.rooms = rooms;
    }

    @Override
    public String toString() {
        String result =  "Hotel{" +
                "name='" + name + '\'' +
                ", code='" + code + '\'' ;
        result += "\n, have "+this.rooms.size()+" room(s) ";
        for(int i=0; i< this.rooms.size(); i++){
            result = result + "\n "+(i+1)+
                    " room "+this.rooms.get(i).getNumber()+ " type is a "+this.rooms.get(i).getClass().getSimpleName();
        }
        result += '}';
        return result;

    }
}
