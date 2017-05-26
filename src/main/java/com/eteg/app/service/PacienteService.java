package com.eteg.app.service;

import com.eteg.app.model.Paciente;

import java.util.List;

/**
 * Created by alaor on 26/05/17.
 */
public interface PacienteService {

    Paciente findById(Integer id);

    List<Paciente> findAllPersons();

    void save(Paciente paciente);

    void update(Paciente paciente);

    void delete(Integer id);

}
