package com.example.sms.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "klassen")
public class Klasse {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long klassenId;

    @Column(name = "klasseName", nullable = false)
    private  String klasseName;

    @Column(name = "studentKlasseNumber", nullable = false)
    private  int studentKlasseNumber;

    private List<Student> studentList = new ArrayList<>();

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


    public Long getKlassenId() {
        return klassenId;
    }

    public void setId(Long id) {
        klassenId = id;
    }

    public static String getKlasseName() {
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

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }
}
