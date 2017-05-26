package com.eteg.app.model;

import org.hibernate.annotations.*;
import org.hibernate.annotations.CascadeType;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;
import java.util.List;

/**
 * Created by alaor on 26/05/17.
 */
@Entity
@Table(name="prescricao")
public class Prescricao {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "data")
    private Date data;

    @ManyToOne
    @JoinColumns({
            @JoinColumn(name = "id_paciente", referencedColumnName = "id")
    })
    private Paciente paciente;

    @OneToMany(mappedBy = "medicamento", orphanRemoval = true)
    @NotFound(action = NotFoundAction.IGNORE)
    @Cascade({CascadeType.ALL})
    private List<PrescricaoMedicamento> medicamentos;
}
