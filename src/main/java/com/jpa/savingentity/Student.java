package com.jpa.savingentity;

import jakarta.persistence.*;
import org.springframework.boot.autoconfigure.web.WebProperties;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(name = "enrollment_id" , nullable = false , unique = true)
    private String enrollmentId;

    public Student(){}
    public Student(String name, String enrollmentId)
    {
        this.name = name;
        this.enrollmentId = enrollmentId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", enrollmentId='" + enrollmentId + '\'' +
                '}';
    }
}
