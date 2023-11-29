package com.javainbabysteps.oop.lecture6Ex1;
import java.util.ArrayList;

public class Employee {
    private String  name;
    private int number;
    private ArrayList<Project> projectList;

    public Employee() {
        this.projectList = new ArrayList<>();
    }

    public Employee(String name, int number) {
        this();
        this.name = name;
        this.number = number;
    }

    public void addProject(Project p){
        this.projectList.add(p);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public ArrayList<Project> getProjectList() {
        return projectList;
    }

    public void setProjectList(ArrayList<Project> projectList) {
        this.projectList = projectList;
    }

    @Override
    public String toString() {
        String result =  "Employee{" +
                "name='" + name + '\'' +
                ", number=" + number ;
                //", projectList=" + projectList +
        result += ", Employee is working on "+this.projectList.size()+" projects";
        for(int i=0; i< projectList.size(); i++){
            result = result + "\n Project number "+(i+1)+
                    " code is "+projectList.get(i).code;
        }

        result += '}';
        return result;
    }
}
