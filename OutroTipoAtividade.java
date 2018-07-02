/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpr.irati.modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author Marina
 */
@Entity(name = "outrotipoatividade")
public class OutroTipoAtividade implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idOutroTipoAtividade;

    @Column(name = "periodicidade", nullable = false, length = 20)
    private String periodicidade;

    @OneToMany
    private List<Horario> horarios;

    public OutroTipoAtividade() {
        this.idOutroTipoAtividade = 0;
        this.periodicidade = "";
        this.horarios = new ArrayList<>();
    }

    public OutroTipoAtividade(int idOutroTipoAtividade, String periodicidade, List<Horario> horarios) {
        this.idOutroTipoAtividade = idOutroTipoAtividade;
        this.periodicidade = periodicidade;
        this.horarios = horarios;
    }

    public int getIdOutroTipoAtividade() {
        return idOutroTipoAtividade;
    }

    public void setIdOutroTipoAtividade(int idOutroTipoAtividade) {
        this.idOutroTipoAtividade = idOutroTipoAtividade;
    }

    public String getPeriodicidade() {
        return periodicidade;
    }

    public void setPeriodicidade(String periodicidade) {
        this.periodicidade = periodicidade;
    }

    public List<Horario> getHorarios() {
        return horarios;
    }

    public void setHorarios(List<Horario> horarios) {
        this.horarios = horarios;
    }
}
