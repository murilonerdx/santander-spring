package com.murilonerdx.santander.resources;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.murilonerdx.santander.model.JornadaTrabalho;
import com.murilonerdx.santander.services.JornadaTrabalhoService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/jornada")
public class JornadaTrabalhoResource {

    public final JornadaTrabalhoService service;

    @Autowired
    public JornadaTrabalhoResource(JornadaTrabalhoService service) {
        this.service = service;
    }

    @ApiOperation(value="Return one Jornada, and insert")
    @ApiResponses(value={
            @ApiResponse(code=200, message="Success method return")
    })
    @PostMapping(produces=MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<JornadaTrabalho> createJornada(@RequestBody JornadaTrabalho jornadaTrabalho) {
        JornadaTrabalho jornada = service.save(jornadaTrabalho);
        return ResponseEntity.ok().body(jornada);
    }

    @ApiOperation(value="Return all jornadas")
    @ApiResponses(value={
            @ApiResponse(code=200, message="Success method return")
    })
    @GetMapping("/jornadas")
    public ResponseEntity<List<JornadaTrabalho>> getAllJornadas() {
        List<JornadaTrabalho> jornadas = service.getAll();
        return ResponseEntity.ok().body(jornadas);
    }

    @ApiOperation(value="Get one id jornada")
    @ApiResponses(value={
            @ApiResponse(code=200, message="Success method return")
    })
    @GetMapping("/{id}")
    public ResponseEntity<JornadaTrabalho> getJornadaById(@PathVariable("id") Long id) throws Exception {
        JornadaTrabalho jornada = service.findById(id);
        return ResponseEntity.ok().body(jornada);
    }

    @ApiOperation(value="Update jornada")
    @ApiResponses(value={
            @ApiResponse(code=200, message="Success method return")
    })

    @PutMapping("/{id}")
    public ResponseEntity<JornadaTrabalho> updateJornada(@RequestBody JornadaTrabalho jornadaTrabalho) {
        JornadaTrabalho updateJornada = service.update(jornadaTrabalho);
        return ResponseEntity.ok().body(updateJornada);
    }

    @ApiOperation(value="delete jornada by id")
    @ApiResponses(value={
            @ApiResponse(code=200, message="Success method return")
    })
    @DeleteMapping("/{id}")
    public ResponseEntity<JornadaTrabalho> deleteJornada(@PathVariable("id") Long id){
        service.delete(id);
        return ResponseEntity.noContent().build();
    }


}
