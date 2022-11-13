package de.uni.koeln.se;

import java.util.Map;

public class Project {

    private String name;
    private Map students;

    public void addStudent(String name, Student student) {
        if(!students.containsKey(student)) {
            students.put(student, name);
            student.addProject(name, this);
        }
    }

    public Project() {

    }

    public String getName() {
        return null;
    }

    private void setName(String name) {

    }

    public void addMember(Student student) {

    }

    public Student getMembers() {
        return null;
    }
}
