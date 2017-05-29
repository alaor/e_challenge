package com.eteg.app.dao;

import com.eteg.app.model.Prescricao;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by alaor on 29/05/17.
 */
public interface PrescricaoDao extends JpaRepository<Prescricao, Long> {

}
