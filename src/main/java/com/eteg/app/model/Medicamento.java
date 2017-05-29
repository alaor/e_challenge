package com.eteg.app.model;

import javax.persistence.*;

/**
 * Created by alaor on 26/05/17.
 */

@Entity
@Table(name="medicamento")
public class Medicamento {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome")
    private String nome;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
