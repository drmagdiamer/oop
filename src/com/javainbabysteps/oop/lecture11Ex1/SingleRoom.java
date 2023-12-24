package com.javainbabysteps.oop.lecture11Ex1;

public class SingleRoom extends Room{
    public SingleRoom() {
    }

    public SingleRoom(String code, int number, Hotel hotel) {
        super(code, number, hotel);
    }

    @Override
    public String toString() {
        String result =  "SingleRoom{" +
                "code='" + code + '\'' +
                ", number=" + number +
                ", hotel is " + (this.hotel == null ? " not set ": this.hotel.getName()) ;
        result += "\n, have "+this.reservationList.size()+" reservation(s) ";
        for(int i=0; i< this.reservationList.size(); i++){
            result = result + "\n "+(i+1)+
                    " from "+this.reservationList.get(i).getStartDate() +
                    " to "+this.reservationList.get(i).getEndDate();
        }
        result += '}';
        return result;
    }
}
