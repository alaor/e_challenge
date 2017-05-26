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
@Transactional
public class PacienteServiceImpl implements PacienteService {

    @Autowired
    private PacienteDao pacienteDao;

    @Override
    public Paciente findById(Integer id) {
        return pacienteDao.findById(id);
    }

    @Override
    public List<Paciente> findAllPersons() {
        return pacienteDao.findAllPacientes();
    }

    @Override
    public void save(Paciente paciente) {
        pacienteDao.save(paciente);
    }

    @Override
    public void update(Paciente paciente) {
        pacienteDao.updatePaciente(paciente);
    }

    @Override
    public void delete(Integer id) {
        pacienteDao.deleteById(id);
    }
}
