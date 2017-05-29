package com.eteg.app.dao;

import com.eteg.app.model.Medicamento;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by alaor on 29/05/17.
 */
public interface MedicamentoDao extends JpaRepository<Medicamento, Long> {

}
