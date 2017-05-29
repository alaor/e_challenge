package com.eteg.app.service;

import com.eteg.app.model.Paciente;

import java.util.List;

/**
 * Created by alaor on 26/05/17.
 */
public interface PacienteService {

    Paciente findById(Long id);

    List<Paciente> findAllPacientes();

    void save(Paciente paciente);

    void delete(Long id);

}
