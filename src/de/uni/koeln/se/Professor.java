package de.uni.koeln.se;

import java.util.ArrayList;
import java.util.List;

public class Professor extends Employee{

    private List exams;

    public Professor() {
        super();
        exams = new ArrayList();
    }

    public void addExam(Exam exam) {
        if(!exams.contains(exam)) {
            exams.add(exam);
            exam.addProfs(this);
        }
    }

    public void publicCourse() {

    }

    public void assignTA() {

    }

    public void addCourse() {

    }
}
