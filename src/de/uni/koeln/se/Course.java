package de.uni.koeln.se;

public class Course {

    private int id;
    private String name;
    private int maxCapacity;
    private boolean isFull;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public boolean isFull() {
        return isFull;
    }

    public void setFull(boolean full) {
        isFull = full;
    }

    public void Course(int id, String name, int cap, Professor prof) {

    }

    public void enroll(Student student) {

    }

    public void apply(TA ta) {

    }

    public void setMaxCap(int max) {

    }

    public Professor getProf() {
        return null;

    }

    public TA getTA() {
        return null;

    }

    public void setTA(TA ta) {

    }

    public void setName(String name) {

    }

}
