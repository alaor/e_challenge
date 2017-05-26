package com.eteg.app.dao;

import com.eteg.app.model.Paciente;

import java.util.List;

/**
 * Created by alaor on 26/05/17.
 */
public interface PacienteDao {

    Paciente findById(Integer id);

    Paciente findByName(String name);

    List<Paciente> findAllPacientes();

    void save(Paciente p);

    void updatePaciente(Paciente p);

    void deleteById(Integer id);
}
