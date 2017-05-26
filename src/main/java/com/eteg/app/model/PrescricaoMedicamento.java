package com.eteg.app.model;

import javax.persistence.*;

/**
 * Created by alaor on 26/05/17.
 */
@Entity
@Table(name = "prescricao_medicamento")
public class PrescricaoMedicamento {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "frequencia")
    private Integer frequencia;

    @Column(name = "dose")
    private String dose;

    @ManyToOne
    @JoinColumns({
        @JoinColumn(name = "id_medicamento", referencedColumnName = "id")
    })
    private Medicamento medicamento;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getFrequencia() {
        return frequencia;
    }

    public void setFrequencia(Integer frequencia) {
        this.frequencia = frequencia;
    }

    public String getDose() {
        return dose;
    }

    public void setDose(String dose) {
        this.dose = dose;
    }

    public Medicamento getMedicamento() {
        return medicamento;
    }

    public void setMedicamento(Medicamento medicamento) {
        this.medicamento = medicamento;
    }
}

