package com.murilonerdx.santander.resources;

import com.murilonerdx.santander.model.JornadaTrabalho;
import com.murilonerdx.santander.services.JornadaTrabalhoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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
        JornadaTrabalho jornada = service.save(jornadaTrabalho);
        return ResponseEntity.ok().body(jornada);
    }

    @GetMapping("/jornadas")
    public ResponseEntity<List<JornadaTrabalho>> getAllJornadas(){
        List<JornadaTrabalho> jornadas = service.getAll();
        return ResponseEntity.ok().body(jornadas);
    }

    @GetMapping("{id}")
    public ResponseEntity<JornadaTrabalho> getJornadaById(@PathVariable("id") Long id){
        JornadaTrabalho jornada = service.findById(id);
        return ResponseEntity.ok().body(jornada);
    }
}
