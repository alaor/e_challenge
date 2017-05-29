package com.eteg.app.service;

import com.eteg.app.dao.PacienteDao;
import com.eteg.app.model.Paciente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by alaor on 26/05/17.
 */
@Service("pacienteService")
public class PacienteServiceImpl implements PacienteService {

    @Autowired
    private PacienteDao pacienteDao;

    @Override
    public Paciente findById(Long id) {
        return pacienteDao.findOne(id);
    }

    @Override
    public List<Paciente> findAllPacientes() {
        return pacienteDao.findAll();
    }

    @Override
    @Transactional
    public void save(Paciente paciente) {
        pacienteDao.save(paciente);
    }

    @Override
    public void delete(Long id) {
        pacienteDao.delete(id);
    }
}
