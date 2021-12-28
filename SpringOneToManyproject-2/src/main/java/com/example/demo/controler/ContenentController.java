package com.example.demo.controler;

import java.util.List;
import com.example.demo.entity.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.repository.ContinentRepository;

@RestController
public class ContenentController {
    @Autowired
    private ContinentRepository continentRepository;
 
    @GetMapping("/continent")
    public List<Continent> getAllContinent() {
        return continentRepository.findAll();
    }
 
    @PostMapping("/continent/blank")
    public Continent addBlankContinent() {
        return continentRepository.save(new Continent());
    }
 
    @PostMapping("/continent")
    public Continent addNewContinent(@RequestBody Continent continent) {
        return continentRepository.save(continent);
    }
 
    @PutMapping("/continent")
    public Continent updateContinent(@RequestBody Continent continent) {
        return continentRepository.save(continent);
    }
 
    @DeleteMapping("/continent")
    public String deleteContinent(@RequestBody Continent continent) {
        continentRepository.save(continent);
        return "Deleted Successfully";
    }

}
