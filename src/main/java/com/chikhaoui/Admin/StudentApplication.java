package com.chikhaoui.Admin;

import com.chikhaoui.Admin.model.Student;
import com.chikhaoui.Admin.repositery.InMemoryStudentRepository;
import com.chikhaoui.Admin.repositery.StudentRepository;
import com.chikhaoui.Admin.service.StudentService;
import com.chikhaoui.Admin.service.StudentServiceImpl;
import com.chikhaoui.Admin.service.StudentServiceMock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentApplication {


	public static void main(String[] args) {
		// Création d'une instance de StudentServiceImpl en lui passant l'instance de StudentRepository
		StudentServiceMock studentServiceMock = new StudentServiceMock();

      // Affichage de tous les étudiants
		studentServiceMock.displayAllStudents();
		studentServiceMock.findById(2);


	}}
