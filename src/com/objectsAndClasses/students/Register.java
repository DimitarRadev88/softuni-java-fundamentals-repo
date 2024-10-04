package com.objectsAndClasses.students;

import java.util.List;

public interface Register {
    List<Student> getStudentsFromTown(String town);

    void add(Student student);

    boolean contains(Student student);

    Student getStudent(Student student);
}
