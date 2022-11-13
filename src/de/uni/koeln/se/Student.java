package de.uni.koeln.se;

import java.util.Map;

public class Student {

    private int id;
    private String name;
    private Map projects;

    public void addProject(String name, Project project) {
        if(!projects.containsKey(name)) {
            projects.put(name, project);
            project.addStudent(name, this);
        }
    }

    public Student() {

    }

    public String getName() {
        return null;

    }

    public Project getProject() {
        return null;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
