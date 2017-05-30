package com.eteg.app.service;

import com.eteg.app.dao.PrescricaoDao;
import com.eteg.app.model.Prescricao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by alaor on 29/05/17.
 */
@Service("prescricaoService")
public class PrescricaoServiceImpl implements PrescricaoService {

    @Autowired
    private PrescricaoDao prescricaoDao;

    @Override
    public Prescricao findById(Long id) {
        return prescricaoDao.findOne(id);
    }

    @Override
    public List<Prescricao> findAllPrescricoes() {
        return prescricaoDao.findAll();
    }

    @Override
    public void save(Prescricao prescricao) {
        prescricaoDao.save(prescricao);
    }

    @Override
    public void delete(Long id) {
        prescricaoDao.delete(id);
    }
}
