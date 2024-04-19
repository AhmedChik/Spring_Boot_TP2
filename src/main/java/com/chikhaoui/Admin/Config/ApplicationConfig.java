package com.chikhaoui.Admin.Config;

import com.chikhaoui.Admin.repositery.InMemoryStudentRepository;
import com.chikhaoui.Admin.repositery.StudentRepository;
import com.chikhaoui.Admin.service.StudentService;
import com.chikhaoui.Admin.service.StudentServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

    @Bean
    public StudentRepository studentRepository() {
        return new InMemoryStudentRepository();
    }

    @Bean
    public StudentService studentService(StudentRepository studentRepository) {
        return new StudentServiceImpl(studentRepository);
    }


}
