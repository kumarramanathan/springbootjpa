package com.jpa.savingentity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;

public class StudentClient  implements ApplicationRunner {

    @Autowired
    private final StudentRepository studentRepository;

    public StudentClient(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Student student = new Student("kumar","23");
        studentRepository.save(student);
    }
}
