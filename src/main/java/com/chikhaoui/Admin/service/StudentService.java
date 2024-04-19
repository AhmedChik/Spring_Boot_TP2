package com.chikhaoui.Admin.service;

import com.chikhaoui.Admin.model.Student;

import java.util.List;

public interface StudentService {
    void createStudent(Student student);
    Student findById(int id);
    void displayAllStudents();
}