package org.example.homework2;

import java.util.ArrayList;
import java.util.List;

public class StudentManager {
    private List<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
    }

    public boolean removeStudentById(int id) {
        return students.removeIf(s -> s.getId() == id);
    }

    public List<Student> getAllStudents() {
        return new ArrayList<>(students);
    }
}
