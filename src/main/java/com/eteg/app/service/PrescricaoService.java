package com.eteg.app.service;

import com.eteg.app.model.Prescricao;

import java.util.List;

/**
 * Created by alaor on 29/05/17.
 */
public interface PrescricaoService {

    Prescricao findById(Long id);

    List<Prescricao> findAllPrescricoes();

    void save(Prescricao prescricao);

    void delete(Long id);

}
