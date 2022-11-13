package de.uni.koeln.se;

import java.util.ArrayList;
import java.util.List;

public class Exam {

    private int maxValue;
    private List profs;

    public Exam() {
        profs = new ArrayList();
    }

    public void addProfs(Professor professor) {
        if(!profs.contains(professor)) {
            profs.add(professor);
            professor.addExam(this);
        }
    }

    public int getMaxValue() {
        return maxValue;
    }

    public void setMaxValue(int maxValue) {
        this.maxValue = maxValue;
    }

    public Exam(Question question) {

    }

    public boolean register(Student student) {
        return false;
    }

    public void addQuestion(int id, String task, int value) {

    }

    public Student getRegisteredStudents() {
        return null;
    }

    public void MaxValue(int max) {

    }

}
