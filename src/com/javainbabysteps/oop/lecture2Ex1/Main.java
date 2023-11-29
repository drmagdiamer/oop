package com.javainbabysteps.oop.lecture2Ex1;
import javax.swing.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int i;
        int m = 0;
        i = m +1;
        System.out.println(" i is "+i);
        i = i +5;
        System.out.println(" i is "+i);

        float z = 10.2F;
        System.out.println(" z is "+z);

        JOptionPane.showMessageDialog(null, "Hello");
        JOptionPane.showMessageDialog(null, "Hello 2", "My Message", JOptionPane.ERROR_MESSAGE);

        String value = JOptionPane.showInputDialog("Please enter your grade");

        int intValue = Integer.parseInt(value);

        float x = Float.parseFloat(value);

        if(intValue >= 60 ) {
            JOptionPane.showMessageDialog(null, "Great!");
            JOptionPane.showMessageDialog(null, "You succeeded");
        }
        else
            JOptionPane.showMessageDialog(null, "You failed");

        String starsStr = JOptionPane.showInputDialog("Please enter the number of stars");

        int stars = Integer.parseInt(starsStr);
        for(int k = 0; k<stars; k++) {
            for (int j = 0; j < stars; j++) {
                //System.out.println("Hello, k is " + k+ " j is "+j);
                if(j<=k)
                    System.out.print("*");
            }
            System.out.println("");
        }


        int n = 5;
        int[] ar;
        ar = new int[5];
        ar[0] = 1;
        ar[1] = 12;
        ar[2] = 16;
        ar[3] = 15;
        ar[4] = 7;

        for(int j = 0; j< ar.length; j++){
            System.out.println("x["+j+"] is equal to "+ar[j]);
        }

        //int -> Integer
        //float -> Float

        ArrayList<Integer> data = new ArrayList<>();
        data.add(1);
        data.add(12);
        data.add(16);
        data.add(15);
        data.add(7);

        for(int j = 0; j< data.size(); j++){
            System.out.println("data element "+j+" is equal to "+ data.get(j));
        }






    }






}
