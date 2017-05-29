package com.eteg.app.dao;

import com.eteg.app.model.PrescricaoMedicamento;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by alaor on 29/05/17.
 */
public interface PrescricaoMedicamentoDao extends JpaRepository<PrescricaoMedicamento, Long> {
    
}
