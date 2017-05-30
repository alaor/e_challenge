package com.eteg.app.service;

import com.eteg.app.dao.PrescricaoMedicamentoDao;
import com.eteg.app.model.PrescricaoMedicamento;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by alaor on 29/05/17.
 */
@Service("prescricaoMedicamentoService")
public class PrescricaoMedicamentoServiceImpl implements PrescricaoMedicamentoService {

    @Autowired
    private PrescricaoMedicamentoDao prescricaoMedicamentoDao;

    @Override
    public PrescricaoMedicamento findById(Long id) {
        return prescricaoMedicamentoDao.findOne(id);
    }

    @Override
    public List<PrescricaoMedicamento> findAllPrescricoesMedicamentos() {
        return prescricaoMedicamentoDao.findAll();
    }

    @Override
    public void save(PrescricaoMedicamento prescricaoMedicamento) {
        prescricaoMedicamentoDao.save(prescricaoMedicamento);
    }

    @Override
    public void delete(Long id) {
        prescricaoMedicamentoDao.delete(id);
    }
}
