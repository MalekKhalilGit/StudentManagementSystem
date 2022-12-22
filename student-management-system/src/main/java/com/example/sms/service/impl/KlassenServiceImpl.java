package com.example.sms.service.impl;

import com.example.sms.entity.Klasse;
import com.example.sms.repository.KlassenRepository;
import com.example.sms.service.KlassenService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KlassenServiceImpl implements KlassenService {

    private KlassenRepository klassenRepository;

    public KlassenServiceImpl(KlassenRepository klassenRepository){
        super();
        this.klassenRepository = klassenRepository;
    }

    @Override
    public List<Klasse> getAllKlassen() {return klassenRepository.findAll();}

    @Override
    public Klasse saveKlasse(Klasse klasse) {return klassenRepository.save(klasse);}

    @Override
    public Klasse updateKlasse(Klasse klasse) {
        return klassenRepository.save(klasse);
    }

    @Override
    public Klasse getKlasseById(Long id) {
        return klassenRepository.findById(id).get();
    }

    @Override
    public void deleteKlasseById(Long id) {klassenRepository.deleteById(id);}
}
