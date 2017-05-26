package com.eteg.app.dao;

import com.eteg.app.model.Paciente;
import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by alaor on 26/05/17.
 */
@Repository("pacienteDao")
public class PacienteDaoImpl extends AbstractDao<Integer, Paciente> implements PacienteDao {

    @Override
    public Paciente findById(Integer id) {
        Paciente paciente = getByKey(id);
        return paciente != null ? paciente : null;
    }

    @Override
    public Paciente findByName(String nome) {
        Criteria crit = createEntityCriteria();
        crit.add(Restrictions.eq("nome", nome));
        Paciente paciente = (Paciente) crit.uniqueResult();
        return paciente != null ? paciente : null;
    }

    @Override
    public List<Paciente> findAllPacientes() {
        Criteria criteria = createEntityCriteria().addOrder(Order.asc("nome"));
        criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);//To avoid duplicates.
        List<Paciente> pacientes = (List<Paciente>) criteria.list();
        return pacientes;
    }

    @Override
    public void save(Paciente p) {
        persist(p);
    }

    @Override
    public void updatePaciente(Paciente p) {
        update(p);
    }

    @Override
    public void deleteById(Integer id) {
        Criteria crit = createEntityCriteria();
        crit.add(Restrictions.eq("id", id));
        Paciente paciente = (Paciente)crit.uniqueResult();
        delete(paciente);
    }

}
