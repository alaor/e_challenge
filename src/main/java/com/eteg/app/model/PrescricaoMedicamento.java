package com.eteg.app.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;

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
    private Long id;

    @Column(name = "frequencia")
    private Integer frequencia;

    @Column(name = "dose")
    private String dose;

    @ManyToOne
    @JoinColumn(name = "medicamento_id")
    private Medicamento medicamento;

    @ManyToOne
    @JoinColumn(name = "prescricao_id")
    @JsonManagedReference
    private Prescricao prescricao;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public Prescricao getPrescricao() {
        return prescricao;
    }

    public void setPrescricao(Prescricao prescricao) {
        this.prescricao = prescricao;
    }
}

