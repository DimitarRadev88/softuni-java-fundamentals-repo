package com.objectsAndClasses.lab.students;

import java.util.ArrayList;
import java.util.List;

public class StudentRegister implements Register {

    private List<Student> studentList;

    public StudentRegister() {
        this.studentList = new ArrayList<>();
    }

    @Override
    public List<Student> getStudentsFromTown(String town) {
        return studentList.stream().filter(student -> student.getHometown().equals(town)).toList();
    }

    @Override
    public void add(Student student) {
        studentList.add(student);
    }

    @Override
    public boolean contains(Student student) {
        return this.studentList.contains(student);
    }

    @Override
    public Student getStudent(Student student) {
        return studentList.stream().filter(s -> s.equals(student)).findFirst().get();
    }

}
