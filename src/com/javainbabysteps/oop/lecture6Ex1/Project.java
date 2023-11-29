package com.javainbabysteps.oop.lecture6Ex1;
import java.util.ArrayList;
import java.util.Date;

public class Project {
    protected int code;
    protected Date startingDate;
    protected Date endingDate;
    protected ArrayList<Task> tasks;
    protected ArrayList<Employee> employees;

    public Project() {
        this.tasks = new ArrayList<>();
        this.employees = new ArrayList<>();
    }

    public Project(int code, Date startingDate, Date endingDate) {
        this();
        this.code = code;
        this.startingDate = startingDate;
        this.endingDate = endingDate;
    }

    public void addTask(Task t){
        this.tasks.add(t);
    }

    public void addEmployee(Employee e){
        this.employees.add(e);
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Date getStartingDate() {
        return startingDate;
    }

    public void setStartingDate(Date startingDate) {
        this.startingDate = startingDate;
    }

    public Date getEndingDate() {
        return endingDate;
    }

    public void setEndingDate(Date endingDate) {
        this.endingDate = endingDate;
    }

    public ArrayList<Task> getTasks() {
        return tasks;
    }

    public void setTasks(ArrayList<Task> tasks) {
        this.tasks = tasks;
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }

    @Override
    public String toString() {
        String result = "Project{" +
                "code=" + code +
                ", startingDate=" + startingDate +
                ", endingDate=" + endingDate ;
        result += ", Project has "+this.employees.size()+" employees";
        for(int i=0; i< employees.size(); i++){
            result = result + "\n Employee number "+(i+1)+
                    " name is "+employees.get(i).getName();
        }

        result += ", Project has "+this.tasks.size()+" tasks";
        for(int i=0; i< tasks.size(); i++){
            result = result + "\n Task number "+(i+1)+
                    "  is "+tasks.get(i).getDescription()+" and code is "+tasks.get(i).getCode();
        }

        result += '}';
        return result;

    }
}
