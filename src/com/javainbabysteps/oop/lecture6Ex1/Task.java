package com.javainbabysteps.oop.lecture6Ex1;
public class Task {
    private String code;
    private String description;
    private Project project;

    public Task() {
    }

    public Task(String code, String description, Project project) {
        this.code = code;
        this.description = description;
        this.project = project;
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

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    @Override
    public String toString() {
        return "Task{" +
                "code='" + code + '\'' +
                ", description='" + description + '\'' +
                //", project has a code " + project.getCode() +
                ", project "+ ((project == null)? " is null ": project.getCode()) +
                '}';
    }
}
