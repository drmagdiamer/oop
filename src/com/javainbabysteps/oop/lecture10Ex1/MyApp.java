package com.javainbabysteps.oop.lecture10Ex1;

import javax.swing.*;

public class MyApp {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Please enter a number");
        int number = 0;
        try{
            number = Integer.parseInt(input);
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getClass().toString()+" : "+ ex.getMessage());
            JOptionPane.showMessageDialog(null, "number will be assigned the default value 3");
            number = 3;
        }
        System.out.println("Continue...");
        for(int i = 0; i<number; i++) {
            for(int j=0; j <number; j++) {
                if(i==j)
                    continue;
                System.out.print(" "+j);
            }
            System.out.println("");
        }
        System.out.println("Break...");
        for(int i = 0; i<5; i++) {
            for(int j=0; j <5; j++) {
                if(i==j)
                    break;
                System.out.print(" "+j);
            }
            System.out.println("");
        }


    }
}