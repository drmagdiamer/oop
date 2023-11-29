package com.javainbabysteps.oop.lecture4Ex1;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee("E100","Ahmed");
        Employee e2 = new Employee("E217","Mina");
        Employee e3 = new Employee("E412","Mona");

        ArrayList<Employee> data = new ArrayList<Employee>();
        data.add(e1);
        data.add(e2);
        data.add(e3);

        for(int j = 0; j< data.size(); j++){
            System.out.println("data element "+j+" is equal to "+ data.get(j));
        }

        for(Employee emp: data){
            System.out.println("data element is equal to "+ emp);
        }


    }
}