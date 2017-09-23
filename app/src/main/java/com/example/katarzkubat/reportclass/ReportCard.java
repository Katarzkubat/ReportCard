package com.example.katarzkubat.reportclass;

import java.util.ArrayList;

public class ReportCard {
    private ArrayList<String> subject = new ArrayList<String>();
    private ArrayList<Double> grade = new ArrayList<Double>();
    private String studentName;
    private double averageGrade;

    public ReportCard(String studentName, ArrayList<Double> grade, ArrayList<String> subject) {
        this.studentName = studentName;
        this.grade = grade;
        this.subject = subject;
    }

    public ArrayList<String> getSubject(){
        return subject;
    }

    public void setSubject(ArrayList<String> subject) {
        this.subject = subject;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String name) {
       studentName = name;
    }

    public ArrayList<Double> getGrade() {
        return grade;
    }

    public void setGrade(ArrayList<Double> grade) {
        this.grade = grade;
    }

    public double getAverageGrade() {
        double sum = 0;
        for (int i = 0; i < grade.size(); i++) {
            sum = sum + grade.get(i);
        }
        averageGrade = sum/grade.size();
        return averageGrade;
    }

    public String toString(){

        return "Student: " + studentName + "\n"
                + "Subjects: " + subject.toString() + "\n"
                + "Grade: " + grade.toString() + "\n"
                + "Average: " + getAverageGrade();
    }

}