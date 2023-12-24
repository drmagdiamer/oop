package com.javainbabysteps.oop.lecture11Ex1;

public class DoubleRoom extends Room{
    private int maximumOccupants;

    public DoubleRoom() {
    }

    public DoubleRoom(String code, int number, Hotel hotel, int maximumOccupants) {
        super(code, number, hotel);
        this.maximumOccupants = maximumOccupants;
    }

    public int getMaximumOccupants() {
        return maximumOccupants;
    }

    public void setMaximumOccupants(int maximumOccupants) {
        this.maximumOccupants = maximumOccupants;
    }

    @Override
    public String toString() {
        String result =  "Double Room{" +
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
