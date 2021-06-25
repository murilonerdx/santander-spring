package com.murilonerdx.santander.resources;

import com.murilonerdx.santander.model.JornadaTrabalho;
import com.murilonerdx.santander.services.JornadaTrabalhoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/jornada")
public class JornadaTrabalhoResource {

    public final JornadaTrabalhoService service;

    @Autowired
    public JornadaTrabalhoResource(JornadaTrabalhoService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<JornadaTrabalho> createJornada(@RequestBody JornadaTrabalho jornadaTrabalho){
        JornadaTrabalho jornada = service.saveJornada(jornadaTrabalho);
        return ResponseEntity.ok().body(jornada);
    }
}
