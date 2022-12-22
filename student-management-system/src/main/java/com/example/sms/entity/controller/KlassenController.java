package com.example.sms.entity.controller;

import com.example.sms.entity.Klasse;
import com.example.sms.service.KlassenService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class KlassenController {

    private KlassenService klassenService;

    public KlassenController(KlassenService klassenService) {
        super();
        this.klassenService = klassenService;
    }

    @GetMapping("/klassen")
    public String listClasses(Model model){
        model.addAttribute("klassen", klassenService.getAllKlassen());
        return "klassen";
    }


    @GetMapping("/klassen/new")
    public String createStudentForm(Model model){
        Klasse klasse = new Klasse();        //create klassen obj to hold klassen data
        model.addAttribute("klasse", klasse);
        return "create_klasse";
    }
    @PostMapping("/klassen")
    public String saveKlasse(@ModelAttribute("klasse") Klasse klasse){
        klassenService.saveKlasse(klasse);
        return "redirect:/klassen";
    }


    @GetMapping("/klassen/edit/{id}")
    public String editKlassenForm(@PathVariable Long id, Model model){
        model.addAttribute("klasse", klassenService.getKlasseById(id));
        return "edit_klasse";
    }

    @PostMapping("/klassen/{id}")
    public String updateKlasse(@PathVariable Long id, @ModelAttribute("klasse") Klasse klasse, Model model){
        //get Klasse form db by Id
        Klasse existingKlasse = klassenService.getKlasseById(id);
        existingKlasse.setId(id);
        existingKlasse.setStudentKlasseNumber(klasse.getStudentKlasseNumber());
        existingKlasse.setKlasseName(klasse.getKlasseName());

        //save updated student obj
        klassenService.updateKlasse(existingKlasse);
        return "redirect:/students";
    }

    //handler methode to handle delete request
    @GetMapping("/klasse/{id}")
    public String deleteKlasseById(@PathVariable Long id) {
        klassenService.deleteKlasseById(id);
        return "redirect:/klassen";
    }
}