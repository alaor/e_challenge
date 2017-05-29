package com.eteg.app.service;

import com.eteg.app.dao.MedicamentoDao;
import com.eteg.app.model.Medicamento;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by alaor on 29/05/17.
 */
@Service("medicamentoService")
public class MedicamentoServiceImpl implements MedicamentoService {

    @Autowired
    private MedicamentoDao medicamentoDao;

    @Override
    public Medicamento findById(Long id) {
        return medicamentoDao.findOne(id);
    }

    @Override
    public List<Medicamento> findAllMedicamentos() {
        return medicamentoDao.findAll();
    }

    @Override
    @Transactional
    public void save(Medicamento medicamento) {
        medicamentoDao.save(medicamento);
    }

    @Override
    public void delete(Long id) {
        medicamentoDao.delete(id);
    }
}
