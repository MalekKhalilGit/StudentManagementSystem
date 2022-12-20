package com.example.sms.service;

import com.example.sms.entity.Klasse;

import java.util.List;

public interface KlassenService {

    List<Klasse> getAllKlassen();

    Klasse saveKlasse(Klasse klasse);

    Klasse updateKlasse(Klasse klasse);

    Klasse getKlasseById(Long id);

    void deleteKlasseById(Long id);

}
