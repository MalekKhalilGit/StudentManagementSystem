package com.example.sms.entity;

import javax.persistence.*;

@Entity
@Table(name = "klassen")
public class Klasse{


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long klassenId;

    @Column(name = "klasseName", nullable = false)
    private static String klasseName;

    @Column(name = "studentKlasseNumber", nullable = false)
    private  int studentKlasseNumber;

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

    public static String getKlasseName() { return klasseName; }

    public Long getKlassenId() {
        return klassenId;
    }

    public void setId(Long id) {
        klassenId = id;
    }

    public void setKlasseName(String klasseName) {
        this.klasseName = klasseName;
    }

    public int getStudentKlasseNumber() {
        return studentKlasseNumber;
    }

    public void setStudentKlasseNumber(int studentKlasseNumber) {
        this.studentKlasseNumber = studentKlasseNumber;}
    }
