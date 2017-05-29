package com.eteg.app.service;

import com.eteg.app.model.Medicamento;

import java.util.List;

/**
 * Created by alaor on 29/05/17.
 */
public interface MedicamentoService {

    Medicamento findById(Long id);

    List<Medicamento> findAllMedicamentos();

    void save(Medicamento medicamento);

    void delete(Long id);

}
