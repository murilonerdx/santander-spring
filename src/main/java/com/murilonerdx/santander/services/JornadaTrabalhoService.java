package com.murilonerdx.santander.services;

import com.murilonerdx.santander.model.JornadaTrabalho;
import com.murilonerdx.santander.repositories.JornadaTrabalhoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JornadaTrabalhoService {

    @Autowired
    public JornadaTrabalhoRepository repository;


    public JornadaTrabalho saveJornada(JornadaTrabalho jornada){
        return repository.save(jornada);
    }
}
