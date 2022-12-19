package com.example.sms.entity;

import javax.persistence.*;

@Entity
@Table(name = "classes")
public class Class {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Column(name = "className", nullable = false)
    private  String className;

    @Column(name = "studentClassNumber", nullable = false)
    private  int studentClassNumber;

    public Class() {

    }

    public Class(String className, int studentClassNumber) {
        this.className = className;
        this.studentClassNumber = studentClassNumber;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public int getStudentClassNumber() {
        return studentClassNumber;
    }

    public void setStudentClassNumber(int studentClassNumber) {
        this.studentClassNumber = studentClassNumber;
    }
}
