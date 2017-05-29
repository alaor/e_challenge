package com.eteg.app.controller;

import com.eteg.app.model.Medicamento;
import com.eteg.app.model.Paciente;
import com.eteg.app.service.MedicamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by alaor on 29/05/17.
 */
@RestController
@RequestMapping("/medicamento")
public class MedicamentoController {

    @Autowired
    private MedicamentoService medicamentoService;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity getPacientes() {
        return new ResponseEntity(medicamentoService.findAllMedicamentos(), HttpStatus.OK);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity getPacienteByid(@PathVariable Long id) {
        Medicamento medicamento = medicamentoService.findById(id);
        return new ResponseEntity(medicamento, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.POST,
            consumes = {MediaType.APPLICATION_FORM_URLENCODED_VALUE, MediaType.APPLICATION_JSON_UTF8_VALUE, MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity save(Medicamento medicamento) {
        medicamentoService.save(medicamento);
        return new ResponseEntity(medicamento, HttpStatus.OK);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public ResponseEntity delete(@PathVariable Long id) {
        medicamentoService.delete(id);
        return new ResponseEntity(id, HttpStatus.OK);
    }

}
