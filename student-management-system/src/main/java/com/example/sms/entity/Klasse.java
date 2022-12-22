package com.example.sms.entity;

import javax.persistence.*;

@Entity
@Table(name = "klassen")
public class Klasse {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Column(name = "klasseName", nullable = false)
    private  String klasseName;

    @Column(name = "studentKlasseNumber", nullable = false)
    private  int studentKlasseNumber;

    @OneToOne
    @JoinColumn(name = "student_id")
    private Student student;

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Klasse() {

    }


    public Klasse(String klassenName, int studentKlasseNumber) {
        this.klasseName = klassenName;
        this.studentKlasseNumber = studentKlasseNumber;
    }


    public Klasse(String klassenName) {
        this.klasseName = klassenName;
        this.studentKlasseNumber = 0;
    }


    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getKlasseName() {
        return klasseName;
    }

    public void setKlasseName(String klasseName) {
        this.klasseName = klasseName;
    }

    public int getStudentKlasseNumber() {
        return studentKlasseNumber;
    }

    public void setStudentKlasseNumber(int studentKlasseNumber) {
        this.studentKlasseNumber = studentKlasseNumber;
    }
}
