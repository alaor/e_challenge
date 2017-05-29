package com.eteg.app.service;

import com.eteg.app.model.PrescricaoMedicamento;

import java.util.List;

/**
 * Created by alaor on 29/05/17.
 */
public interface PrescricaoMedicamentoService {

    PrescricaoMedicamento findById(Long id);

    List<PrescricaoMedicamento> findAllPrescricoesMedicamentos();

    void save(PrescricaoMedicamento prescricaoMedicamento);

    void delete(Long id);

}
