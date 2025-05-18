package org.example.homework1.models;

import org.example.homework1.interfaces.Printable;

public class Student implements Printable {
    private String name;
    private String recordBookNumber;
    private double averageGrade;

    public Student(String name, String recordBookNumber, double averageGrade) {
        this.name = name;
        this.recordBookNumber = recordBookNumber;
        this.averageGrade = averageGrade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRecordBookNumber() {
        return recordBookNumber;
    }

    public void setRecordBookNumber(String recordBookNumber) {
        this.recordBookNumber = recordBookNumber;
    }

    public double getAverageGrade() {
        return averageGrade;
    }

    public void setAverageGrade(double averageGrade) {
        this.averageGrade = averageGrade;
    }


    @Override
    public void print() {
        System.out.println("Student: " + name + ", Record Book: " + recordBookNumber + ", Average Grade: " + averageGrade);

    }
}
