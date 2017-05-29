package com.eteg.app.controller;

import com.eteg.app.model.Paciente;
import com.eteg.app.service.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Created by alaor on 29/05/17.
 */
@RestController
@RequestMapping("/paciente")
public class PacienteController {

    @Autowired
    private PacienteService pacienteService;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity getPacientes() {
        return new ResponseEntity(pacienteService.findAllPacientes(), HttpStatus.OK);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity getPacienteByid(@PathVariable Long id) {
        Paciente paciente = pacienteService.findById(id);
        return new ResponseEntity(paciente, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.POST,
            consumes = {MediaType.APPLICATION_FORM_URLENCODED_VALUE, MediaType.APPLICATION_JSON_UTF8_VALUE, MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity save(Paciente paciente) {
        pacienteService.save(paciente);
        return new ResponseEntity(paciente, HttpStatus.OK);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public ResponseEntity delete(@PathVariable Long id) {
        pacienteService.delete(id);
        return new ResponseEntity(id, HttpStatus.OK);
    }

}
