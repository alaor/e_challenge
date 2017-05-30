package com.eteg.app.controller;

import com.eteg.app.model.Medicamento;
import com.eteg.app.model.PrescricaoMedicamento;
import com.eteg.app.service.PrescricaoMedicamentoService;
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
@RequestMapping("/prescricaoMedicamento")
public class PrescricaoMedicamentoController {

    @Autowired
    private PrescricaoMedicamentoService prescricaoMedicamentoService;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity getPrescricaoMedicamentos() {
        return new ResponseEntity(prescricaoMedicamentoService.findAllPrescricoesMedicamentos(), HttpStatus.OK);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity getPrescricaoMedicamentoById(@PathVariable Long id) {
        PrescricaoMedicamento prescricaoMedicamento = prescricaoMedicamentoService.findById(id);
        return new ResponseEntity(prescricaoMedicamento, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.POST,
            consumes = {MediaType.APPLICATION_FORM_URLENCODED_VALUE, MediaType.APPLICATION_JSON_UTF8_VALUE, MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity save(PrescricaoMedicamento prescricaoMedicamento) {
        prescricaoMedicamentoService.save(prescricaoMedicamento);
        return new ResponseEntity(prescricaoMedicamento, HttpStatus.OK);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public ResponseEntity delete(@PathVariable Long id) {
        prescricaoMedicamentoService.delete(id);
        return new ResponseEntity(id, HttpStatus.OK);
    }

}
