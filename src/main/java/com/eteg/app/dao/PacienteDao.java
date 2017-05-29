package com.eteg.app.dao;

import com.eteg.app.model.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by alaor on 26/05/17.
 */
public interface PacienteDao extends JpaRepository<Paciente, Long> {

}
