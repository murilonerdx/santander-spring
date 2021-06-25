package com.murilonerdx.santander.services;

import com.murilonerdx.santander.model.JornadaTrabalho;
import com.murilonerdx.santander.repositories.JornadaTrabalhoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JornadaTrabalhoService {

    @Autowired
    public JornadaTrabalhoRepository repository;


    public JornadaTrabalho save(JornadaTrabalho jornada) {
        return repository.save(jornada);
    }

    public List<JornadaTrabalho> getAll() {
        return repository.findAll();
    }

    public JornadaTrabalho findById(Long id) throws Exception {
        try {
            Optional<JornadaTrabalho> jornada = repository.findById(id);
            return jornada.get();
        } catch (Exception e) {
            throw new Exception("Jornada com id " + id + " não encontrado");
        }
    }

    public JornadaTrabalho update(JornadaTrabalho jornadaTrabalho){
        return repository.save(jornadaTrabalho);
    }

    public void delete(Long id){
        repository.deleteById(id);
    }
}
