/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpr.irati.modelo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Marina
 */
@Entity(name = "horario")
public class Horario implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idHorario;

    @Temporal(TemporalType.DATE)
    private Date horaInicio;

    @Temporal(TemporalType.DATE)
    private Date horaTermino;

    @Column(name = "diaSemana", nullable = false, length = 15)
    private String diaSemana;

    public Horario() {

        idHorario = 0;
        horaInicio = new Date();
        horaTermino = new Date();
        diaSemana = "";
    }

    public Horario(int idHorario, Date horaInicio, Date horaTermino, String diaSemana) {
        this.idHorario = idHorario;
        this.horaInicio = horaInicio;
        this.horaTermino = horaTermino;
        this.diaSemana = diaSemana;
    }

    public int calcularCargaHoraria(){
        
        return 0;
      // rever isso
       
    }
    
    public int getIdHorario() {
        return idHorario;
    }

    public void setIdHorario(int idHorario) {
        this.idHorario = idHorario;
    }

    public Date getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(Date horaInicio) {
        this.horaInicio = horaInicio;
    }

    public Date getHoraTermino() {
        return horaTermino;
    }

    public void setHoraTermino(Date horaTermino) {
        this.horaTermino = horaTermino;
    }

    public String getDiaSemana() {
        return diaSemana;
    }

    public void setDiaSemana(String diaSemana) {
        this.diaSemana = diaSemana;
    }
}
