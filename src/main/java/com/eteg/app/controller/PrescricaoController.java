package com.eteg.app.controller;

import com.eteg.app.model.Prescricao;
import com.eteg.app.service.PrescricaoService;
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
@RequestMapping("/prescricao")
public class PrescricaoController {

    @Autowired
    private PrescricaoService prescricaoService;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity getPrescricaoMedicamentos() {
        return new ResponseEntity(prescricaoService.findAllPrescricoes(), HttpStatus.OK);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity getPrescricaoById(@PathVariable Long id) {
        Prescricao prescricao = prescricaoService.findById(id);
        return new ResponseEntity(prescricao, HttpStatus.OK);
    }

    @RequestMapping(value = "/{id}/medicamentos", method = RequestMethod.GET)
    public ResponseEntity getMedicamentosPrescricao(@PathVariable Long id) {
        Prescricao p = prescricaoService.findById(id);
        return new ResponseEntity(p.getMedicamentos(), HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.POST,
            consumes = {MediaType.APPLICATION_FORM_URLENCODED_VALUE, MediaType.APPLICATION_JSON_UTF8_VALUE, MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity save(Prescricao prescricao) {
        prescricaoService.save(prescricao);
        return new ResponseEntity(prescricao, HttpStatus.OK);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public ResponseEntity delete(@PathVariable Long id) {
        prescricaoService.delete(id);
        return new ResponseEntity(id, HttpStatus.OK);
    }

}
